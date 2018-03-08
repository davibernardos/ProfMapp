package br.com.processador;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.GregorianCalendar;  

public class Redator {

    /* ESCREVE ARQUIVO TEXTO
    -------------------------------------------------------------*/
	public void escrita(StringBuilder texto, String nomeDocumento) {

        FileWriter arq;
        try {

            arq = new FileWriter("/home/bernardo/Repositorio/" + nomeDocumento);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(texto);
            arq.close();

        } catch (IOException ex) {

           Logger.getLogger(Redator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String leitura() {
        String texto = "";
        try {
            FileReader arq = new FileReader("/home/davi/texto.txt");
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();

            while (linha != null) {
                texto += " " + linha;
                linha = lerArq.readLine();
            }
            arq.close();
            return texto;

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
            return "erro";
        }

    }
	
	
    /* LÊ ARQUIVO TEXTO
    -------------------------------------------------------------*/
    public double contaLinhasProducao(String caminho, double linhasProducao) {
        boolean flag = true;
        try {
           // System.out.println(caminho);
            FileReader arq = new FileReader(caminho);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();

            while (linha != null) 
            {
                if (!linha.trim().equals("") && !linha.trim().startsWith("//")){
                	if (!linha.trim().startsWith("/*") && flag){
                		linhasProducao++;
                	} else if(linha.trim().contains("*/"))
                    	flag = true;
                	else
                		flag = false;
                }
               
                
                linha = lerArq.readLine();
            }
            arq.close();
           //System.out.println(linhasProducao);
            return linhasProducao;

        } catch (IOException e) {

            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
            return 0.0;
        }

    }
    
    /* CAPTURA DATA INICIO
    -------------------------------------------------------------*/
    public String dataInicio(String nomeProjeto) 
    {
		GregorianCalendar calendar = new GregorianCalendar();
		String texto = "";
		
		texto += "\n==========================================================";
		texto += "\n Projeto " + nomeProjeto + " iniciado em: " + calendar.getTime();
		texto += "\n==========================================================";

		return texto;
	}

    /* CAPTURA DATA FIM
    -------------------------------------------------------------*/
	public String dataFim() 
	{
		GregorianCalendar calendar = new GregorianCalendar();
		String texto = "";
		
		texto += "\n\n=====================================================";
		texto += "\n Relatório finalizado em: " + calendar.getTime();
		texto += "\n=====================================================";

		return texto;
	}
	
    /* ESCREVE RELATÓRIO FINAL - INFO GERAL
    -------------------------------------------------------------*/
	public StringBuilder escreverRelatorio(Arquivos a, Desafios d, Sensores s, Frameworks f, Configuracao c, Recursos r, Metricas m, Layouts l){
		StringBuilder sb = new StringBuilder();
		
		sb.append(dataInicio(a.getDiretorio().getProjeto().getNome()));
		sb.append("\n** FRAMEWORKS");
		sb.append(f.getFrameworks());
		
		return sb;
	}
	
    /* ESCREVE LOG POR PROJETO - INFO DETALHADO
    -------------------------------------------------------------*/
	public StringBuilder escreverLog(Arquivos a, Desafios d, Sensores s, Frameworks f, Configuracao c, Recursos r, Metricas m, Layouts l){
		Utilitarios uti = new Utilitarios();
		StringBuilder sb = new StringBuilder();
		
		sb.append(dataInicio(a.getDiretorio().getProjeto().getNome()));
		
		sb.append("\n** DIRETÓRIOS DE PRODUÇÃO: \n" + uti.quebraLista(a.getDiretorio().getDirsSRC()));
		sb.append("\n** DIRETÓRIOS DE RECURSOS: \n" + uti.quebraLista(a.getDiretorio().getDirsRes()));
		sb.append("\n** DIRETÓRIOS DE INTERNACIONALIZAÇÃO: \n" + uti.quebraLista(a.getDiretorio().getDirsValues()));
		sb.append("\n** DIRETÓRIOS DE LAYOUT: \n" + uti.quebraLista(a.getDiretorio().getDirsLayout()));
		sb.append("\n** DIRETÓRIOS DE IMAGENS: \n" + uti.quebraLista(a.getDiretorio().getDirsDrawable()));
		sb.append("\n** DIRETÓRIOS DE TESTE: \n" + uti.quebraLista(a.getDiretorio().getDirsTeste()));
		sb.append("\n** CLASSES JAVA DE PRODUÇÃO: \n" + uti.quebraLista(a.getArqsJavaSRC()));
		sb.append("\n** CLASSES JAVA DE TESTE: \n" + uti.quebraLista(a.getArqsJavaTeste()));
		sb.append("\n** ARQUIVO DE CONFIGURAÇÃO: \n" + uti.quebraLista(a.getArqsManifesto()));
		sb.append("\n** ARQUIVOS XML: \n" + uti.quebraLista(a.getArqsXML()));
		sb.append("\n** ARQUIVOS DE INTERNACIONALIZAÇÃO: \n" + uti.quebraLista(a.getArqsValues()));
		sb.append("\n** ARQUIVOS DE LAYOUT: \n" + uti.quebraLista(a.getArqsLayout()));
		sb.append("\n** ARQUIVOS DE IMAGENS: \n" + uti.quebraLista(a.getArqsDrawable()));
		
		sb.append("\n** DESAFIOS PRODUCAO");
		sb.append(d.getDesafiosSRC());
		
		sb.append("\n** DESAFIOS TESTE");
		sb.append(d.getDesafiosTeste());
		
		sb.append("\n** SENSORES PRODUCAO");
		sb.append(s.getSensoresSRC());
		
		sb.append("\n** SENSORES TESTE");
		sb.append(s.getSensoresTeste());
		
		sb.append("\n** IMPORTS TESTE");
		sb.append(f.getImportsTeste());
		
		sb.append("\n** PACOTES SRC");
		sb.append(f.getPacotesSRC());
		
		sb.append("\n** FRAMEWORKS");
		sb.append(f.getFrameworks());
		return sb;
	}
	
    /* ESCREVE CSV POR PROJETO - INFO TABULAR
    -------------------------------------------------------------*/
	public StringBuilder escreverCSV(Arquivos a, Desafios d, Sensores s, Frameworks f, Configuracao c, Recursos r, Metricas m, Layouts l){
		Utilitarios uti = new Utilitarios();
		StringBuilder sb = new StringBuilder();
		
		// PROJETO
		sb.append(a.getDiretorio().getProjeto().getNome().toLowerCase() + ";");
		
		// PRODUCAO E TESTE
		sb.append(a.getDiretorio().getDirsSRC().size() + ";"  + a.getDiretorio().getDirsTeste().size() + ";");	
		sb.append(a.getArqsJavaSRC().size() + ";" + a.getArqsJavaTeste().size() + ";");
		sb.append(m.getLinhasSRC() + ";" + m.getLinhasTeste() + ";");
		sb.append(d.getContadorDeMetodosSRC() + ";" + d.getContadorDeMetodosTeste() + ";");
		sb.append(uti.contaSB(f.getPacotesSRC()) + ";" + uti.contaSB(f.getPacotesTeste()) + ";");
		
		// IDES
		sb.append(a.getDiretorio().getArqsAStudio().size() + ";" + a.getDiretorio().getArqsEclipse().size() + ";");
		
		// OUTRAS LINGUAGENS
		sb.append(a.getArqsXML().size() + ";" + a.getArqsJS().size() + ";" + a.getArqsHTML().size() + ";" + a.getArqsCSS().size() + ";" + a.getArqsH().size() + ";" + a.getArqsC().size() + ";" + a.getArqsCPP().size() + ";" +a.getArqsRb().size() + ";" +a.getArqsPy().size() + ";" +a.getArqsScala().size() + ";");
				
		// RECURSOS (VALUES (-1) IGNORA PASTA PRINCIPAL) - NÃO DEU CERTO - REVER
		sb.append(a.getDiretorio().getDirsValues().size() + ";" + a.getDiretorio().getDirsLayout().size() + ";" + a.getDiretorio().getDirsDrawable().size() + ";");
		sb.append(a.getArqsValues().size() + ";" + a.getArqsLayout().size() + ";" + a.getArqsDrawable().size() + ";");
		
		// RESIZE SCREEN - RES
		sb.append(r.getIntSmall() + ";" +  r.getIntNormal() + ";" +  r.getIntLarge() + ";" +  r.getIntXlarge() + ";" +  r.getIntLdpi() + ";" +  r.getIntMdpi() + ";" +  r.getIntHdpi() + ";" +  r.getIntXhdpi() + ";" +  r.getIntXxhdpi() + ";" +  r.getIntXxxhdpi() + ";" +  r.getIntNodpi() + ";");
		
		//USES-FEATURE
		//sb.append(c.getName() + ";" + uti.converteBoleano(c.isRequired()) + ";" + c.getGlEsVersion() + ";");
		
		// SUPPORT SCREEN
		sb.append(uti.converteBoleano(c.isBlResizeable()) + ";" + uti.converteBoleano(c.isBlSmallScreens()) + ";" + uti.converteBoleano(c.isBlNormalScreens()) + ";");
		sb.append(c.isBlLargeScreens() + ";" + c.isBlXlargeScreens() + ";" + uti.converteBoleano(c.isBlAnyDensity()) + ";" + c.getIntRequiresSmallestWidthDp() + ";" + c.getIntCompatibleWidthLimitDp() + ";" + c.getIntLargestWidthLimitDp() + ";");
		
		// COMPATIBLE SCREEN
		sb.append(c.getScreenSize() + ";" + c.getScreenDensity() + ";");
		
		//USES-CONFIGURATION
		sb.append(uti.converteBoleano(c.isReqFiveWayNav()) + ";" + uti.converteBoleano(c.isReqHardKeyboard()) + ";" + c.getReqKeyboardType() + ";" + c.getReqNavigation() + ";" + c.getReqTouchScreen() + ";");
		
		//VERSION
		sb.append(c.getMinSdkVersion() + ";" + c.getTargetSdkVersion() + ";" + c.getMaxSdkVersion() + ";");
		
		//ORIENTATION
		sb.append(c.getIntPortrait() + ";" + c.getIntLandscape() + ";");
		
		//PERMISSIONS
		sb.append(c.getNetworkState() + ";" + c.getNetworkState() + ";" + c.getBluetooth() + ";" + c.getBluetoothAdmin() + ";" + c.getInternet() + ";" + c.getChangeNetworkState() + ";" + c.getChangeWifiState() + ";" );
		
		// SENSORS SRC
		sb.append(s.getSrcAccelerometer() + ";" +  s.getSrcAmbient_temperature() + ";" +  s.getSrcGravity() + ";" +  s.getSrcGyroscope() + ";" +  s.getSrcLight() + ";" +  s.getSrcLinear_acceleration() + ";" +  s.getSrcMagnetic_field() + ";" +  s.getSrcOrientation() + ";" +  s.getSrcPressure() + ";" +  s.getSrcProximity() + ";" +  s.getSrcRelative_humidity() + ";" +  s.getSrcRotation_vector() + ";" +  s.getSrcTemperature() + ";" + s.getSrcGpsLocation() + ";");
		
		// SENSORS TESTE
		sb.append(s.getTesteAccelerometer() + ";" +  s.getTesteAmbient_temperature() + ";" +  s.getTesteGravity() + ";" +  s.getTesteGyroscope() + ";" +  s.getTesteLight() + ";" +  s.getTesteLinear_acceleration() + ";" +  s.getTesteMagnetic_field() + ";" +  s.getTesteOrientation() + ";" +  s.getTestePressure() + ";" +  s.getTesteProximity() + ";" +  s.getTesteRelative_humidity() + ";" +  s.getTesteRotation_vector() + ";" +  s.getTesteTemperature() + ";" + s.getTesteGpsLocation() + ";");
	
		// SENSORS XML
		sb.append(c.getStWifi() + ";" + c.getStBluetooth() + ";" + c.getStInternet() + ";" + c.getStNetwork() + ";" + c.getStLocation() + ";" + c.getStAccess_gps() + ";" + c.getStRecord_audio() + ";");
		
		// DESAFIOS SRC
		sb.append(d.getSrcConnected() + ";" + d.getSrcGUI() + ";" + d.getSrcResources() + ";" + d.getSrcSensors() + ";" + d.getSrcMultiple() + ";");
		
		// DESAFIOS TESTE
		sb.append(d.getTesteConnected() + ";" + d.getTesteGUI() + ";" + d.getTesteResources() + ";" + d.getTesteSensors() + ";" + d.getTesteMultiple() + ";");
		
		// FRAMEWORKS
		sb.append(f.getStandroid()  + ";" + f.getStjunit() + ";" + f.getStrobolectric() + ";" + f.getSthamcrest() + ";" + f.getStfest() + ";"); 
		sb.append(f.getStrobotium() + ";" + f.getStselenium() + ";" + f.getStespresso() + ";" + f.getStuiautomator() + ";");
		sb.append(f.getSteasymock() + ";" + f.getStmock() + ";" + f.getStmockito() + ";" + f.getStmonkeyrunner() + ";" + f.getStappium() + ";");
		sb.append(f.getSttestng() + ";" +  f.getStjmeter() + ";" + f.getStselendroid() + ";");
		//f.getStspongycastle() + ";" + f.getStjersey() + ";" + f.getStroboguice()
				
		// LAYOUT
		sb.append(l.getStFrameLayout() + ";" +l.getStLinearLayout() + ";" +l.getStTableLayout() + ";" + l.getStGridLayout() + ";" +l.getStRelativeLayout() + ";");
		
		// WIDGETS
		sb.append(l.getStTextView() + ";" +l.getStButton() + ";" +l.getStRadioButton() + ";" + l.getStCheckBox() + ";" +l.getStSwitch() + ";");
		sb.append(l.getStToggleButton() + ";" +l.getStImageView() + ";" +l.getStProgressBar() + ";" +l.getStSeekBar() + ";" +l.getStRatingBar() + ";" + l.getStSpinner() + ";" +l.getStWebView() + ";" +l.getStText() + ";");
		
		// TEXT FIELD
		sb.append(l.getStEditText() + ";" + l.getStPersonName() + ";" +l.getStPassword() + ";" + l.getStPhone() + ";" + l.getStMultilineText() + ";" +l.getStNumber() + ";");
		
		// CONTAINERS
		sb.append(l.getStRadioGroup() + ";" +l.getStListView() + ";" +l.getStGridView() + ";");
		
		// EVENTOS GUI
		sb.append(d.getOnswipetouchlistener() + ";" +  d.getOndoubletaplistener() + ";" +  d.getOnscalegesturelistener() + ";" +  d.getShakelistener() + ";" +  d.getOndraglistener() + ";" +  d.getOnscrolllistener() + "\n");
		
		return sb;
	}
	
	public StringBuilder escreverDesafios(Desafios d){
		StringBuilder sb = new StringBuilder();
		sb.append(d.getDesafiosTeste());
		
		return	sb;
	}
}
