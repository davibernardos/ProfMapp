package br.com.processador;

import java.io.File;
import java.util.ArrayList;

public class Projeto 
{

	
	private String nome;
	private String caminho;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCaminho() {
		return caminho;
	}
	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

	
	public ArrayList<Projeto> listarProjetos(String repositorio){
		File fileRepositorio = new File(repositorio);
		File[] listaArquivos = fileRepositorio.listFiles();
		
		Projeto projeto = new Projeto();
		ArrayList<Projeto> listaDeProjetos = new ArrayList<Projeto>();

		for (int i = 0; i < listaArquivos.length; i++) {
			if (listaArquivos[i].isDirectory()) {
				projeto = new Projeto();
				projeto.setNome(listaArquivos[i].getName());
				projeto.setCaminho(fileRepositorio + "/" + listaArquivos[i].getName());
				listaDeProjetos.add(projeto);
			}
		}

		return listaDeProjetos;
	}
}
