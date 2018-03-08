package br.com.processador;

import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Configuracao {
	
	private Projeto projeto = new Projeto();
	
	// SENSORS
	private int stLocation = 0;
	private int stAccess_gps = 0;
	private int stRecord_audio = 0;
	private int stWifi = 0;
	private int stNetwork = 0;
	private int stBluetooth = 0;
	private int stInternet = 0;
	
		
	public int getStWifi() {
		return stWifi;
	}
	public void setStWifi(int stStWifi) {
		this.stWifi = stStWifi;
	}
	public int getStNetwork() {
		return stNetwork;
	}
	public void setStNetwork(int stNetwork) {
		this.stNetwork = stNetwork;
	}
	public int getStBluetooth() {
		return stBluetooth;
	}
	public void setStBluetooth(int stBluetooth) {
		this.stBluetooth = stBluetooth;
	}
	public int getStInternet() {
		return stInternet;
	}
	public void setStInternet(int stInternet) {
		this.stInternet = stInternet;
	}
	//PERMISSIONS
	private int networkState = 0;
	private int wifiState = 0;
	private int bluetooth = 0;
	private int bluetoothAdmin = 0;
	private int internet = 0;
	private int changeNetworkState = 0;
	private int changeWifiState = 0;
	
	//USES-SDK
	private String minSdkVersion = "0";
	private String targetSdkVersion = "0";
	private String maxSdkVersion = "0";
	
	//USES-CONFIGURATION
	private boolean reqFiveWayNav = false;
	private boolean reqHardKeyboard = false;
	private String reqKeyboardType = "0";
	private String reqNavigation = "0";
	private String reqTouchScreen = "0";
	
	//PERMISSION
	private ArrayList<String> lsUsesPermission = new ArrayList<String>();
	private ArrayList<String> lsPermission = new ArrayList<String>();
	
	//SUPPORTS-SCREEN
	private boolean blResizeable = true;  // por padrao é verdadeiro
	private boolean blSmallScreens = true; // por padrao é verdadeiro
	private boolean blNormalScreens = true; // por padrao é verdadeiro
	private String blLargeScreens  = "-"; // valor padrao varia de versao para versao
	private String blXlargeScreens = "-";; // valor padrao varia de versao para versao
	private boolean blAnyDensity = true; // por padrao é verdadeiro
	private String intRequiresSmallestWidthDp  = "-";
	private String intCompatibleWidthLimitDp = "-";
	private String intLargestWidthLimitDp = "-";
	
	//COMPATIBLE-SCREENS
	private String screenSize = "0";
	private String screenDensity = "0";
	
	//ORIENTATION
	private String intLandscape = "-";
	private String intPortrait = "-";

	
	public Projeto getProjeto() {
		return projeto;
	}
	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	public String getMinSdkVersion() {
		return minSdkVersion;
	}
	public void setMinSdkVersion(String minSdkVersion) {
		this.minSdkVersion = minSdkVersion;
	}
	public String getTargetSdkVersion() {
		return targetSdkVersion;
	}
	public void setTargetSdkVersion(String targetSdkVersion) {
		this.targetSdkVersion = targetSdkVersion;
	}
	public String getMaxSdkVersion() {
		return maxSdkVersion;
	}
	public void setMaxSdkVersion(String maxSdkVersion) {
		this.maxSdkVersion = maxSdkVersion;
	}
	public boolean isReqFiveWayNav() {
		return reqFiveWayNav;
	}
	public void setReqFiveWayNav(boolean reqFiveWayNav) {
		this.reqFiveWayNav = reqFiveWayNav;
	}
	public boolean isReqHardKeyboard() {
		return reqHardKeyboard;
	}
	public void setReqHardKeyboard(boolean reqHardKeyboard) {
		this.reqHardKeyboard = reqHardKeyboard;
	}
	public String getReqKeyboardType() {
		return reqKeyboardType;
	}
	public void setReqKeyboardType(String reqKeyboardType) {
		this.reqKeyboardType = reqKeyboardType;
	}
	public String getReqNavigation() {
		return reqNavigation;
	}
	public void setReqNavigation(String reqNavigation) {
		this.reqNavigation = reqNavigation;
	}
	public String getReqTouchScreen() {
		return reqTouchScreen;
	}
	public void setReqTouchScreen(String reqTouchScreen) {
		this.reqTouchScreen = reqTouchScreen;
	}
	public ArrayList<String> getLsUsesPermission() {
		return lsUsesPermission;
	}
	public void setLsUsesPermission(ArrayList<String> lsUsesPermission) {
		this.lsUsesPermission = lsUsesPermission;
	}
	public ArrayList<String> getLsPermission() {
		return lsPermission;
	}
	public void setLsPermission(ArrayList<String> lsPermission) {
		this.lsPermission = lsPermission;
	}
	
	public boolean isBlResizeable() {
		return blResizeable;
	}
	public void setBlResizeable(boolean blResizeable) {
		this.blResizeable = blResizeable;
	}
	public boolean isBlSmallScreens() {
		return blSmallScreens;
	}
	public void setBlSmallScreens(boolean blSmallScreens) {
		this.blSmallScreens = blSmallScreens;
	}
	public boolean isBlNormalScreens() {
		return blNormalScreens;
	}
	public void setBlNormalScreens(boolean blNormalScreens) {
		this.blNormalScreens = blNormalScreens;
	}
	public String isBlLargeScreens() {
		return blLargeScreens;
	}
	public void setBlLargeScreens(String blLargeScreens) {
		this.blLargeScreens = blLargeScreens;
	}
	public String isBlXlargeScreens() {
		return blXlargeScreens;
	}
	public void setBlXlargeScreens(String blXlargeScreens) {
		this.blXlargeScreens = blXlargeScreens;
	}
	public boolean isBlAnyDensity() {
		return blAnyDensity;
	}
	public void setBlAnyDensity(boolean blAnyDensity) {
		this.blAnyDensity = blAnyDensity;
	}
	public String getIntRequiresSmallestWidthDp() {
		return intRequiresSmallestWidthDp;
	}
	public void setIntRequiresSmallestWidthDp(String intRequiresSmallestWidthDp) {
		this.intRequiresSmallestWidthDp = intRequiresSmallestWidthDp;
	}
	public String getIntCompatibleWidthLimitDp() {
		return intCompatibleWidthLimitDp;
	}
	public void setIntCompatibleWidthLimitDp(String intCompatibleWidthLimitDp) {
		this.intCompatibleWidthLimitDp = intCompatibleWidthLimitDp;
	}
	public String getIntLargestWidthLimitDp() {
		return intLargestWidthLimitDp;
	}
	public void setIntLargestWidthLimitDp(String intLargestWidthLimitDp) {
		this.intLargestWidthLimitDp = intLargestWidthLimitDp;
	}
	public String getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
	public String getScreenDensity() {
		return screenDensity;
	}
	public void setScreenDensity(String screenDensity) {
		this.screenDensity = screenDensity;
	}
	public String getIntLandscape() {
		return intLandscape;
	}
	public void setIntLandscape(String intLandscape) {
		this.intLandscape = intLandscape;
	}
	public String getIntPortrait() {
		return intPortrait;
	}
	public void setIntPortrait(String intPortrait) {
		this.intPortrait = intPortrait;
	}
	
	public int getStLocation() {
		return stLocation;
	}
	public void setStLocation(int stLocation) {
		this.stLocation = stLocation;
	}
	public int getStAccess_gps() {
		return stAccess_gps;
	}
	public void setStAccess_gps(int stAccess_gps) {
		this.stAccess_gps = stAccess_gps;
	}
	public int getStRecord_audio() {
		return stRecord_audio;
	}
	public void setStRecord_audio(int record_audio) {
		stRecord_audio = record_audio;
	}
	
	public int getNetworkState() {
		return networkState;
	}
	public void setNetworkState(int networkState) {
		this.networkState = networkState;
	}
	public int getWifiState() {
		return wifiState;
	}
	public void setWifiState(int wifiState) {
		this.wifiState = wifiState;
	}
	public int getBluetooth() {
		return bluetooth;
	}
	public void setBluetooth(int bluetooth) {
		this.bluetooth = bluetooth;
	}
	public int getBluetoothAdmin() {
		return bluetoothAdmin;
	}
	public void setBluetoothAdmin(int bluetoothAdmin) {
		this.bluetoothAdmin = bluetoothAdmin;
	}
	public int getInternet() {
		return internet;
	}
	public void setInternet(int internet) {
		this.internet = internet;
	}
	public int getChangeNetworkState() {
		return changeNetworkState;
	}
	public void setChangeNetworkState(int changeNetworkState) {
		this.changeNetworkState = changeNetworkState;
	}
	public int getChangeWifiState() {
		return changeWifiState;
	}
	public void setChangeWifiState(int changeWifiState) {
		this.changeWifiState = changeWifiState;
	}
	public Configuracao mapearConfiguracao(Arquivos arqs)
	{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		Configuracao cg = new Configuracao();
		String textoPermission = "";
		
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			System.out.println(arqs.getDiretorio().getProjeto().getNome());

			for (String arqmanifest : arqs.getArqsManifesto())
			{
				Document doc = builder.parse(arqmanifest);
				
				NodeList nodeManifest = doc.getElementsByTagName("manifest");
				for (int i = 0; i < nodeManifest.getLength(); ++i)
				{
				    Element elManifest = (Element) nodeManifest.item(i);
				    String stXmlns = elManifest.getAttribute("xmlns:android");
				    
				    NodeList nodeUsesSdk = elManifest.getElementsByTagName("uses-sdk");
				    for (int j = 0; j < nodeUsesSdk.getLength(); ++j)
				    {
				        Element elUsesSdk = (Element) nodeUsesSdk.item(j);
					    
				        if(targetSdkVersion.equals("0") || !elUsesSdk.getAttribute("android:minSdkVersion").isEmpty())
				        	minSdkVersion = elUsesSdk.getAttribute("android:minSdkVersion");
					    
				        
					    if(targetSdkVersion.equals("0") || !elUsesSdk.getAttribute("android:targetSdkVersion").isEmpty())
					    	targetSdkVersion = elUsesSdk.getAttribute("android:targetSdkVersion");
					    
					    if(maxSdkVersion.equals("0") || !elUsesSdk.getAttribute("android:maxSdkVersion").isEmpty())
					       	maxSdkVersion = elUsesSdk.getAttribute("android:maxSdkVersion");
					    
				    }
			        
				    NodeList nodeScreens = elManifest.getElementsByTagName("supports-screens");
				    for (int k = 0; k < nodeScreens.getLength(); ++k)
				    {
				        Element elScreens = (Element) nodeScreens.item(k);
	
				        if(blResizeable == true || !elScreens.getAttribute("android:resizeable").isEmpty())
				        	blResizeable = Boolean.parseBoolean(elScreens.getAttribute("android:resizeable"));
				        
				        if(blSmallScreens == true || !elScreens.getAttribute("android:smallScreens").isEmpty() )
				        	blSmallScreens = Boolean.parseBoolean(elScreens.getAttribute("android:smallScreens"));
				        
				        if(blNormalScreens == true || !elScreens.getAttribute("android:normalScreens").isEmpty())
				        	blNormalScreens = Boolean.parseBoolean(elScreens.getAttribute("android:normalScreens"));
				        
				        if(blLargeScreens.equals("-") || !elScreens.getAttribute("android:largeScreens").isEmpty())
				        	blLargeScreens = elScreens.getAttribute("android:largeScreens");
				     				        
				        if(blXlargeScreens.equals("-") || !elScreens.getAttribute("android:xlargeScreens").isEmpty())
				        	blXlargeScreens = elScreens.getAttribute("android:xlargeScreens");
				        
				        if(blAnyDensity == true || !elScreens.getAttribute("android:anyDensity").isEmpty())
				        	blAnyDensity = Boolean.parseBoolean(elScreens.getAttribute("android:anyDensity"));
					    
				        if(intRequiresSmallestWidthDp.equals("-") || !elScreens.getAttribute("android:requiresSmallestWidthDp").isEmpty())
				        	intRequiresSmallestWidthDp = elScreens.getAttribute("android:requiresSmallestWidthDp");
				        
				        if(intCompatibleWidthLimitDp.equals("-") || !elScreens.getAttribute("android:compatibleWidthLimitDp").isEmpty())
				        	intCompatibleWidthLimitDp = elScreens.getAttribute("android:compatibleWidthLimitDp");
				        
				        if(intLargestWidthLimitDp.equals("-") || !elScreens.getAttribute("android:largestWidthLimitDp").isEmpty())
				        	intLargestWidthLimitDp = elScreens.getAttribute("android:largestWidthLimitDp");
				    }
				    
				    NodeList nodeConfiguration = elManifest.getElementsByTagName("uses-configuration");
				    for (int j = 0; j < nodeConfiguration.getLength(); ++j)
				    {
				        Element elConfiguration = (Element) nodeConfiguration.item(j);
				        
				        if(reqFiveWayNav == false || !elConfiguration.getAttribute("android:reqFiveWayNav").isEmpty())
				        	reqFiveWayNav = Boolean.parseBoolean(elConfiguration.getAttribute("android:reqFiveWayNav"));
				        
				        if(reqHardKeyboard == false || !elConfiguration.getAttribute("android:reqHardKeyboard").isEmpty())
				        	reqHardKeyboard = Boolean.parseBoolean(elConfiguration.getAttribute("android:reqHardKeyboard"));
					    
				        if(reqKeyboardType.equals("0") || !elConfiguration.getAttribute("android:reqKeyboardType").isEmpty())
				        	reqKeyboardType = elConfiguration.getAttribute("android:reqKeyboardType");
				        
				        if(reqNavigation.equals("0") || !elConfiguration.getAttribute("android:reqNavigation").isEmpty())
				        	reqNavigation = elConfiguration.getAttribute("android:reqNavigation");
				        
				        if(reqTouchScreen.equals("0") || !elConfiguration.getAttribute("android:reqTouchScreen").isEmpty())
				        	reqTouchScreen = elConfiguration.getAttribute("android:reqTouchScreen");
				    }
				   
				    
				    // CRIO UMA LISTA DE PALAVRAS, NÃO IMPORTA SER REPETIDO
				    NodeList nodeUsesPermission = elManifest.getElementsByTagName("uses-permission");
				    for (int j = 0; j < nodeUsesPermission.getLength(); ++j)
				    {
				        Element elUsesPermission = (Element) nodeUsesPermission.item(j);
				        textoPermission += elUsesPermission.getAttribute("android:name") + ";";
				    }
				  
				    NodeList nodeApplication = elManifest.getElementsByTagName("application");
				    for (int j = 0; j < nodeApplication.getLength(); ++j)
				    {
				    	// ISSO DEVE SER UMA LISTA - VARIOS ELEMENTOS
				        Element elApplication = (Element) nodeApplication.item(j);
				        
					    NodeList nodeActivity = elApplication.getElementsByTagName("activity");
					    for (int k = 0; k < nodeActivity.getLength(); ++k)
					    {
					    	String palavra = "";
					    	// ISSO DEVE SER UMA LISTA - VARIOS ELEMENTOS
					        Element elActivity = (Element) nodeActivity.item(k);
					        palavra = (elActivity.getAttribute("android:screenOrientation"));
					        
					        if (intLandscape.equals("-") || intPortrait.equals("-"))
					        {
					        	if(palavra.equals("landscape"))
					        		intLandscape = "1";
					        	else if(palavra.equals("portrait"))
					        		intPortrait = "1";
					    	}
					    }
				    }
				} 
			}
		} catch (Exception ex) { 
	         ex.printStackTrace (); 
	    }
		
		// PERMISSION
		if(textoPermission.contains("ACCESS_NETWORK_STATE"))
			cg.setNetworkState(1);
		if(textoPermission.contains("ACCESS_WIFI_STATE"))
			cg.setWifiState(1);
		if(textoPermission.contains("BLUETOOTH;"))
			cg.setBluetooth(1);
		if(textoPermission.contains("BLUETOOTH_ADMIN"))
			cg.setBluetoothAdmin(1);
		if(textoPermission.contains("INTERNET"))
			cg.setInternet(1);
		if(textoPermission.contains("CHANGE_NETWORK_STATE"))
			cg.setChangeNetworkState(1);
		if(textoPermission.contains("CHANGE_WIFI_STATE"))
			cg.setChangeWifiState(1);

		if(textoPermission.contains("LOCATION"))
			cg.setStLocation(1);
		if(textoPermission.contains("GPS"))
			cg.setStAccess_gps(1);
		if(textoPermission.contains("RECORD_AUDIO"))
			cg.setStRecord_audio(1);
		if(textoPermission.contains("NETWORK"))
			cg.setStNetwork(1);
		if(textoPermission.contains("INTERNET"))
			cg.setStInternet(1);
		if(textoPermission.contains("WIFI"))
			cg.setStWifi(1);
		if(textoPermission.contains("BLUETOOTH"))
			cg.setStBluetooth(1);
		
        //System.out.println(minSdkVersion);

		cg.setIntPortrait(intPortrait);
		cg.setIntLandscape(intLandscape);
		cg.setMinSdkVersion(minSdkVersion);
		cg.setTargetSdkVersion(targetSdkVersion);
		cg.setMaxSdkVersion(maxSdkVersion);
		cg.setBlAnyDensity(blAnyDensity);
		cg.setBlLargeScreens(blLargeScreens);
		cg.setBlNormalScreens(blNormalScreens);
		cg.setBlResizeable(blResizeable);
		cg.setBlSmallScreens(blSmallScreens);
		cg.setBlXlargeScreens(blXlargeScreens);
		cg.setIntCompatibleWidthLimitDp(intCompatibleWidthLimitDp);
		cg.setIntLargestWidthLimitDp(intLargestWidthLimitDp);
		cg.setIntRequiresSmallestWidthDp(intRequiresSmallestWidthDp);
		cg.setLsPermission(lsPermission);
		cg.setLsUsesPermission(lsUsesPermission);
		cg.setProjeto(projeto);
		cg.setReqFiveWayNav(reqFiveWayNav);
		cg.setReqHardKeyboard(reqHardKeyboard);
		cg.setReqNavigation(reqNavigation);
		cg.setReqTouchScreen(reqTouchScreen);
		cg.setScreenDensity(screenDensity);
		cg.setScreenSize(screenSize);
		cg.setTargetSdkVersion(targetSdkVersion);
		return cg;
	}
}
