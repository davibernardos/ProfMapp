package br.com.processador;

import java.util.*;

public class Utilitarios {

	/* BUSCA PALAVRAS-CHAVE EM STRING
	 * -----------------------------------------------*/
	public String buscaPalavra(String texto, String palavraChave) {
		if (texto.toLowerCase().contains(palavraChave.toLowerCase())) {
			return texto;
		}
		return "0";
	}
	
	/* REMOVE REPETICAO
	 * -----------------------------------------------*/
	public String removeRepeticao(String texto){
		String palavras = "\n";
        String[] array = texto.split("!");
        array = new HashSet<String>(Arrays.asList(array)).toArray(new String[0]);
        for (String str : array)
        {
        	if(!str.trim().equals("")){
        		palavras += "" + str;
        	}
        }
        return palavras;
	}
	
	/* REMOVE REPETICAO
	 * -----------------------------------------------*/
	public StringBuilder removeRepeticao23(StringBuilder texto){
		StringBuilder palavras = new StringBuilder();
		
        String[] array = texto.toString().split(";");
        array = new HashSet<String>(Arrays.asList(array)).toArray(new String[0]);
        for (String str : array)
        {
        	if(!str.trim().equals("")){
        		palavras.append(str + ";");
        	}
        }
        return palavras;
	}
	
	/* PULA LINHAS EM LISTA
	 * -----------------------------------------------*/
	public StringBuilder quebraLista(ArrayList<String> lista){
		StringBuilder sb = new StringBuilder();
		
		for(String ls : lista){
			//if(!ls.trim().equals("")){
			//System.out.println(ls);
				sb.append(ls + "\n");
			//}
		}
		return sb;
	}

	/* IMPRIME STRINGBUILDER
	 * -----------------------------------------------*/
	public ArrayList<String> contarPalavras(ArrayList<String> lista, String dicionario)
	{
		ArrayList<String> lsSaida = new ArrayList<String>();
		int cont = 0;

		for(String dic : dicionario.split(";"))
		{
			for(String ls : lista)
			{
				if(ls.contains(dic))
				{
					cont++;
				}
			}
			lsSaida.add(dic + ": " + cont);
		}
		return lsSaida;
	}
	
	/* IMPRIME STRINGBUILDER
	 * -----------------------------------------------*/
	public void imprimeSB(StringBuilder sb){
		System.out.println(sb.toString());
	}
	
	
	/* IMPRIME ARRAYLIST
	 * -----------------------------------------------*/
	public void imprimeAL(ArrayList<String> lista){
		//Collections.sort(lista);
		for(String ls : lista){
			System.out.println(ls);
		}
	}
	
	public int contaSB(StringBuilder sb){
		int cont = 0;
		
		for(String s : sb.toString().split(";")){
			cont++;
		}
		return cont;
	}
	
	public int converteBoleano(boolean b){
		if(b)
			return 1;
		else
			return 0;
	}
	
	public String converteBoleano(String b){

		if(b.toUpperCase().equals("TRUE")){
			return "1";
		}else if(b.toUpperCase().equals("FALSE")){
			return "0";
		}else
			return "-";
	}
}