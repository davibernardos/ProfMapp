package br.com.processador;

import java.io.File;
import java.util.ArrayList;

/* CLASSE: REFERENTE AOS ARQUIVOS DO PROJETO
 * --------------------------------------------------*/
public class Arquivos {

	private Diretorios diretorios = new Diretorios();
	private int flag;
	private ArrayList<String> arqsManifesto = new ArrayList<String>();
	private ArrayList<String> arqsJavaSRC = new ArrayList<String>();
	private ArrayList<String> arqsJavaTeste = new ArrayList<String>();
	private ArrayList<String> arqsXML = new ArrayList<String>();
	private ArrayList<String> arqsValues = new ArrayList<String>();
	private ArrayList<String> arqsLayout = new ArrayList<String>();
	private ArrayList<String> arqsDrawable = new ArrayList<String>();
	private ArrayList<String> arqsDiversos = new ArrayList<String>();
	private ArrayList<String> arqsJS = new ArrayList<String>();
	private ArrayList<String> arqsHTML = new ArrayList<String>();
	private ArrayList<String> arqsCSS = new ArrayList<String>();
	private ArrayList<String> arqsH = new ArrayList<String>();
	private ArrayList<String> arqsC = new ArrayList<String>();
	private ArrayList<String> arqsCPP = new ArrayList<String>();
	private ArrayList<String> arqsRb = new ArrayList<String>();
	private ArrayList<String> arqsPy = new ArrayList<String>();
	private ArrayList<String> arqsScala = new ArrayList<String>();
	private ArrayList<String> dirsSRC = new ArrayList<String>();
	private ArrayList<String> dirsTeste = new ArrayList<String>();
	
	public ArrayList<String> getArqsManifesto() {
		return arqsManifesto;
	}
	public void setArqsManifesto(ArrayList<String> arqsManifesto) {
		this.arqsManifesto = arqsManifesto;
	}
	public Diretorios getDiretorio() {
		return diretorios;
	}
	public void setDiretorio(Diretorios diretorios) {
		this.diretorios = diretorios;
	}
	public ArrayList<String> getArqsJavaSRC() {
		return arqsJavaSRC;
	}

	public void setArqsJavaSRC(ArrayList<String> arqsJavaSRC) {
		this.arqsJavaSRC = arqsJavaSRC;
	}
	public ArrayList<String> getArqsJavaTeste() {
		return arqsJavaTeste;
	}
	public void setArqsJavaTeste(ArrayList<String> arqsJavaTeste) {
		this.arqsJavaTeste = arqsJavaTeste;
	}
	public ArrayList<String> getArqsXML() {
		return arqsXML;
	}
	public void setArqsXML(ArrayList<String> arqsXML) {
		this.arqsXML = arqsXML;
	}
	public ArrayList<String> getArqsDiversos() {
		return arqsDiversos;
	}
	public void setArqsDiversos(ArrayList<String> arqsDiversos) {
		this.arqsDiversos = arqsDiversos;
	}
	public ArrayList<String> getDirsSRC() {
		return dirsSRC;
	}
	public void setDirsSRC(ArrayList<String> dirsSRC) {
		this.dirsSRC = dirsSRC;
	}
	public ArrayList<String> getDirsTeste() {
		return dirsTeste;
	}
	public void setDirsTeste(ArrayList<String> dirsTeste) {
		this.dirsTeste = dirsTeste;
	}
	public ArrayList<String> getArqsValues() {
		return arqsValues;
	}
	public void setArqsValues(ArrayList<String> arqsValues) {
		this.arqsValues = arqsValues;
	}
	public ArrayList<String> getArqsLayout() {
		return arqsLayout;
	}
	public void setArqsLayout(ArrayList<String> arqsLayout) {
		this.arqsLayout = arqsLayout;
	}
	public ArrayList<String> getArqsDrawable() {
		return arqsDrawable;
	}
	public void setArqsDrawable(ArrayList<String> arqsDrawable) {
		this.arqsDrawable = arqsDrawable;
	}
	public Diretorios getDiretorios() {
		return diretorios;
	}
	public void setDiretorios(Diretorios diretorios) {
		this.diretorios = diretorios;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public ArrayList<String> getArqsJS() {
		return arqsJS;
	}
	public void setArqsJS(ArrayList<String> arqsJS) {
		this.arqsJS = arqsJS;
	}
	public ArrayList<String> getArqsHTML() {
		return arqsHTML;
	}
	public void setArqsHTML(ArrayList<String> arqsHTML) {
		this.arqsHTML = arqsHTML;
	}
	public ArrayList<String> getArqsCSS() {
		return arqsCSS;
	}
	public void setArqsCSS(ArrayList<String> arqsCSS) {
		this.arqsCSS = arqsCSS;
	}
	public ArrayList<String> getArqsH() {
		return arqsH;
	}
	public void setArqsH(ArrayList<String> arqsH) {
		this.arqsH = arqsH;
	}
	public ArrayList<String> getArqsC() {
		return arqsC;
	}
	public void setArqsC(ArrayList<String> arqsC) {
		this.arqsC = arqsC;
	}
	public ArrayList<String> getArqsCPP() {
		return arqsCPP;
	}
	public void setArqsCPP(ArrayList<String> arqsCPP) {
		this.arqsCPP = arqsCPP;
	}
	public ArrayList<String> getArqsRb() {
		return arqsRb;
	}
	public void setArqsRb(ArrayList<String> arqsRb) {
		this.arqsRb = arqsRb;
	}
	public ArrayList<String> getArqsPy() {
		return arqsPy;
	}
	public void setArqsPy(ArrayList<String> arqsPy) {
		this.arqsPy = arqsPy;
	}
	public ArrayList<String> getArqsScala() {
		return arqsScala;
	}
	public void setArqsScala(ArrayList<String> arqsScala) {
		this.arqsScala = arqsScala;
	}

	/* MAPEAR ARQUIVOS POR PROJETO
	 * ------------------------------------------*/
	public Arquivos mapearArqs(Diretorios dirs) {
		Arquivos arquivos = new Arquivos();	
		flag = 0;
		
		for (String d : dirs.getDirsSRC()){
			listarArqsSRC(d);
		}
		
		for (String d : dirs.getDirsValues()){
			listarArqsValues(d);
		}
		
		for (String d : dirs.getDirsLayout()){
			listarArqsLayout(d);
		}
		
		for (String d : dirs.getDirsDrawable()){
			listarArqsDrawable(d);
		}
		
		for (String d : dirs.getDirsTeste()){
			//System.out.println(d);
			listarArqsTeste(d);
		}
		
		// MANIFESTO QUE ESTIVER NA RAIZ DO SRC DEVERA TER PRIORIDADE -- NÃO ENCONTREI UMA FORMA DE FAZER ISSO
		// COLETAR TODOS OS MANIFESTS E ANALIZAR TODOS ELES
		for (String d : dirs.getDirsSRC()){
				listarManifesto(d);
		}
		
		listarManifesto(dirs.getProjeto().getCaminho());
		

		
		arquivos.setArqsJavaTeste(arqsJavaTeste);
		arquivos.setArqsJavaSRC(arqsJavaSRC);
		arquivos.setArqsXML(arqsXML);
		arquivos.setArqsValues(arqsValues);
		arquivos.setArqsLayout(arqsLayout);
		arquivos.setArqsDrawable(arqsDrawable);
		arquivos.setArqsManifesto(arqsManifesto);
		arquivos.setArqsDiversos(arqsDiversos);
		arquivos.setArqsJS(arqsJS);
		arquivos.setArqsHTML(arqsHTML);
		arquivos.setArqsCSS(arqsCSS);
		arquivos.setArqsH(arqsH);
		arquivos.setArqsC(arqsC);
		arquivos.setArqsCPP(arqsCPP);
		arquivos.setArqsRb(arqsRb);
		arquivos.setArqsPy(arqsPy);
		arquivos.setArqsScala(arqsScala);
		arquivos.setDirsTeste(dirsTeste);
		arquivos.setDirsSRC(dirsSRC);
		arquivos.setDiretorio(dirs);
		return arquivos;
	}
	
	/* LISTAR ARQUIVOS SRC
	 * ------------------------------------------*/
	public void listarArqsSRC(String caminho)
	{
		File fileRepositorio = new File(caminho);
		File[] listaArquivos = fileRepositorio.listFiles();
		
		for (int i = 0; i < listaArquivos.length; i++) 
		{
			if (listaArquivos[i].isFile()) 
			{
				if (listaArquivos[i].getName().toLowerCase().endsWith(".java")) 
				{
					arqsJavaSRC.add(fileRepositorio + "/" + listaArquivos[i].getName());
				}
				else if (listaArquivos[i].getName().toLowerCase().endsWith(".xml")) 
				{
					arqsXML.add(fileRepositorio + "/" + listaArquivos[i].getName());
				}
				else if (listaArquivos[i].getName().toLowerCase().endsWith(".js")) 
				{
					arqsJS.add(fileRepositorio + "/" + listaArquivos[i].getName());
				}
				else if (listaArquivos[i].getName().toLowerCase().endsWith(".html")) 
				{
					arqsHTML.add(fileRepositorio + "/" + listaArquivos[i].getName());
				}
				else if (listaArquivos[i].getName().toLowerCase().endsWith(".css")) 
				{
					arqsCSS.add(fileRepositorio + "/" + listaArquivos[i].getName());
				}
				else if (listaArquivos[i].getName().toLowerCase().endsWith(".h")) 
				{
					arqsH.add(fileRepositorio + "/" + listaArquivos[i].getName());
				}
				else if (listaArquivos[i].getName().toLowerCase().endsWith(".c")) 
				{
					arqsC.add(fileRepositorio + "/" + listaArquivos[i].getName());
				}
				else if (listaArquivos[i].getName().toLowerCase().endsWith(".cpp")) 
				{
					arqsCPP.add(fileRepositorio + "/" + listaArquivos[i].getName());
				}
				else if (listaArquivos[i].getName().toLowerCase().endsWith(".rb")) 
				{
					arqsRb.add(fileRepositorio + "/" + listaArquivos[i].getName());
				}
				else if (listaArquivos[i].getName().toLowerCase().endsWith(".py")) 
				{
					arqsPy.add(fileRepositorio + "/" + listaArquivos[i].getName());
				}
				else if (listaArquivos[i].getName().toLowerCase().endsWith(".scala")) 
				{
					arqsScala.add(fileRepositorio + "/" + listaArquivos[i].getName());
				}
				else 
				{
					// OUTROS ARQUIVOS (EX.: PNG, JAR, TXT)
					arqsDiversos.add(fileRepositorio + "/" + listaArquivos[i].getName());
				}
			} 	
		}
	}
	
	/* LISTAR ARQUIVOS TESTE
	 * ------------------------------------------*/
	public void listarArqsTeste(String caminho)
	{
		File fileRepositorio = new File(caminho);
		File[] listaArquivos = fileRepositorio.listFiles();
		
		for (int i = 0; i < listaArquivos.length; i++) {
			if (listaArquivos[i].isFile()) 
			{
				if (listaArquivos[i].getName().toLowerCase().endsWith(".java")) 
				{
					arqsJavaTeste.add(fileRepositorio + "/" + listaArquivos[i].getName());
					//System.out.println(fileRepositorio + "/" + listaArquivos[i].getName());
				}
				else if (listaArquivos[i].getName().toLowerCase().endsWith(".xml")) 
				{
					arqsXML.add(fileRepositorio + "/" + listaArquivos[i].getName());
				} 
				else 
				{
					// OUTROS ARQUIVOS (EX.: PNG, JAR, TXT)
					arqsDiversos.add(fileRepositorio + "/" + listaArquivos[i].getName());
				}
			} 	
		}
	}
	
	/*LISTAR ARQUIVO MANIFESTO
	 * --------------------------------------------*/
	public void listarManifesto(String caminho)
	{
		File fileRepositorio = new File(caminho);
		File[] listaArquivos = fileRepositorio.listFiles();
		
		for (int i = 0; i < listaArquivos.length; i++) 
		{
			if (listaArquivos[i].isFile())
			{
				if (listaArquivos[i].getName().equals("AndroidManifest.xml")){
					arqsManifesto.add(fileRepositorio + "/" +listaArquivos[i].getName());
					//flag = 1;
				} 
			}
		}
		//System.out.println("é esse: " + arqManifesto + " N. " +listaArquivos.length);
	}
	
	/*LISTAR ARQUIVOS DE INTERNACIONALIZAÇÃO
	 * --------------------------------------------*/
	public void listarArqsValues(String caminho)
	{
		File fileRepositorio = new File(caminho);
		File[] listaArquivos = fileRepositorio.listFiles();
		
		for (int i = 0; i < listaArquivos.length; i++) 
		{
			if (listaArquivos[i].isFile())
			{
				if (listaArquivos[i].getName().toLowerCase().endsWith(".xml")) 
				{
					arqsValues.add(fileRepositorio + "/" + listaArquivos[i].getName());
				} 
			}
		}
	}
	
	/*LISTAR ARQUIVOS DE LAYOUT
	 * --------------------------------------------*/
	public void listarArqsLayout(String caminho)
	{
		File fileRepositorio = new File(caminho);
		File[] listaArquivos = fileRepositorio.listFiles();
		for (int i = 0; i < listaArquivos.length; i++) 
		{
			if (listaArquivos[i].isFile())
			{
				if (listaArquivos[i].getName().toLowerCase().endsWith(".xml")) 
				{
					arqsLayout.add(fileRepositorio + "/" + listaArquivos[i].getName());
				} 
			}
		}
	}
	
	/*LISTAR ARQUIVOS DE IMAGENS E ETC
	 * --------------------------------------------*/
	public void listarArqsDrawable(String caminho)
	{
		File fileRepositorio = new File(caminho);
		File[] listaArquivos = fileRepositorio.listFiles();
		for (int i = 0; i < listaArquivos.length; i++) 
		{
			if (listaArquivos[i].isFile())
			{
				if (listaArquivos[i].getName().toLowerCase().endsWith(".xml")) 
				{
					arqsDrawable.add(fileRepositorio + "/" + listaArquivos[i].getName());
				} 
			}
		}
	}	
	
}
