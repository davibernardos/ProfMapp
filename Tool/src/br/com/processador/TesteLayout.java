package br.com.processador;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class TesteLayout {
	public static void main(String[] args){
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse("/home/bernardo/Repositorio2/Apollo-CM/res/layout-land/activity_player_base.xml");
				
			NodeList nodeRelativeLayout = doc.getElementsByTagName("RelativeLayout");
			System.out.print("relative: "+nodeRelativeLayout.getLength());
			
			NodeList nodeTextView = doc.getElementsByTagName("TextView");
			System.out.print("\ntextview: "+nodeTextView.getLength());
			
			NodeList nodeFrameLayout = doc.getElementsByTagName("FrameLayout");
			System.out.print("\nFrameLayout : "+nodeFrameLayout.getLength());
			
			NodeList nodeLinearLayout = doc.getElementsByTagName("LinearLayout");
			System.out.print("\nLinearLayout: "+nodeLinearLayout.getLength());
			
			NodeList nodeImageView = doc.getElementsByTagName("ImageView");
			System.out.print("\nImageView: "+nodeImageView.getLength());
			/*for (int i = 0; i < nodeRelativeLayout.getLength(); ++i)
			{
			    Element elManifest = (Element) nodeManifest.item(i);
			    String stXmlns = elManifest.getAttribute("xmlns:android");
			
			}*/
		} catch (Exception ex) { 
	         ex.printStackTrace (); 
	    }
	}
}
