package br.com.processador;

import java.util.Collections;

public class Principal {
	public static void main(String[] args) throws Exception {

		/* OBJETOS
		 * ---------------------------------------------------------------------*/
		Projeto projeto = new Projeto();
		Diretorios diretorios = new Diretorios();
		Arquivos arquivos = new Arquivos();
		Desafios desafios = new Desafios();
		Sensores sensores = new Sensores();
		Recursos recursos = new Recursos();
		Frameworks frameworks = new Frameworks();
		Configuracao configuracao = new Configuracao();
		Metricas metricas = new Metricas();
		Layouts layouts = new Layouts();
		
		Redator redator = new Redator();
		StringBuilder sbRelatorioFinal = new StringBuilder();
		StringBuilder sbRelatorioDesafios = new StringBuilder();
		StringBuilder sbCSV = new StringBuilder();
		StringBuilder log = new StringBuilder();

		
		/* VARIAVEIS
		 * ---------------------------------------------------------------------*/
		String repositorio = "/home/bernardo/Repositorio/";
		
		/* MAPEAR PROJETOS
		 * ---------------------------------------------------------------------*/
		for (Projeto p : projeto.listarProjetos(repositorio)) {
			log = new StringBuilder();
			//System.out.print(p.getNome());
			
			diretorios = new Diretorios();
			diretorios = diretorios.mapearDirs(p);
			
			arquivos = new Arquivos();
			arquivos = arquivos.mapearArqs(diretorios);
		
			desafios = new Desafios();
			desafios = desafios.mapearDesafios(arquivos);
			
			sensores = new Sensores();
			sensores = sensores.mapearSensores(arquivos);
			
			frameworks = new Frameworks();
			frameworks = frameworks.mapearFrameworks(arquivos);
			
			configuracao = new Configuracao();
			configuracao = configuracao.mapearConfiguracao(arquivos);
			
			recursos = new Recursos();
			recursos = recursos.mapearOtimizacao(diretorios);
			
			metricas = new Metricas();
			metricas = metricas.mapearMetricas(arquivos);
			
			layouts = new Layouts();
			layouts = layouts.mapearLayout(arquivos);
				
			sbCSV.append(redator.escreverCSV(arquivos, desafios, sensores, frameworks, configuracao, recursos, metricas, layouts));
			sbRelatorioFinal.append(redator.escreverRelatorio(arquivos, desafios, sensores, frameworks, configuracao, recursos, metricas, layouts));
			sbRelatorioDesafios.append(redator.escreverDesafios(desafios));
			log.append(redator.escreverLog(arquivos, desafios, sensores, frameworks, configuracao, recursos, metricas, layouts));
			redator.escrita(log, diretorios.getProjeto().getNome() + "_log.txt");
		}
		redator.escrita(sbCSV, "Relatorio.csv");
		redator.escrita(sbRelatorioFinal, "Relatorio_Final.txt");
		redator.escrita(sbRelatorioDesafios, "RelatorioDesafios.csv");

	}
}