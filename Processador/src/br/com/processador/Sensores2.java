package br.com.processador;

import java.util.ArrayList;

public class Sensores2 {
	
	//SENSORS SRC
	private String srcAccelerometer = "0";
	private String srcAmbient_temperature = "0";
	private String srcGravity = "0";
	private String srcGyroscope = "0";
	private String srcLight = "0";
	private String srcLinear_acceleration = "0";
	private String srcMagnetic_field = "0";
	private String srcOrientation = "0";
	private String srcPressure = "0";
	private String srcProximity = "0";
	private String srcRelative_humidity = "0";
	private String srcRotation_vector = "0";
	private String srcTemperature = "0";
	
	//SENSORS TESTE
	private String testeAccelerometer = "0";
	private String testeAmbient_temperature = "0";
	private String testeGravity = "0";
	private String testeGyroscope = "0";
	private String testeLight = "0";
	private String testeLinear_acceleration = "0";
	private String testeMagnetic_field = "0";
	private String testeOrientation = "0";
	private String testePressure = "0";
	private String testeProximity = "0";
	private String testeRelative_humidity = "0";
	private String testeRotation_vector = "0";
	private String testeTemperature = "0";
	
	private Arquivos arquivos = new Arquivos();
	private ArrayList<String> sensoresSRC = new ArrayList<String>();
	private ArrayList<String> sensoresTeste = new ArrayList<String>();
	private String listaDeSensores = "ACCELEROMETER;AMBIENT_TEMPERATURE;GRAVITY;GYROSCOPE;LIGHT;LINEAR_ACCELERATION;MAGNETIC_FIELD;"
			+ "ORIENTATION;PRESSURE;PROXIMITY;RELATIVE_HUMIDITY;ROTATION_VECTOR;TEMPERATURE";
	
	
	public Arquivos getArquivos() {
		return arquivos;
	}
	public void setArquivos(Arquivos arquivos) {
		this.arquivos = arquivos;
	}
	public String getListaDeSensores() {
		return listaDeSensores;
	}
	public void setListaDeSensores(String listaDeSensores) {
		this.listaDeSensores = listaDeSensores;
	}
	public ArrayList<String> getSensoresSRC() {
		return sensoresSRC;
	}
	public void setSensoresSRC(ArrayList<String> sensoresSRC) {
		this.sensoresSRC = sensoresSRC;
	}
	public ArrayList<String> getSensoresTeste() {
		return sensoresTeste;
	}
	public void setSensoresTeste(ArrayList<String> sensoresTeste) {
		this.sensoresTeste = sensoresTeste;
	}
	
	
	public String getSrcAccelerometer() {
		return srcAccelerometer;
	}
	public void setSrcAccelerometer(String srcAccelerometer) {
		this.srcAccelerometer = srcAccelerometer;
	}
	public String getSrcAmbient_temperature() {
		return srcAmbient_temperature;
	}
	public void setSrcAmbient_temperature(String srcAmbient_temperature) {
		this.srcAmbient_temperature = srcAmbient_temperature;
	}
	public String getSrcGravity() {
		return srcGravity;
	}
	public void setSrcGravity(String srcGravity) {
		this.srcGravity = srcGravity;
	}
	public String getSrcGyroscope() {
		return srcGyroscope;
	}
	public void setSrcGyroscope(String srcGyroscope) {
		this.srcGyroscope = srcGyroscope;
	}
	public String getSrcLight() {
		return srcLight;
	}
	public void setSrcLight(String srcLight) {
		this.srcLight = srcLight;
	}
	public String getSrcLinear_acceleration() {
		return srcLinear_acceleration;
	}
	public void setSrcLinear_acceleration(String srcLinear_acceleration) {
		this.srcLinear_acceleration = srcLinear_acceleration;
	}
	public String getSrcMagnetic_field() {
		return srcMagnetic_field;
	}
	public void setSrcMagnetic_field(String srcMagnetic_field) {
		this.srcMagnetic_field = srcMagnetic_field;
	}
	public String getSrcOrientation() {
		return srcOrientation;
	}
	public void setSrcOrientation(String srcOrientation) {
		this.srcOrientation = srcOrientation;
	}
	public String getSrcPressure() {
		return srcPressure;
	}
	public void setSrcPressure(String srcPressure) {
		this.srcPressure = srcPressure;
	}
	public String getSrcProximity() {
		return srcProximity;
	}
	public void setSrcProximity(String srcProximity) {
		this.srcProximity = srcProximity;
	}
	public String getSrcRelative_humidity() {
		return srcRelative_humidity;
	}
	public void setSrcRelative_humidity(String srcRelative_humidity) {
		this.srcRelative_humidity = srcRelative_humidity;
	}
	public String getSrcRotation_vector() {
		return srcRotation_vector;
	}
	public void setSrcRotation_vector(String srcRotation_vector) {
		this.srcRotation_vector = srcRotation_vector;
	}
	public String getSrcTemperature() {
		return srcTemperature;
	}
	public void setSrcTemperature(String srcTemperature) {
		this.srcTemperature = srcTemperature;
	}
	public String getTesteAccelerometer() {
		return testeAccelerometer;
	}
	public void setTesteAccelerometer(String testeAccelerometer) {
		this.testeAccelerometer = testeAccelerometer;
	}
	public String getTesteAmbient_temperature() {
		return testeAmbient_temperature;
	}
	public void setTesteAmbient_temperature(String testeAmbient_temperature) {
		this.testeAmbient_temperature = testeAmbient_temperature;
	}
	public String getTesteGravity() {
		return testeGravity;
	}
	public void setTesteGravity(String testeGravity) {
		this.testeGravity = testeGravity;
	}
	public String getTesteGyroscope() {
		return testeGyroscope;
	}
	public void setTesteGyroscope(String testeGyroscope) {
		this.testeGyroscope = testeGyroscope;
	}
	public String getTesteLight() {
		return testeLight;
	}
	public void setTesteLight(String testeLight) {
		this.testeLight = testeLight;
	}
	public String getTesteLinear_acceleration() {
		return testeLinear_acceleration;
	}
	public void setTesteLinear_acceleration(String testeLinear_acceleration) {
		this.testeLinear_acceleration = testeLinear_acceleration;
	}
	public String getTesteMagnetic_field() {
		return testeMagnetic_field;
	}
	public void setTesteMagnetic_field(String testeMagnetic_field) {
		this.testeMagnetic_field = testeMagnetic_field;
	}
	public String getTesteOrientation() {
		return testeOrientation;
	}
	public void setTesteOrientation(String testeOrientation) {
		this.testeOrientation = testeOrientation;
	}
	public String getTestePressure() {
		return testePressure;
	}
	public void setTestePressure(String testePressure) {
		this.testePressure = testePressure;
	}
	public String getTesteProximity() {
		return testeProximity;
	}
	public void setTesteProximity(String testeProximity) {
		this.testeProximity = testeProximity;
	}
	public String getTesteRelative_humidity() {
		return testeRelative_humidity;
	}
	public void setTesteRelative_humidity(String testeRelative_humidity) {
		this.testeRelative_humidity = testeRelative_humidity;
	}
	public String getTesteRotation_vector() {
		return testeRotation_vector;
	}
	public void setTesteRotation_vector(String testeRotation_vector) {
		this.testeRotation_vector = testeRotation_vector;
	}
	public String getTesteTemperature() {
		return testeTemperature;
	}
	public void setTesteTemperature(String testeTemperature) {
		this.testeTemperature = testeTemperature;
	}
	
	
	public Sensores2 mapearSensores(Arquivos arqs) throws Exception{
		Sensores2 sensores = new Sensores2();
		Analisador analisador = new Analisador();
		Utilitarios uti = new Utilitarios();
		String retorno = "";
		String texto = "";
		
		for (String caminhoClasse : arqs.getArqsJavaSRC()){
			retorno = analisador.visitarConteudo(analisador.mapearClasse(caminhoClasse), listaDeSensores);
			if(!retorno.equals(""))
				texto += retorno;
		}
		sensoresSRC.add(uti.removeRepeticao(texto));
		texto = "";
		
		for (String caminhoClasse : arqs.getArqsJavaTeste()){
			retorno = analisador.visitarConteudo(analisador.mapearClasse(caminhoClasse), listaDeSensores);
			if(!retorno.equals(""))
				texto += retorno;
		}
		sensoresTeste.add(texto);
		
		for(String s : sensoresSRC){
			if(s.contains("ACCELEROMETER")){
				srcAccelerometer = "1";
			} else if(s.contains("AMBIENT_TEMPERATURE")){
				 srcAmbient_temperature = "1";
			} else if(s.contains("GRAVITY")){
				 srcGravity = "1";
			} else if(s.contains("GYROSCOPE")){
				 srcGyroscope = "1";
			} else if(s.contains("LIGHT")){
				 srcLight = "1";
			} else if(s.contains("LINEAR_ACCELERATION")){
				 srcLinear_acceleration = "1";
			} else if(s.contains("MAGNETIC_FIELD")){
				 srcMagnetic_field = "1";
			} else if(s.contains("ORIENTATION")){
				 srcOrientation = "1";
			} else if(s.contains("PRESSURE")){
				 srcPressure = "1";
			} else if(s.contains("PROXIMITY")){
				 srcProximity = "1";
			} else if(s.contains("RELATIVE_HUMIDITY")){
				 srcRelative_humidity = "1";
			} else if(s.contains("ROTATION_VECTOR")){
				 srcRotation_vector = "1";
			} else if(s.contains(";TEMPERATURE;")){
				 srcTemperature = "1";
			}
		}
		
		for(String s : sensoresTeste){
			if(s.contains("ACCELEROMETER")){
				testeAccelerometer = "1";
			} else if(s.contains("AMBIENT_TEMPERATURE")){
				 testeAmbient_temperature = "1";
			} else if(s.contains("GRAVITY")){
				 testeGravity = "1";
			} else if(s.contains("GYROSCOPE")){
				 testeGyroscope = "1";
			} else if(s.contains("LIGHT")){
				 testeLight = "1";
			} else if(s.contains("LINEAR_ACCELERATION")){
				 testeLinear_acceleration = "1";
			} else if(s.contains("MAGNETIC_FIELD")){
				 testeMagnetic_field = "1";
			} else if(s.contains("ORIENTATION")){
				 testeOrientation = "1";
			} else if(s.contains("PRESSURE")){
				 testePressure = "1";
			} else if(s.contains("PROXIMITY")){
				 testeProximity = "1";
			} else if(s.contains("RELATIVE_HUMIDITY")){
				 testeRelative_humidity = "1";
			} else if(s.contains("ROTATION_VECTOR")){
				 testeRotation_vector = "1";
			} else if(s.contains("TEMPERATURE")){
				 testeTemperature = "1";
			}
		}
		
		sensores.setSrcAccelerometer(srcAccelerometer);
		sensores.setSrcAmbient_temperature(srcAmbient_temperature);
		sensores.setSrcGravity(srcGravity);
		sensores.setSrcGyroscope(srcGyroscope);
		sensores.setSrcLight(srcLight);
		sensores.setSrcLinear_acceleration(srcLinear_acceleration);
		sensores.setSrcMagnetic_field(srcMagnetic_field);
		sensores.setSrcOrientation(srcOrientation);
		sensores.setSrcPressure(srcPressure);
		sensores.setSrcProximity(srcProximity);
		sensores.setSrcRelative_humidity(srcRelative_humidity);
		sensores.setSrcRotation_vector(srcRotation_vector);
		sensores.setSrcTemperature(srcTemperature);
		
		sensores.setTesteAccelerometer(testeAccelerometer);
		sensores.setTesteAmbient_temperature(testeAmbient_temperature);
		sensores.setTesteGravity(testeGravity);
		sensores.setTesteGyroscope(testeGyroscope);
		sensores.setTesteLight(testeLight);
		sensores.setTesteLinear_acceleration(testeLinear_acceleration);
		sensores.setTesteMagnetic_field(testeMagnetic_field);
		sensores.setTesteOrientation(testeOrientation);
		sensores.setTestePressure(testePressure);
		sensores.setTesteProximity(testeProximity);
		sensores.setTesteRelative_humidity(testeRelative_humidity);
		sensores.setTesteRotation_vector(testeRotation_vector);
		sensores.setTesteTemperature(testeTemperature);
		
		sensores.setSensoresSRC(sensoresSRC);
		sensores.setSensoresTeste(sensoresTeste);
		sensores.setArquivos(arqs);
		return sensores;
	}
	
}
