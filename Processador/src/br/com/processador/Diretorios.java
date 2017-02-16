package br.com.processador;

import java.io.File;
import java.util.ArrayList;

public class Diretorios 
{
	private Projeto projeto = new Projeto();
	private ArrayList<String> dirsSRC = new ArrayList<String>();
	private ArrayList<String> dirsDiversos = new ArrayList<String>();
	private ArrayList<String> dirsRes = new ArrayList<String>();
	private ArrayList<String> dirsValues = new ArrayList<String>();
	private ArrayList<String> dirsLayout = new ArrayList<String>();
	private ArrayList<String> dirsDrawable = new ArrayList<String>();
	private ArrayList<String> dirsTeste = new ArrayList<String>();
	private ArrayList<String> arqsAStudio = new ArrayList<String>();
	private ArrayList<String> arqsEclipse = new ArrayList<String>();
	

	public Projeto getProjeto() {
		return projeto;
	}
	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	public ArrayList<String> getDirsTeste() {
		return dirsTeste;
	}
	public void setDirsTeste(ArrayList<String> dirsTeste) {
		this.dirsTeste = dirsTeste;
	}
	public ArrayList<String> getDirsSRC() {
		return dirsSRC;
	}
	public void setDirsSRC(ArrayList<String> dirsSRC) {
		this.dirsSRC = dirsSRC;
	}
	public ArrayList<String> getDirsDiversos() {
		return dirsDiversos;
	}
	public void setDirsDiversos(ArrayList<String> dirsDiversos) {
		this.dirsDiversos = dirsDiversos;
	}
	public ArrayList<String> getDirsRes() {
		return dirsRes;
	}
	public void setDirsRes(ArrayList<String> dirsRes) {
		this.dirsRes = dirsRes;
	}


	public ArrayList<String> getDirsValues() {
		return dirsValues;
	}
	public void setDirsValues(ArrayList<String> dirsValues) {
		this.dirsValues = dirsValues;
	}
	public ArrayList<String> getDirsLayout() {
		return dirsLayout;
	}
	public void setDirsLayout(ArrayList<String> dirsLayout) {
		this.dirsLayout = dirsLayout;
	}
	public ArrayList<String> getDirsDrawable() {
		return dirsDrawable;
	}
	public void setDirsDrawable(ArrayList<String> dirsDrawable) {
		this.dirsDrawable = dirsDrawable;
	}
	public ArrayList<String> getArqsAStudio() {
		return arqsAStudio;
	}
	public void setArqsAStudio(ArrayList<String> arqsAStudio) {
		this.arqsAStudio = arqsAStudio;
	}
	public ArrayList<String> getArqsEclipse() {
		return arqsEclipse;
	}
	public void setArqsEclipse(ArrayList<String> arqsEclipse) {
		this.arqsEclipse = arqsEclipse;
	}
	
	/* MAPEAR DIRETORIOS
	 * --------------------------------------------*/
	public Diretorios mapearDirs(Projeto projeto)
	{
		Diretorios diretorios = new Diretorios();
		listarDirs(projeto.getCaminho());
		
		diretorios.setDirsTeste(dirsTeste);
		diretorios.setDirsSRC(dirsSRC);
		//diretorios.setDirsDiversos(dirsDiversos);
		diretorios.setDirsRes(dirsRes);
		diretorios.setDirsValues(dirsValues);
		diretorios.setDirsLayout(dirsLayout);
		diretorios.setDirsDrawable(dirsDrawable);
		diretorios.setArqsAStudio(arqsAStudio);
		diretorios.setArqsEclipse(arqsEclipse);
		diretorios.setProjeto(projeto);
		
		return diretorios;
	}
	
	/* DIRETORIOS DO SISTEMA (TESTE E PRODUCAO)
	 * --------------------------------------------*/	
	public void listarDirs(String caminho)
	{
		File fileRepositorio = new File(caminho);
		File[] listaArquivos = fileRepositorio.listFiles();
		
		String caminhoCompleto = "";
		
		for (int i = 0; i < listaArquivos.length; i++) 
		{

			if (listaArquivos[i].isDirectory()) 
			{
				caminhoCompleto = (caminho + "/" + listaArquivos[i].getName()).toLowerCase();
				//System.out.println(caminho + "/" + listaArquivos[i].getName());
				
				if (caminhoCompleto.contains("test")) 
				{
					//System.out.println(caminho + "/" + listaArquivos[i].getName());
					dirsTeste.add(caminho + "/" + listaArquivos[i].getName());
				} 
				//else if (caminhoCompleto.contains("/src"))
				//{
					//-dirsSRC.add(caminho + "/" + listaArquivos[i].getName());
					//System.out.println(caminho + "/" + listaArquivos[i].getName());
				//}
				else if (caminhoCompleto.contains("/res"))
				{
					if (caminhoCompleto.contains("/values"))
					{
						dirsValues.add(caminho + "/" + listaArquivos[i].getName());
					}
					else if (caminhoCompleto.contains("/layout"))
					{
						dirsLayout.add(caminho + "/" + listaArquivos[i].getName());
					}
					else if (caminhoCompleto.contains("/drawable"))
					{
						dirsDrawable.add(caminho + "/" + listaArquivos[i].getName());
					}
					else
					{
						dirsRes.add(caminho + "/" + listaArquivos[i].getName());
					}
				} 
				else
				{
					dirsSRC.add(caminho + "/" + listaArquivos[i].getName());
				}
				// NAVEGA RECURSIVAMENTE (SUBPASTAS DO PROJETO)
				listarDirs(caminho + "/" + listaArquivos[i].getName());
			}				
			else if (listaArquivos[i].getName().equals("build.gradle")) 
			{
				arqsAStudio.add(fileRepositorio + "/" + listaArquivos[i].getName());
			}
			else if (listaArquivos[i].getName().equals("org.eclipse.jdt.core.prefs")) 
			{
				arqsEclipse.add(fileRepositorio + "/" + listaArquivos[i].getName());
			}
		}
	}
	
}
