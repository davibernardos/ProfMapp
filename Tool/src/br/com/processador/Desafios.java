package br.com.processador;

import java.util.ArrayList;

public class Desafios {
	private Arquivos arquivos = new Arquivos();
	private String listaDeDesafios = "service;server;download;upload;connect;wifi;network;bluetooth;gui;performance;sensor;camera;microphone;accelerometer;ambient_temperature;gravity;gyroscope;light;linear_acceleration;magnetic_field;orientation;pressure;proximity;relative_humidity;rotation_vector;temperature;access_fine_location;access_coarse_location;gps;touch;screen;available;unvailable;config;setup;setting;onswipetouchlistener;ondoubletaplistener;onscalegesturelistener;shakelistener;ondraglistener;onscrolllistener";
	private ArrayList<String> desafiosSRC = new ArrayList<String>();
	private ArrayList<String> desafiosTeste = new ArrayList<String>();
	private ArrayList<String> contarDesafiosSRC = new ArrayList<String>();
	private ArrayList<String> contarDesafiosTeste = new ArrayList<String>();
	private String srcConnected = "0";
	private String srcGUI = "0";
	private String srcResources = "0";
	private String srcSensors = "0";
	private String srcMultiple = "0";
	private String testeConnected = "0";
	private String testeGUI = "0";
	private String testeResources = "0";
	private String testeSensors = "0";
	private String testeMultiple = "0";
	private int contadorDeMetodosSRC;
	private int contadorDeMetodosTeste;
	
	private String onswipetouchlistener = "-";
	private String ondoubletaplistener = "-";
	private String onscalegesturelistener = "-";
	private String shakelistener = "-";
	private String ondraglistener = "-";
	private String onscrolllistener = "-";
	
	
	public String getOnswipetouchlistener() {
		return onswipetouchlistener;
	}
	public void setOnswipetouchlistener(String onswipetouchlistener) {
		this.onswipetouchlistener = onswipetouchlistener;
	}
	public String getOndoubletaplistener() {
		return ondoubletaplistener;
	}
	public void setOndoubletaplistener(String ondoubletaplistener) {
		this.ondoubletaplistener = ondoubletaplistener;
	}
	public String getOnscalegesturelistener() {
		return onscalegesturelistener;
	}
	public void setOnscalegesturelistener(String onscalegesturelistener) {
		this.onscalegesturelistener = onscalegesturelistener;
	}
	public String getShakelistener() {
		return shakelistener;
	}
	public void setShakelistener(String shakelistener) {
		this.shakelistener = shakelistener;
	}
	public String getOndraglistener() {
		return ondraglistener;
	}
	public void setOndraglistener(String ondraglistener) {
		this.ondraglistener = ondraglistener;
	}
	public String getOnscrolllistener() {
		return onscrolllistener;
	}
	public void setOnscrolllistener(String onscrolllistener) {
		this.onscrolllistener = onscrolllistener;
	}
	public ArrayList<String> getContarDesafiosSRC() {
		return contarDesafiosSRC;
	}
	public void setContarDesafiosSRC(ArrayList<String> contarDesafiosSRC) {
		this.contarDesafiosSRC = contarDesafiosSRC;
	}
	public ArrayList<String> getContarDesafiosTeste() {
		return contarDesafiosTeste;
	}
	public void setContarDesafiosTeste(ArrayList<String> contarDesafiosTeste) {
		this.contarDesafiosTeste = contarDesafiosTeste;
	}
	public Arquivos getArquivos() {
		return arquivos;
	}
	public void setArquivos(Arquivos arquivos) {
		this.arquivos = arquivos;
	}
	public ArrayList<String> getDesafiosSRC() {
		return desafiosSRC;
	}
	public void setDesafiosSRC(ArrayList<String> desafiosSRC) {
		this.desafiosSRC = desafiosSRC;
	}
	public ArrayList<String> getDesafiosTeste() {
		return desafiosTeste;
	}
	public void setDesafiosTeste(ArrayList<String> desafiosTeste) {
		this.desafiosTeste = desafiosTeste;
	}
	public int getContadorDeMetodosSRC() {
		return contadorDeMetodosSRC;
	}
	public void setContadorDeMetodosSRC(int contadorDeMetodosSRC) {
		this.contadorDeMetodosSRC = contadorDeMetodosSRC;
	}
	public int getContadorDeMetodosTeste() {
		return contadorDeMetodosTeste;
	}
	public void setContadorDeMetodosTeste(int contadorDeMetodosTeste) {
		this.contadorDeMetodosTeste = contadorDeMetodosTeste;
	}
	public String getListaDeDesafios() {
		return listaDeDesafios;
	}
	public void setListaDeDesafios(String listaDeDesafios) {
		this.listaDeDesafios = listaDeDesafios;
	}
	public String getSrcConnected() {
		return srcConnected;
	}
	public void setSrcConnected(String srcConnected) {
		this.srcConnected = srcConnected;
	}
	public String getSrcGUI() {
		return srcGUI;
	}
	public void setSrcGUI(String srcGUI) {
		this.srcGUI = srcGUI;
	}
	public String getSrcResources() {
		return srcResources;
	}
	public void setSrcResources(String srcResources) {
		this.srcResources = srcResources;
	}
	public String getSrcSensors() {
		return srcSensors;
	}
	public void setSrcSensors(String srcSensors) {
		this.srcSensors = srcSensors;
	}
	public String getSrcMultiple() {
		return srcMultiple;
	}
	public void setSrcMultiple(String srcMultiple) {
		this.srcMultiple = srcMultiple;
	}
	public String getTesteConnected() {
		return testeConnected;
	}
	public void setTesteConnected(String testeConnected) {
		this.testeConnected = testeConnected;
	}
	public String getTesteGUI() {
		return testeGUI;
	}
	public void setTesteGUI(String testeGUI) {
		this.testeGUI = testeGUI;
	}
	public String getTesteResources() {
		return testeResources;
	}
	public void setTesteResources(String testeResources) {
		this.testeResources = testeResources;
	}
	public String getTesteSensors() {
		return testeSensors;
	}
	public void setTesteSensors(String testeSensors) {
		this.testeSensors = testeSensors;
	}
	public String getTesteMultiple() {
		return testeMultiple;
	}
	public void setTesteMultiple(String testeMultiple) {
		this.testeMultiple = testeMultiple;
	}
	
	public Desafios mapearDesafios(Arquivos arqs) throws Exception{
		Desafios desafios = new Desafios();
		Analisador analisador = new Analisador();
		Utilitarios uti = new Utilitarios();
		String retorno = "";
		String texto = "";

		for (String a : arqs.getArqsJavaSRC()){

			analisador.visit(analisador.mapearClasse(a), listaDeDesafios);
			retorno = analisador.getEncontrados();
			if(!retorno.equals("")){
				texto += retorno;
			}
			analisador.setEncontrados("");
		}
		contadorDeMetodosSRC = analisador.getContadorDeMetodos();
		desafiosSRC.add(uti.removeRepeticao(texto));
		contarDesafiosSRC = uti.contarPalavras(desafiosSRC, listaDeDesafios);
		analisador.setContadorDeMetodos(0);
		
		if (texto.contains("service") || texto.contains("server") || texto.contains("download") || texto.contains("upload") || texto.contains("connect") || texto.contains("wifi") || texto.contains("network") || texto.contains("bluetooth") || texto.contains("available") || texto.contains("unavailable"))
			desafios.setSrcConnected("1");
		if (texto.contains("gui") || texto.contains("swipetouchlistener") || texto.contains("ondoubletaplistener") || texto.contains("onscalegesturelistener") || texto.contains("shakelistener") || texto.contains("ondraglistener") || texto.contains("onscrolllistener"))
			desafios.setSrcGUI("1");
		if (texto.contains("performance"))
			desafios.setSrcResources("1");
		if (texto.contains("sensor") || texto.contains("microphone") || texto.contains("camera") || texto.contains("accelerometer") || texto.contains("ambient_temperature") || texto.contains("gravity") || texto.contains("gyroscope") || texto.contains("light") || texto.contains("linear_acceleration") || texto.contains("magnetic_field") || texto.contains("orientation") || texto.contains("pressure") || texto.contains("proximity") || texto.contains("relative_humidity") || texto.contains("rotation_vector") || texto.contains("temperature") || texto.contains("access_fine_location") || texto.contains("access_coarse_location") || texto.contains("gps"))
			desafios.setSrcSensors("1");
		if (texto.contains("touch") || texto.contains("screen")  || texto.contains("config")  || texto.contains("setup") || texto.contains("setting"))
			desafios.setSrcMultiple("1");
		
		// ESPECIFICO PARA Q2 - ELEMENTOS DE GUI
		if (texto.contains("onswipetouchlistener")) 
			desafios.setOnswipetouchlistener("1");
		if (texto.contains("ondoubletaplistener")) 
			desafios.setOndoubletaplistener("1");
		if (texto.contains("onscalegesturelistener")) 
			desafios.setOnscalegesturelistener("1");
		if (texto.contains("shakelistener")) 
			desafios.setShakelistener("1");
		if (texto.contains("ondraglistener")) 
			desafios.setOndraglistener("1");
		if (texto.contains("onscrolllistener"))
			desafios.setOnscrolllistener("1");
		
		texto = "";
		
		for (String a : arqs.getArqsJavaTeste()){
			analisador.visit(analisador.mapearClasse(a), listaDeDesafios);
			retorno = analisador.getEncontrados();
			if(!retorno.equals("")){
				texto += retorno;
				//System.out.println(retorno);
			}
			analisador.setEncontrados("");
		}
		contadorDeMetodosTeste = analisador.getContadorDeMetodos();
		//desafiosTeste.add(uti.removeRepeticao(texto));
		desafiosTeste.add(texto);
		contarDesafiosTeste = uti.contarPalavras(desafiosTeste, listaDeDesafios);
			
		if (texto.contains("service") || texto.contains("server") || texto.contains("download") || texto.contains("upload") || texto.contains("connect") || texto.contains("wifi") || texto.contains("network") || texto.contains("bluetooth") || texto.contains("available") || texto.contains("unavailable"))
			desafios.setTesteConnected("1");
		if (texto.contains("gui") || texto.contains("onswipetouchlistener") || texto.contains("ondoubletaplistener") || texto.contains("onscalegesturelistener") || texto.contains("shakelistener") || texto.contains("ondraglistener") || texto.contains("onscrolllistener"))
			desafios.setTesteGUI("1");
		if (texto.contains("performance"))
			desafios.setTesteResources("1");
		if (texto.contains("sensor") || texto.contains("microphone") || texto.contains("camera") || texto.contains("accelerometer") || texto.contains("ambient_temperature") || texto.contains("gravity") || texto.contains("gyroscope") || texto.contains("light") || texto.contains("linear_acceleration") || texto.contains("magnetic_field") || texto.contains("orientation") || texto.contains("pressure") || texto.contains("proximity") || texto.contains("relative_humidity") || texto.contains("rotation_vector") || texto.contains("temperature") || texto.contains("access_fine_location") || texto.contains("access_coarse_location") || texto.contains("gps"))
			desafios.setTesteSensors("1");
		if (texto.contains("touch") || texto.contains("screen")  || texto.contains("config")  || texto.contains("setup") || texto.contains("setting"))
			desafios.setTesteMultiple("1");
			
		desafios.setContadorDeMetodosSRC(contadorDeMetodosSRC);
		desafios.setContadorDeMetodosTeste(contadorDeMetodosTeste);
		desafios.setDesafiosSRC(desafiosSRC);
		desafios.setContarDesafiosSRC(contarDesafiosSRC);
		desafios.setDesafiosTeste(desafiosTeste);
		desafios.setContarDesafiosTeste(contarDesafiosTeste);
		desafios.setArquivos(arqs);
		return desafios;
	}	
}
