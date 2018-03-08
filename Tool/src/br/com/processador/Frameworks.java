package br.com.processador;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class Frameworks {
	private Arquivos arquivos = new Arquivos();
	private String listaNegraDeImports = "util;json;android.database;android.net;android.graphics;android.text;android.view;android.content;android.widget;android.os;android.app;"; 
	private StringBuilder pacotesSRC = new StringBuilder();
	private StringBuilder pacotesTeste = new StringBuilder();
	private StringBuilder importsTeste = new StringBuilder();
	private StringBuilder frameworks = new StringBuilder();
	private String strobotium = "0";
	private String stjunit = "0";
	private String standroid = "0";
	private String stespresso = "0";
	private String sthamcrest = "0";
	private String strobolectric = "0";
	private String steasymock = "0";
	private String stfest = "0";
	private String stmock = "0";
	private String stmockito = "0";
	private String stroboguice = "0";
	private String stselenium = "0";
	private String stjersey = "0";
	private String stspongycastle = "0";
	private String stoutros = "0";
	private String sttestng = "0";
	private String stmonkeyrunner = "0";
	private String stjmeter = "0";
	private String stuiautomator = "0";
	private String stappium = "0";
	private String stselendroid = "0";
	
		
	public Arquivos getArquivos() {
		return arquivos;
	}
	public void setArquivos(Arquivos arquivos) {
		this.arquivos = arquivos;
	}
	public String getListaNegraDeImports() {
		return listaNegraDeImports;
	}
	public void setListaNegraDeImports(String listaNegraDeImports) {
		this.listaNegraDeImports = listaNegraDeImports;
	}
	public StringBuilder getPacotesSRC() {
		return pacotesSRC;
	}
	public void setPacotesSRC(StringBuilder pacotesSRC) {
		this.pacotesSRC = pacotesSRC;
	}
	public StringBuilder getPacotesTeste() {
		return pacotesTeste;
	}
	public void setPacotesTeste(StringBuilder pacotesTeste) {
		this.pacotesTeste = pacotesTeste;
	}
	public StringBuilder getImportsTeste() {
		return importsTeste;
	}
	public void setImportsTeste(StringBuilder importsTeste) {
		this.importsTeste = importsTeste;
	}
	public StringBuilder getFrameworks() {
		return frameworks;
	}
	public void setFrameworks(StringBuilder frameworks) {
		this.frameworks = frameworks;
	}
	public String getStrobotium() {
		return strobotium;
	}
	public void setStrobotium(String strobotium) {
		this.strobotium = strobotium;
	}
	public String getStjunit() {
		return stjunit;
	}
	public void setStjunit(String stjunit) {
		this.stjunit = stjunit;
	}
	public String getStandroid() {
		return standroid;
	}
	public void setStandroid(String standroid) {
		this.standroid = standroid;
	}
	public String getStespresso() {
		return stespresso;
	}
	public void setStespresso(String stespresso) {
		this.stespresso = stespresso;
	}
	public String getSthamcrest() {
		return sthamcrest;
	}
	public void setSthamcrest(String sthamcrest) {
		this.sthamcrest = sthamcrest;
	}
	public String getStrobolectric() {
		return strobolectric;
	}
	public void setStrobolectric(String strobolectric) {
		this.strobolectric = strobolectric;
	}
	public String getSteasymock() {
		return steasymock;
	}
	public void setSteasymock(String steasymock) {
		this.steasymock = steasymock;
	}
	public String getStfest() {
		return stfest;
	}
	public void setStfest(String stfest) {
		this.stfest = stfest;
	}
	public String getStoutros() {
		return stoutros;
	}
	public void setStoutros(String stoutros) {
		this.stoutros = stoutros;
	}
	public String getStmock() {
		return stmock;
	}
	public void setStmock(String stmock) {
		this.stmock = stmock;
	}
	public String getStmockito() {
		return stmockito;
	}
	public void setStmockito(String stmockito) {
		this.stmockito = stmockito;
	}
	public String getStroboguice() {
		return stroboguice;
	}
	public void setStroboguice(String stroboguice) {
		this.stroboguice = stroboguice;
	}
	public String getStselenium() {
		return stselenium;
	}
	public void setStselenium(String stselenium) {
		this.stselenium = stselenium;
	}
	public String getStjersey() {
		return stjersey;
	}
	public void setStjersey(String stjersey) {
		this.stjersey = stjersey;
	}
	public String getStspongycastle() {
		return stspongycastle;
	}
	public void setStspongycastle(String stspongycastle) {
		this.stspongycastle = stspongycastle;
	}
	public String getSttestng() {
		return sttestng;
	}
	public void setSttestng(String sttestng) {
		this.sttestng = sttestng;
	}
	public String getStmonkeyrunner() {
		return stmonkeyrunner;
	}
	public void setStmonkeyrunner(String stmonkeyrunner) {
		this.stmonkeyrunner = stmonkeyrunner;
	}
	public String getStjmeter() {
		return stjmeter;
	}
	public void setStjmeter(String stjmeter) {
		this.stjmeter = stjmeter;
	}
	public String getStuiautomator() {
		return stuiautomator;
	}
	public void setStuiautomator(String stuiautomator) {
		this.stuiautomator = stuiautomator;
	}
	public String getStappium() {
		return stappium;
	}
	public void setStappium(String stappium) {
		this.stappium = stappium;
	}
	public String getStselendroid() {
		return stselendroid;
	}
	public void setStselendroid(String stselendroid) {
		this.stselendroid = stselendroid;
	}
	/* MAPEAR FRAMEWORKS
	 * --------------------------------------------*/
	public Frameworks mapearFrameworks(Arquivos arqs) throws Exception{
		Frameworks frameworks = new Frameworks();
		Analisador analisador = new Analisador();
		Utilitarios uti = new Utilitarios();
		StringBuilder sbTextoPkg = new StringBuilder();
		StringBuilder sbTextoImp = new StringBuilder();
		
		for (String a : arqs.getArqsJavaSRC()){
			sbTextoPkg.append(analisador.listarPacotes(analisador.mapearClasse(a), a, listaNegraDeImports));
		}
		pacotesSRC.append(uti.removeRepeticao23(sbTextoPkg));
		sbTextoPkg = new StringBuilder();

		for (String a : arqs.getArqsJavaTeste()){
			sbTextoImp.append(analisador.listarImports(analisador.mapearClasse(a), listaNegraDeImports));
			sbTextoPkg.append(analisador.listarPacotes(analisador.mapearClasse(a), a, listaNegraDeImports));
		}
		importsTeste.append(uti.removeRepeticao23(sbTextoImp));
		pacotesTeste.append(uti.removeRepeticao23(sbTextoPkg));
		
		String textoFramework = uti.removeRepeticao23(listarFrameworks(pacotesSRC, importsTeste)).toString();
		
		if(textoFramework.contains("robotium"))
			frameworks.setStrobotium("1");
		if(textoFramework.contains("junit"))
			frameworks.setStjunit("1");
		if(textoFramework.contains("android.test"))
			frameworks.setStandroid("1");
		if(textoFramework.contains("espresso"))
			frameworks.setStespresso("1");
		if(textoFramework.contains("hamcrest"))
			frameworks.setSthamcrest("1");
		if(textoFramework.contains("robolectric"))
			frameworks.setStrobolectric("1");
		if(textoFramework.contains("easymock"))
			frameworks.setSteasymock("1");
		if(textoFramework.contains("fest"))
			frameworks.setStfest("1");
		if(textoFramework.contains("mock."))
			frameworks.setStmock("1");
		if(textoFramework.contains("mockito"))
			frameworks.setStmockito("1");
		if(textoFramework.contains("roboguice"))
			frameworks.setStroboguice("1");
		if(textoFramework.contains("selenium"))
			frameworks.setStselenium("1");
		if(textoFramework.contains("spongycastle"))
			frameworks.setStspongycastle("1");
		if(textoFramework.contains("jersey"))
			frameworks.setStjersey("1");
		if(textoFramework.contains("testng"))
			frameworks.setSttestng("1");
		if(textoFramework.contains("monkeyrunner"))
			frameworks.setStmonkeyrunner("1");
		if(textoFramework.contains("jmeter"))
			frameworks.setStjmeter("1");
		if(textoFramework.contains("uiautomator"))
			frameworks.setStuiautomator("1");
		if(textoFramework.contains("appium"))
			frameworks.setStappium("1");
		if(textoFramework.contains("selendroid"))
			frameworks.setStselendroid("1");
		
		frameworks.setStoutros(textoFramework.replaceAll("\n", "").replaceAll(";", "|"));
		
		frameworks.setFrameworks(uti.removeRepeticao23(listarFrameworks(pacotesSRC, importsTeste)));
		frameworks.setImportsTeste(importsTeste);
		frameworks.setPacotesSRC(pacotesSRC);
		frameworks.setPacotesTeste(pacotesTeste);
		return frameworks;
	}
	
	
	/* FRAMEWORKS DE TESTE - PACOTES x IMPORTS
	 * -----------------------------------------------*/
	public StringBuilder listarFrameworks(StringBuilder sbPkg, StringBuilder sbImp) 
	{	
		StringBuilder sb = new StringBuilder();
		
		for (String pacote : sbPkg.toString().split(";"))
		{
			for (String imp : sbImp.toString().split(";"))
			{
				if (!imp.contains(pacote.replace("package ", "").trim()))
				{
					sb.append("\n" + imp.trim() + ";");
				}
			}
			sbImp = sb;
			sb = new StringBuilder();
		}
		return sbImp;
	}
}
