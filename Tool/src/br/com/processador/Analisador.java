package br.com.processador;

import java.io.FileInputStream;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class Analisador extends VoidVisitorAdapter {
	private String encontradosEmMetodo = "";
	private String encontradosClasse = "";
	
	int contadorDeMetodos;

	public String getEncontrados() {
		return encontradosEmMetodo;
	}
	public void setEncontrados(String encontrados) {
		this.encontradosEmMetodo = encontrados;
	}
	public int getContadorDeMetodos() {
		return contadorDeMetodos;
	}
	public void setContadorDeMetodos(int contadorDeMetodos) {
		this.contadorDeMetodos = contadorDeMetodos;
	}

	/* MAPEAR CLASSES
	 * -----------------------------------------------*/
	public CompilationUnit mapearClasse(String caminho) throws Exception {
		FileInputStream inNomeClasse = new FileInputStream(caminho);
		//System.out.println(caminho);
		CompilationUnit cu;


		try {
			cu = JavaParser.parse(inNomeClasse);
		} finally {
			inNomeClasse.close();
		}
		encontradosClasse = caminho;
		return cu;
	}

	/* SENSORES - PROCURA NA ASSINATURA
	 * -----------------------------------------------*/
	public String visitarConteudo(CompilationUnit cuClasse, String listaDeSensores) {
		Utilitarios uti = new Utilitarios();
		String retorno = "";
		String sensoresEncontrados = "";
		
		for (String stSensor : listaDeSensores.toString().split(";")) {
			//System.out.println(stSensor);
			retorno = uti.buscaPalavra(cuClasse.toString(), stSensor);
			if (!retorno.equals("0")) {
				sensoresEncontrados += "\n- " + stSensor;
			}
		}
		return sensoresEncontrados;
	}

	/* DESAFIOS - PROCURA NO MÉTODO
	 * -----------------------------------------------*/
	@Override
	public void visit(MethodDeclaration nomeMetodo, Object arg) {
		Utilitarios uti = new Utilitarios();
		String retorno = "";
		
		for (String stDesafio : arg.toString().split(";")) {
			
			retorno = uti.buscaPalavra(nomeMetodo.getName(), stDesafio);
			if (!retorno.equals("0")) {
				encontradosEmMetodo += "\n!" + stDesafio.toLowerCase() + ";" + nomeMetodo.getName() + ";" + encontradosClasse + ";";
			}
			contadorDeMetodos++;
		}
	}
	
	/* FRAMEWORKS DE TESTE - PROCURA NOS IMPORTS
	 * -----------------------------------------------*/
	public StringBuilder listarImports(CompilationUnit m, String listaNegraDeImports) {
		StringBuilder sbSaida = new StringBuilder();
		
		for (String stImport : m.getImports().toString().split(";")) {
			stImport = stImport.replaceAll("\\[", "");
			stImport = stImport.replaceAll("]", "");
			stImport = stImport.replaceAll(", import ", "");
			stImport = stImport.replaceAll("import ", "");
			stImport = stImport.trim();
			boolean flag = true;

			if (!stImport.trim().equals("")) {
				for (String importNegro : listaNegraDeImports.toString().split(";")) {

					if (stImport.contains(importNegro)) {
						flag = false;
						break;
					}
				}
			}else{
				flag = false;
			}
			
			if (flag)
				sbSaida.append("\n;" + stImport );
		}
		return sbSaida;
	}
	
	/* FRAMEWORKS DE TESTE - PROCURA NOS PACOTES
	 * -----------------------------------------------*/
	public StringBuilder listarPacotes(CompilationUnit cuPacotes, String a, String listaNegraDeImports) {
		StringBuilder sbSaida = new StringBuilder();
		Redator redator = new Redator();
			
		if(redator.contaLinhasProducao(a, 0) > 0){
			try {
				for(String pacote : cuPacotes.getPackage().toString().split(";")) {
					boolean flag = true;
					
					if (!pacote.trim().equals("")){
						for (String importNegro : listaNegraDeImports.toString().split(";")) {
						
							if (pacote.contains(importNegro)) {
								flag = false;
								break;
							}
						}
					}else{
						flag = false;
					}
					
					if (flag)
						sbSaida.append("\n;" + pacote );
				}
			} catch (Exception e) {
				// TODO: handle exception
				// QUANDO NÃO TEM PACOTE RETORNA UMA EXCEPTION
			}

		}
		return sbSaida;
	}
	
	public double contadorDeLinhas(CompilationUnit cuArqsJava, double contador, String nome) {
		int linhasEmBranco = 0;
	
		for(String s : cuArqsJava.toString().split("\n")){
			if(s.trim().equals("")){
				linhasEmBranco++;
			}
		}
		contador += cuArqsJava.getEndLine() - cuArqsJava.getBeginLine() - cuArqsJava.getComments().size() - linhasEmBranco;
		return contador;
	} 

	/* APENAS TESTES COM JAVAPARSER
	 * -----------------------------------------------*/
	public void testes(CompilationUnit m) {
		// System.out.println(">>>> Comentarios: " + m.getComment());
		//System.out.println(">>>> Nós filhos: " + m.getChildrenNodes());
		System.out.println(">>>> Fim da linha: " + m.getEndLine());
		System.out.println(">>>> Dados: " + m.getData());
		System.out.println(">>>> Nós pais: " + m.getParentNode());
		System.out.println(">>>> Inicio da linha: " + m.getBeginLine());
		System.out.println(">>>> coletar tipos: " + m.getTypes().size());
		System.out.println(">>>> Inicio da coluna: " + m.getBeginColumn());
		System.out.println(">>>> Nós pais: " + m.getParentNode());

	}

}
