package br.com.processador;

public class Metricas {
	private double linhasSRC;
	private double linhasTeste;
	
	public double getLinhasSRC() {
		return linhasSRC;
	}
	public void setLinhasSRC(double linhasSRC) {
		this.linhasSRC = linhasSRC;
	}
	public double getLinhasTeste() {
		return linhasTeste;
	}
	public void setLinhasTeste(double linhasTeste) {
		this.linhasTeste = linhasTeste;
	}
	
	public Metricas mapearMetricas(Arquivos arqs) throws Exception{
		Metricas metricas = new Metricas();
		Redator redator = new Redator();
		linhasSRC = 0;
		linhasTeste = 0;
		
		for (String a : arqs.getArqsJavaSRC()){
			//System.out.println(a);
			linhasSRC = redator.contaLinhasProducao(a, linhasSRC);
		}
		
		for (String a : arqs.getArqsJavaTeste()){
			linhasTeste = redator.contaLinhasProducao(a, linhasTeste);
		}
		
		metricas.setLinhasSRC(linhasSRC);
		metricas.setLinhasTeste(linhasTeste);
		
		return metricas;
	}
	
}
