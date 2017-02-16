package br.com.processador;

import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Configuracao2 {
	
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
	
	//USES-FEATURE
	private String name = "0";
	private boolean required = false;
	private String glEsVersion = "0";
	
	private String Femicrophone = "0";
	private String Felocation = "0";
	private String Febluetooth = "0";
	private String Fewifi = "0";
	private String Fetouchscreen = "0";
	private String Feusb = "0";
	private String Fefaketouch = "0";
	private String Fescreen_landscape = "0";
	private String Fescreen_portrait = "0";
	private String Feaudio = "0";
	private String Felocation_network = "0";
	private String Felocation_gps = "0";
	private String Feconsumerir = "0";
	private String Fegamepad = "0";
	private String Fefingerprint = "0";
	private String Fetype_watch = "0";
	private String Fetype_television = "0";
	private String Fetype_automotive = "0";
	private String Feopengles_aep = "0";
	private String Fehardware_nfc = "0";

	private String Fesensor_stepdetector = "0";
	private String Fesensor_stepcounter = "0";
	private String Fesensor_relative_humidity = "0";
	private String Fesensor_proximity = "0";
	private String Fesensor_light = "0";
	private String Fesensor_heartrate_ecg = "0";
	private String Fesensor_heartrate = "0";
	private String Fesensor_hifi_sensors = "0";
	private String Fesensor_gyroscope = "0";
	private String Fesensor_compass = "0";
	private String Fesensor_barometer = "0";
	private String Fesensor_ambient_temperature = "0";
	private String Fesensor_accelerometer = "0";
	private String Fenfc = "0";
	
	private String FemicrophoneRe = "0";
	private String FelocationRe = "0";
	private String FebluetoothRe = "0";
	private String FewifiRe = "0";
	private String FetouchscreenRe = "0";
	private String FeusbRe = "0";
	private String FefaketouchRe = "0";
	private String Fescreen_landscapeRe = "0";
	private String Fescreen_portraitRe = "0";
	private String FeaudioRe = "0";
	private String Felocation_networkRe = "0";
	private String Felocation_gpsRe = "0";
	private String FeconsumerirRe = "0";
	private String FegamepadRe = "0";
	private String FefingerprintRe = "0";
	private String Fetype_watchRe = "0";
	private String Fetype_televisionRe = "0";
	private String Fetype_automotiveRe = "0";
	private String Feopengles_aepRe = "0";
	private String Fehardware_nfcRe = "0";

	private String Fesensor_stepdetectorRe = "0";
	private String Fesensor_stepcounterRe = "0";
	private String Fesensor_relative_humidityRe = "0";
	private String Fesensor_proximityRe = "0";
	private String Fesensor_lightRe = "0";
	private String Fesensor_heartrate_ecgRe = "0";
	private String Fesensor_heartrateRe = "0";
	private String Fesensor_hifi_sensorsRe = "0";
	private String Fesensor_gyroscopeRe = "0";
	private String Fesensor_compassRe = "0";
	private String Fesensor_barometerRe = "0";
	private String Fesensor_ambient_temperatureRe = "0";
	private String Fesensor_accelerometerRe = "0";
	private String FenfcRe = "0";
	
	//SUPPORTS-SCREEN
	private boolean blResizeable = false;
	private boolean blSmallScreens = false;
	private boolean blNormalScreens = false;
	private boolean blLargeScreens = false;
	private boolean blXlargeScreens = false;
	private boolean blAnyDensity = false;
	private String intRequiresSmallestWidthDp  = "0";
	private String intCompatibleWidthLimitDp = "0";
	private String intLargestWidthLimitDp = "0";
	
	//COMPATIBLE-SCREENS
	private String screenSize = "0";
	private String screenDensity = "0";
	
	//ORIENTATION
	private int intLandscape = 0;
	private int intPortrait = 0;

	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isRequired() {
		return required;
	}
	public void setRequired(boolean required) {
		this.required = required;
	}
	public String getGlEsVersion() {
		return glEsVersion;
	}
	public void setGlEsVersion(String glEsVersion) {
		this.glEsVersion = glEsVersion;
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
	public boolean isBlLargeScreens() {
		return blLargeScreens;
	}
	public void setBlLargeScreens(boolean blLargeScreens) {
		this.blLargeScreens = blLargeScreens;
	}
	public boolean isBlXlargeScreens() {
		return blXlargeScreens;
	}
	public void setBlXlargeScreens(boolean blXlargeScreens) {
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
	public int getIntLandscape() {
		return intLandscape;
	}
	public void setIntLandscape(int intLandscape) {
		this.intLandscape = intLandscape;
	}
	public int getIntPortrait() {
		return intPortrait;
	}
	public void setIntPortrait(int intPortrait) {
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
	
	public String getFemicrophone() {
		return Femicrophone;
	}
	public void setFemicrophone(String femicrophone) {
		Femicrophone = femicrophone;
	}
	public String getFelocation() {
		return Felocation;
	}
	public void setFelocation(String felocation) {
		Felocation = felocation;
	}
	public String getFebluetooth() {
		return Febluetooth;
	}
	public void setFebluetooth(String febluetooth) {
		Febluetooth = febluetooth;
	}
	public String getFewifi() {
		return Fewifi;
	}
	public void setFewifi(String fewifi) {
		Fewifi = fewifi;
	}
	public String getFetouchscreen() {
		return Fetouchscreen;
	}
	public void setFetouchscreen(String fetouchscreen) {
		Fetouchscreen = fetouchscreen;
	}
	public String getFeusb() {
		return Feusb;
	}
	public void setFeusb(String feusb) {
		Feusb = feusb;
	}
	public String getFefaketouch() {
		return Fefaketouch;
	}
	public void setFefaketouch(String fefaketouch) {
		Fefaketouch = fefaketouch;
	}
	public String getFescreen_landscape() {
		return Fescreen_landscape;
	}
	public void setFescreen_landscape(String fescreen_landscape) {
		Fescreen_landscape = fescreen_landscape;
	}
	public String getFescreen_portrait() {
		return Fescreen_portrait;
	}
	public void setFescreen_portrait(String fescreen_portrait) {
		Fescreen_portrait = fescreen_portrait;
	}
	public String getFeaudio() {
		return Feaudio;
	}
	public void setFeaudio(String feaudio) {
		Feaudio = feaudio;
	}
	public String getFelocation_network() {
		return Felocation_network;
	}
	public void setFelocation_network(String felocation_network) {
		Felocation_network = felocation_network;
	}
	public String getFelocation_gps() {
		return Felocation_gps;
	}
	public void setFelocation_gps(String felocation_gps) {
		Felocation_gps = felocation_gps;
	}
	public String getFeconsumerir() {
		return Feconsumerir;
	}
	public void setFeconsumerir(String feconsumerir) {
		Feconsumerir = feconsumerir;
	}
	public String getFegamepad() {
		return Fegamepad;
	}
	public void setFegamepad(String fegamepad) {
		Fegamepad = fegamepad;
	}
	public String getFefingerprint() {
		return Fefingerprint;
	}
	public void setFefingerprint(String fefingerprint) {
		Fefingerprint = fefingerprint;
	}
	public String getFetype_watch() {
		return Fetype_watch;
	}
	public void setFetype_watch(String fetype_watch) {
		Fetype_watch = fetype_watch;
	}
	public String getFetype_television() {
		return Fetype_television;
	}
	public void setFetype_television(String fetype_television) {
		Fetype_television = fetype_television;
	}
	public String getFetype_automotive() {
		return Fetype_automotive;
	}
	public void setFetype_automotive(String fetype_automotive) {
		Fetype_automotive = fetype_automotive;
	}
	public String getFeopengles_aep() {
		return Feopengles_aep;
	}
	public void setFeopengles_aep(String feopengles_aep) {
		Feopengles_aep = feopengles_aep;
	}
	public String getFehardware_nfc() {
		return Fehardware_nfc;
	}
	public void setFehardware_nfc(String fehardware_nfc) {
		Fehardware_nfc = fehardware_nfc;
	}
	public String getFesensor_stepdetector() {
		return Fesensor_stepdetector;
	}
	public void setFesensor_stepdetector(String fesensor_stepdetector) {
		Fesensor_stepdetector = fesensor_stepdetector;
	}
	public String getFesensor_stepcounter() {
		return Fesensor_stepcounter;
	}
	public void setFesensor_stepcounter(String fesensor_stepcounter) {
		Fesensor_stepcounter = fesensor_stepcounter;
	}
	public String getFesensor_relative_humidity() {
		return Fesensor_relative_humidity;
	}
	public void setFesensor_relative_humidity(String fesensor_relative_humidity) {
		Fesensor_relative_humidity = fesensor_relative_humidity;
	}
	public String getFesensor_proximity() {
		return Fesensor_proximity;
	}
	public void setFesensor_proximity(String fesensor_proximity) {
		Fesensor_proximity = fesensor_proximity;
	}
	public String getFesensor_light() {
		return Fesensor_light;
	}
	public void setFesensor_light(String fesensor_light) {
		Fesensor_light = fesensor_light;
	}
	public String getFesensor_heartrate_ecg() {
		return Fesensor_heartrate_ecg;
	}
	public void setFesensor_heartrate_ecg(String fesensor_heartrate_ecg) {
		Fesensor_heartrate_ecg = fesensor_heartrate_ecg;
	}
	public String getFesensor_heartrate() {
		return Fesensor_heartrate;
	}
	public void setFesensor_heartrate(String fesensor_heartrate) {
		Fesensor_heartrate = fesensor_heartrate;
	}
	public String getFesensor_hifi_sensors() {
		return Fesensor_hifi_sensors;
	}
	public void setFesensor_hifi_sensors(String fesensor_hifi_sensors) {
		Fesensor_hifi_sensors = fesensor_hifi_sensors;
	}
	public String getFesensor_gyroscope() {
		return Fesensor_gyroscope;
	}
	public void setFesensor_gyroscope(String fesensor_gyroscope) {
		Fesensor_gyroscope = fesensor_gyroscope;
	}
	public String getFesensor_compass() {
		return Fesensor_compass;
	}
	public void setFesensor_compass(String fesensor_compass) {
		Fesensor_compass = fesensor_compass;
	}
	public String getFesensor_barometer() {
		return Fesensor_barometer;
	}
	public void setFesensor_barometer(String fesensor_barometer) {
		Fesensor_barometer = fesensor_barometer;
	}
	public String getFesensor_ambient_temperature() {
		return Fesensor_ambient_temperature;
	}
	public void setFesensor_ambient_temperature(String fesensor_ambient_temperature) {
		Fesensor_ambient_temperature = fesensor_ambient_temperature;
	}
	public String getFesensor_accelerometer() {
		return Fesensor_accelerometer;
	}
	public void setFesensor_accelerometer(String fesensor_accelerometer) {
		Fesensor_accelerometer = fesensor_accelerometer;
	}
	public String getFenfc() {
		return Fenfc;
	}
	public void setFenfc(String fenfc) {
		Fenfc = fenfc;
	}
	
	public String getFemicrophoneRe() {
		return FemicrophoneRe;
	}
	public void setFemicrophoneRe(String femicrophoneRe) {
		FemicrophoneRe = femicrophoneRe;
	}
	public String getFelocationRe() {
		return FelocationRe;
	}
	public void setFelocationRe(String felocationRe) {
		FelocationRe = felocationRe;
	}
	public String getFebluetoothRe() {
		return FebluetoothRe;
	}
	public void setFebluetoothRe(String febluetoothRe) {
		FebluetoothRe = febluetoothRe;
	}
	public String getFewifiRe() {
		return FewifiRe;
	}
	public void setFewifiRe(String fewifiRe) {
		FewifiRe = fewifiRe;
	}
	public String getFetouchscreenRe() {
		return FetouchscreenRe;
	}
	public void setFetouchscreenRe(String fetouchscreenRe) {
		FetouchscreenRe = fetouchscreenRe;
	}
	public String getFeusbRe() {
		return FeusbRe;
	}
	public void setFeusbRe(String feusbRe) {
		FeusbRe = feusbRe;
	}
	public String getFefaketouchRe() {
		return FefaketouchRe;
	}
	public void setFefaketouchRe(String fefaketouchRe) {
		FefaketouchRe = fefaketouchRe;
	}
	public String getFescreen_landscapeRe() {
		return Fescreen_landscapeRe;
	}
	public void setFescreen_landscapeRe(String fescreen_landscapeRe) {
		Fescreen_landscapeRe = fescreen_landscapeRe;
	}
	public String getFescreen_portraitRe() {
		return Fescreen_portraitRe;
	}
	public void setFescreen_portraitRe(String fescreen_portraitRe) {
		Fescreen_portraitRe = fescreen_portraitRe;
	}
	public String getFeaudioRe() {
		return FeaudioRe;
	}
	public void setFeaudioRe(String feaudioRe) {
		FeaudioRe = feaudioRe;
	}
	public String getFelocation_networkRe() {
		return Felocation_networkRe;
	}
	public void setFelocation_networkRe(String felocation_networkRe) {
		Felocation_networkRe = felocation_networkRe;
	}
	public String getFelocation_gpsRe() {
		return Felocation_gpsRe;
	}
	public void setFelocation_gpsRe(String felocation_gpsRe) {
		Felocation_gpsRe = felocation_gpsRe;
	}
	public String getFeconsumerirRe() {
		return FeconsumerirRe;
	}
	public void setFeconsumerirRe(String feconsumerirRe) {
		FeconsumerirRe = feconsumerirRe;
	}
	public String getFegamepadRe() {
		return FegamepadRe;
	}
	public void setFegamepadRe(String fegamepadRe) {
		FegamepadRe = fegamepadRe;
	}
	public String getFefingerprintRe() {
		return FefingerprintRe;
	}
	public void setFefingerprintRe(String fefingerprintRe) {
		FefingerprintRe = fefingerprintRe;
	}
	public String getFetype_watchRe() {
		return Fetype_watchRe;
	}
	public void setFetype_watchRe(String fetype_watchRe) {
		Fetype_watchRe = fetype_watchRe;
	}
	public String getFetype_televisionRe() {
		return Fetype_televisionRe;
	}
	public void setFetype_televisionRe(String fetype_televisionRe) {
		Fetype_televisionRe = fetype_televisionRe;
	}
	public String getFetype_automotiveRe() {
		return Fetype_automotiveRe;
	}
	public void setFetype_automotiveRe(String fetype_automotiveRe) {
		Fetype_automotiveRe = fetype_automotiveRe;
	}
	public String getFeopengles_aepRe() {
		return Feopengles_aepRe;
	}
	public void setFeopengles_aepRe(String feopengles_aepRe) {
		Feopengles_aepRe = feopengles_aepRe;
	}
	public String getFehardware_nfcRe() {
		return Fehardware_nfcRe;
	}
	public void setFehardware_nfcRe(String fehardware_nfcRe) {
		Fehardware_nfcRe = fehardware_nfcRe;
	}
	public String getFesensor_stepdetectorRe() {
		return Fesensor_stepdetectorRe;
	}
	public void setFesensor_stepdetectorRe(String fesensor_stepdetectorRe) {
		Fesensor_stepdetectorRe = fesensor_stepdetectorRe;
	}
	public String getFesensor_stepcounterRe() {
		return Fesensor_stepcounterRe;
	}
	public void setFesensor_stepcounterRe(String fesensor_stepcounterRe) {
		Fesensor_stepcounterRe = fesensor_stepcounterRe;
	}
	public String getFesensor_relative_humidityRe() {
		return Fesensor_relative_humidityRe;
	}
	public void setFesensor_relative_humidityRe(String fesensor_relative_humidityRe) {
		Fesensor_relative_humidityRe = fesensor_relative_humidityRe;
	}
	public String getFesensor_proximityRe() {
		return Fesensor_proximityRe;
	}
	public void setFesensor_proximityRe(String fesensor_proximityRe) {
		Fesensor_proximityRe = fesensor_proximityRe;
	}
	public String getFesensor_lightRe() {
		return Fesensor_lightRe;
	}
	public void setFesensor_lightRe(String fesensor_lightRe) {
		Fesensor_lightRe = fesensor_lightRe;
	}
	public String getFesensor_heartrate_ecgRe() {
		return Fesensor_heartrate_ecgRe;
	}
	public void setFesensor_heartrate_ecgRe(String fesensor_heartrate_ecgRe) {
		Fesensor_heartrate_ecgRe = fesensor_heartrate_ecgRe;
	}
	public String getFesensor_heartrateRe() {
		return Fesensor_heartrateRe;
	}
	public void setFesensor_heartrateRe(String fesensor_heartrateRe) {
		Fesensor_heartrateRe = fesensor_heartrateRe;
	}
	public String getFesensor_hifi_sensorsRe() {
		return Fesensor_hifi_sensorsRe;
	}
	public void setFesensor_hifi_sensorsRe(String fesensor_hifi_sensorsRe) {
		Fesensor_hifi_sensorsRe = fesensor_hifi_sensorsRe;
	}
	public String getFesensor_gyroscopeRe() {
		return Fesensor_gyroscopeRe;
	}
	public void setFesensor_gyroscopeRe(String fesensor_gyroscopeRe) {
		Fesensor_gyroscopeRe = fesensor_gyroscopeRe;
	}
	public String getFesensor_compassRe() {
		return Fesensor_compassRe;
	}
	public void setFesensor_compassRe(String fesensor_compassRe) {
		Fesensor_compassRe = fesensor_compassRe;
	}
	public String getFesensor_barometerRe() {
		return Fesensor_barometerRe;
	}
	public void setFesensor_barometerRe(String fesensor_barometerRe) {
		Fesensor_barometerRe = fesensor_barometerRe;
	}
	public String getFesensor_ambient_temperatureRe() {
		return Fesensor_ambient_temperatureRe;
	}
	public void setFesensor_ambient_temperatureRe(String fesensor_ambient_temperatureRe) {
		Fesensor_ambient_temperatureRe = fesensor_ambient_temperatureRe;
	}
	public String getFesensor_accelerometerRe() {
		return Fesensor_accelerometerRe;
	}
	public void setFesensor_accelerometerRe(String fesensor_accelerometerRe) {
		Fesensor_accelerometerRe = fesensor_accelerometerRe;
	}
	public String getFenfcRe() {
		return FenfcRe;
	}
	public void setFenfcRe(String fenfcRe) {
		FenfcRe = fenfcRe;
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
	public Configuracao2 mapearConfiguracao(Arquivos arqs)
	{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		Configuracao2 cg = new Configuracao2();
		String textoPermission = "";
		String textoFeature = "";
		String vName[] = new String[100];
		String vRequired[] = new String[100];
		int cont = 0;
		
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			//System.out.println(arqs.getDiretorio().getProjeto().getNome());
			//System.out.println(arqs.getArqManifesto());
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
	
					    if(minSdkVersion.equals("0") || minSdkVersion.equals("")){
					    	minSdkVersion = elUsesSdk.getAttribute("android:minSdkVersion");
					    }
					    if(targetSdkVersion.equals("0") || targetSdkVersion.equals("")){
					    	targetSdkVersion = elUsesSdk.getAttribute("android:targetSdkVersion");
					    }
					    if(maxSdkVersion.equals("0") || maxSdkVersion.equals("")){
					    	maxSdkVersion = elUsesSdk.getAttribute("android:maxSdkVersion");
					    }
				    }
			        
				    NodeList nodeScreens = elManifest.getElementsByTagName("supports-screens");
				    for (int k = 0; k < nodeScreens.getLength(); ++k)
				    {
				        Element elScreens = (Element) nodeScreens.item(k);
	
				        if(blResizeable == false)
				        	blResizeable = Boolean.parseBoolean(elScreens.getAttribute("android:resizeable"));
				        
				        if(blSmallScreens == false)
				        	blSmallScreens = Boolean.parseBoolean(elScreens.getAttribute("android:smallScreens"));
				        
				        if(blNormalScreens == false)
				        	blNormalScreens = Boolean.parseBoolean(elScreens.getAttribute("android:normalScreens"));
				        
				        if(blLargeScreens == false)
				        	blLargeScreens = Boolean.parseBoolean(elScreens.getAttribute("android:largeScreens"));
				        
				        if(blXlargeScreens == false)
				        	blXlargeScreens = Boolean.parseBoolean(elScreens.getAttribute("android:xlargeScreens"));
				        
				        if(blAnyDensity == false)
				        	blAnyDensity = Boolean.parseBoolean(elScreens.getAttribute("android:anyDensity"));
					    
				        if(intRequiresSmallestWidthDp.equals("0"))
				        	intRequiresSmallestWidthDp = elScreens.getAttribute("android:requiresSmallestWidthDp");
				        
				        if(intCompatibleWidthLimitDp.equals("0"))
				        	intCompatibleWidthLimitDp = elScreens.getAttribute("android:compatibleWidthLimitDp");
				        
				        if(intLargestWidthLimitDp.equals("0"))
				        	intLargestWidthLimitDp = elScreens.getAttribute("android:largestWidthLimitDp");
				    }
				    
				    NodeList nodeConfiguration = elManifest.getElementsByTagName("uses-configuration");
				    for (int j = 0; j < nodeConfiguration.getLength(); ++j)
				    {
				        Element elConfiguration = (Element) nodeConfiguration.item(j);
				        
				        if(reqFiveWayNav == false)
				        	reqFiveWayNav = Boolean.parseBoolean(elConfiguration.getAttribute("android:reqFiveWayNav"));
				        
				        if(reqHardKeyboard == false)
				        	reqHardKeyboard = Boolean.parseBoolean(elConfiguration.getAttribute("android:reqHardKeyboard"));
					    
				        if(reqKeyboardType.equals("0"))
				        	reqKeyboardType = elConfiguration.getAttribute("android:reqKeyboardType");
				        
				        if(reqNavigation.equals("0"))
				        	reqNavigation = elConfiguration.getAttribute("android:reqNavigation");
				        
				        if(reqTouchScreen.equals("0"))
				        	reqTouchScreen = elConfiguration.getAttribute("android:reqTouchScreen");
				    }
				   
				    NodeList nodeUsesPermission = elManifest.getElementsByTagName("uses-permission");
				    
				    for (int j = 0; j < nodeUsesPermission.getLength(); ++j)
				    {
				    	
				        Element elUsesPermission = (Element) nodeUsesPermission.item(j);
				        textoPermission += elUsesPermission.getAttribute("android:name") + ";";
				       
				       // lsUsesPermission.add(elUsesPermission.getAttribute("android:name"));
				    }
				    
				   /* NodeList nodePermission = elManifest.getElementsByTagName("permission");
				    for (int j = 0; j < nodePermission.getLength(); ++j)
				    {
				        Element elPermission = (Element) nodePermission.item(j);
				      
				        lsPermission.add(elPermission.getAttribute("android:name"));
				    }*/
	
				    
				    // ISSO PRECISA SER ARRUMADO PENSANDO EM VÁRIOS ARQUIVOS MANIFEST POR PROJETO
				    NodeList nodeUsesFeature = elManifest.getElementsByTagName("uses-feature");
				    for (int j = 0; j < nodeUsesFeature.getLength(); ++j)
				    {
				    	// ISSO DEVE SER UMA LISTA - VARIOS ELEMENTOS
				        Element elUsesFeature = (Element) nodeUsesFeature.item(j);
				        name = (elUsesFeature.getAttribute("android:name"));
				        required = Boolean.parseBoolean((elUsesFeature.getAttribute("android:required")));
				        glEsVersion = elUsesFeature.getAttribute("android:glEsVersion");
				        
				        vName[cont] = elUsesFeature.getAttribute("android:name");
				        vRequired[cont] = elUsesFeature.getAttribute("android:required");
				        //System.out.println( vName[cont]);
				        //System.out.println( vRequired[cont]);
				        cont++;
				        
				        textoFeature += elUsesFeature.getAttribute("android:name") + ";";
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
					        
					        if (intLandscape == 0 && intPortrait == 0)
					        {
					        	if(palavra.equals("landscape"))
					        		intLandscape = 1;
					        	else if(palavra.equals("portrait"))
					        		intPortrait = 1;
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
			cg.setStWifi(cont);
		if(textoPermission.contains("BLUETOOTH"))
			cg.setStBluetooth(1);
		
		// FEATURE
	for(int i = 0; i < cont; i++){
		if(vName[i].contains("microphone")) {
			cg.setFemicrophone("1");
			cg.setFemicrophoneRe(vRequired[i]);
		} else if(vName[i].contains("location")) {
			cg.setFelocation("1");
			cg.setFelocationRe(vRequired[i]);
		} else if(vName[i].contains("bluetooth")) {
			cg.setFebluetooth("1");
			cg.setFebluetoothRe(vRequired[i]);
		} else if(vName[i].contains("wifi")) {
			cg.setFewifi("1");
			cg.setFewifiRe(vRequired[i]);
		} else if(vName[i].contains("touchscreen")) {
			cg.setFetouchscreen("1");
			cg.setFetouchscreenRe(vRequired[i]);
		} else if(vName[i].contains("usb")) {
			cg.setFeusb("1");
			cg.setFeusbRe(vRequired[i]);
		} else if(vName[i].contains("faketouch")) {
			cg.setFefaketouch("1");
			cg.setFefaketouchRe(vRequired[i]);
		} else if(vName[i].contains("screen.landscape")) {
			cg.setFescreen_landscape("1");
			cg.setFescreen_landscapeRe(vRequired[i]);
		} else if(vName[i].contains("screen.portrait")) {
			cg.setFescreen_portrait("1");
			cg.setFescreen_portraitRe(vRequired[i]);
		} else if(vName[i].contains("audio")) {
			cg.setFeaudio("1");
			cg.setFeaudioRe(vRequired[i]);
		} else if(vName[i].contains("consumerir")) {
			cg.setFeconsumerir("1");
			cg.setFeconsumerirRe(vRequired[i]);
		} else if(vName[i].contains("gamepad")) {
			cg.setFegamepad("1");
			cg.setFegamepadRe(vRequired[i]);
		} else if(vName[i].contains("fingerprint")) {
			cg.setFefingerprint("1");
			cg.setFefingerprintRe(vRequired[i]);
		} else if(vName[i].contains("type.watch")) {
			cg.setFetype_watch("1");
			cg.setFetype_watchRe(vRequired[i]);
		} else if(vName[i].contains("type.television")) {
			cg.setFetype_television("1");
			cg.setFetype_televisionRe(vRequired[i]);
		} else if(vName[i].contains("type.automotive")) {
			cg.setFetype_automotive("1");
			cg.setFetype_automotiveRe(vRequired[i]);
		} else if(vName[i].contains("opengles.aep")) {
			cg.setFeopengles_aep("1");
			cg.setFeopengles_aepRe(vRequired[i]);
		} else if(vName[i].contains("nfc")) {
			cg.setFenfc("1");
			cg.setFenfcRe(vRequired[i]);
	
		} else if(vName[i].contains("sensor.stepdetector")) {
			cg.setFesensor_stepdetector("1");
			cg.setFesensor_stepdetectorRe(vRequired[i]);
		} else if(vName[i].contains("sensor.stepcounter")) {
			cg.setFesensor_stepcounter("1");
			cg.setFesensor_stepcounterRe(vRequired[i]);
		} else if(vName[i].contains("sensor.relative_humidity")) {
			cg.setFesensor_relative_humidity("1");
			cg.setFesensor_relative_humidityRe(vRequired[i]);
		} else if(vName[i].contains("sensor.proximity")) {
			cg.setFesensor_proximity("1");
			cg.setFesensor_proximityRe(vRequired[i]);
		} else if(vName[i].contains("sensor.light")) {
			cg.setFesensor_light("1");
			cg.setFesensor_lightRe(vRequired[i]);
		} else if(vName[i].contains("sensor.heartrate")) {
			cg.setFesensor_heartrate("1");
			cg.setFesensor_heartrateRe(vRequired[i]);
		} else if(vName[i].contains("sensor.hifi_sensors")) {
			cg.setFesensor_hifi_sensors("1");
			cg.setFesensor_hifi_sensorsRe(vRequired[i]);
		} else if(vName[i].contains("sensor.gyroscope")) {
			cg.setFesensor_gyroscope("1");
			cg.setFesensor_gyroscopeRe(vRequired[i]);
		} else if(vName[i].contains("sensor.compass")) {
			cg.setFesensor_compass("1");
			cg.setFesensor_compassRe(vRequired[i]);
		} else if(vName[i].contains("sensor.barometer")) {
			cg.setFesensor_barometer("1");
			cg.setFesensor_barometerRe(vRequired[i]);
		} else if(vName[i].contains("sensor.ambient_temperature")) {
			cg.setFesensor_ambient_temperature("1");
			cg.setFesensor_ambient_temperatureRe(vRequired[i]);
		} else if(vName[i].contains("sensor.accelerometer")) {
			cg.setFesensor_accelerometer("1");
			cg.setFesensor_accelerometerRe(vRequired[i]);
		}
	}
		/*
		if(textoFeature.contains("microphone"))
			cg.setFemicrophone("1");
		if(textoFeature.contains("location"))
			cg.setFelocation("1");
		if(textoFeature.contains("bluetooth"))
			cg.setFebluetooth("1");
		if(textoFeature.contains("wifi"))
			cg.setFewifi("1");
		if(textoFeature.contains("touchscreen"))
			cg.setFetouchscreen("1");
		if(textoFeature.contains("usb"))
			cg.setFeusb("1");
		if(textoFeature.contains("faketouch"))
			cg.setFefaketouch("1");
		if(textoFeature.contains("screen.landscape"))
			cg.setFescreen_landscape("1");
		if(textoFeature.contains("screen.portrait"))
			cg.setFescreen_portrait("1");
		if(textoFeature.contains("audio"))
			cg.setFeaudio("1");
		if(textoFeature.contains("consumerir"))
			cg.setFeconsumerir("1");
		if(textoFeature.contains("gamepad"))
			cg.setFegamepad("1");
		if(textoFeature.contains("fingerprint"))
			cg.setFefingerprint("1");
		if(textoFeature.contains("type.watch"))
			cg.setFetype_watch("1");
		if(textoFeature.contains("type.television"))
			cg.setFetype_television("1");
		if(textoFeature.contains("type.automotive"))
			cg.setFetype_automotive("1");
		if(textoFeature.contains("opengles.aep"))
			cg.setFeopengles_aep("1");
		if(textoFeature.contains("nfc"))
			cg.setFenfc("1");

		if(textoFeature.contains("sensor.stepdetector"))
			cg.setFesensor_stepdetector("1");
		if(textoFeature.contains("sensor.stepcounter"))
			cg.setFesensor_stepcounter("1");
		if(textoFeature.contains("sensor.relative_humidity"))
			cg.setFesensor_relative_humidity("1");
		if(textoFeature.contains("sensor.proximity"))
			cg.setFesensor_proximity("1");
		if(textoFeature.contains("sensor.light"))
			cg.setFesensor_light("1");
		if(textoFeature.contains("sensor.heartrate"))
			cg.setFesensor_heartrate("1");
		if(textoFeature.contains("sensor.hifi_sensors"))
			cg.setFesensor_hifi_sensors("1");
		if(textoFeature.contains("sensor.gyroscope"))
			cg.setFesensor_gyroscope("1");
		if(textoFeature.contains("sensor.compass"))
			cg.setFesensor_compass("1");
		if(textoFeature.contains("sensor.barometer"))
			cg.setFesensor_barometer("1");
		if(textoFeature.contains("sensor.ambient_temperature"))
			cg.setFesensor_ambient_temperature("1");
		if(textoFeature.contains("sensor.accelerometer"))
			cg.setFesensor_accelerometer("1");*/
		
		cg.setIntPortrait(intPortrait);
		cg.setIntLandscape(intLandscape);;
		cg.setMinSdkVersion(minSdkVersion);
		cg.setMinSdkVersion(minSdkVersion);
		cg.setTargetSdkVersion(targetSdkVersion);
		cg.setMaxSdkVersion(maxSdkVersion);
		cg.setBlAnyDensity(blAnyDensity);
		cg.setBlLargeScreens(blLargeScreens);
		cg.setBlNormalScreens(blNormalScreens);
		cg.setBlResizeable(blResizeable);
		cg.setBlSmallScreens(blSmallScreens);
		cg.setBlXlargeScreens(blXlargeScreens);
		cg.setGlEsVersion(glEsVersion);
		cg.setIntCompatibleWidthLimitDp(intCompatibleWidthLimitDp);
		cg.setIntLargestWidthLimitDp(intLargestWidthLimitDp);
		cg.setIntRequiresSmallestWidthDp(intRequiresSmallestWidthDp);
		cg.setLsPermission(lsPermission);
		cg.setLsUsesPermission(lsUsesPermission);
		cg.setName(name);
		cg.setProjeto(projeto);
		cg.setReqFiveWayNav(reqFiveWayNav);
		cg.setReqHardKeyboard(reqHardKeyboard);
		cg.setReqNavigation(reqNavigation);
		cg.setReqTouchScreen(reqTouchScreen);
		cg.setRequired(required);
		cg.setScreenDensity(screenDensity);
		cg.setScreenSize(screenSize);
		cg.setTargetSdkVersion(targetSdkVersion);
		return cg;
	}
}
