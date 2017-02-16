package br.com.processador;

public class Recursos {
	private StringBuilder sbResolucoes = new StringBuilder();
	private int intSmall = 0;
	private int intNormal = 0;
	private int intLarge = 0;
	private int intXlarge = 0;
	private int intLdpi = 0;
	private int intMdpi = 0;
	private int intHdpi = 0;
	private int intXhdpi = 0;
	private int intXxhdpi = 0;
	private int intXxxhdpi = 0;
	private int intNodpi = 0;
	
	public StringBuilder getSbResolucoes() {
		return sbResolucoes;
	}
	public void setSbResolucoes(StringBuilder sbResolucoes) {
		this.sbResolucoes = sbResolucoes;
	}
	public int getIntSmall() {
		return intSmall;
	}
	public void setIntSmall(int intSmall) {
		this.intSmall = intSmall;
	}
	public int getIntNormal() {
		return intNormal;
	}
	public void setIntNormal(int intNormal) {
		this.intNormal = intNormal;
	}
	public int getIntLarge() {
		return intLarge;
	}
	public void setIntLarge(int intLarge) {
		this.intLarge = intLarge;
	}
	public int getIntXlarge() {
		return intXlarge;
	}
	public void setIntXlarge(int intXlarge) {
		this.intXlarge = intXlarge;
	}
	public int getIntLdpi() {
		return intLdpi;
	}
	public void setIntLdpi(int intLdpi) {
		this.intLdpi = intLdpi;
	}
	public int getIntMdpi() {
		return intMdpi;
	}
	public void setIntMdpi(int intMdpi) {
		this.intMdpi = intMdpi;
	}
	public int getIntHdpi() {
		return intHdpi;
	}
	public void setIntHdpi(int intHdpi) {
		this.intHdpi = intHdpi;
	}
	public int getIntXhdpi() {
		return intXhdpi;
	}
	public void setIntXhdpi(int intXhdpi) {
		this.intXhdpi = intXhdpi;
	}
	public int getIntXxhdpi() {
		return intXxhdpi;
	}
	public void setIntXxhdpi(int intXxhdpi) {
		this.intXxhdpi = intXxhdpi;
	}
	public int getIntXxxhdpi() {
		return intXxxhdpi;
	}
	public void setIntXxxhdpi(int intXxxhdpi) {
		this.intXxxhdpi = intXxxhdpi;
	}
	public int getIntNodpi() {
		return intNodpi;
	}
	public void setIntNodpi(int intNodpi) {
		this.intNodpi = intNodpi;
	}
	public StringBuilder getSbCaminhoRecurso() {
		return sbResolucoes;
	}
	public void setSbCaminhoRecurso(StringBuilder sbResolucoes) {
		this.sbResolucoes = sbResolucoes;
	}
	
	public Recursos mapearOtimizacao(Diretorios dirs)
	{
		Recursos recursos = new Recursos();
		String resolucao = "";

		for (String d : dirs.getDirsDrawable())
		{
			if (d.indexOf("/drawable-") != -1){
				resolucao = d.substring(d.indexOf("/drawable-") + 10);
				sbResolucoes.append(resolucao + ";");
						
				if (resolucao.equals("small"))
					recursos.setIntSmall(1);
				if (resolucao.equals("normal"))
					recursos.setIntNormal(1);
				if (resolucao.equals("large"))
					recursos.setIntLarge(1);
				if (resolucao.equals("xlarge"))
					recursos.setIntXlarge(1);
				if (resolucao.equals("ldpi"))
					recursos.setIntLdpi(1);
				if (resolucao.equals("mdpi"))
					recursos.setIntMdpi(1);
				if (resolucao.equals("hdpi"))
					recursos.setIntHdpi(1);
				if (resolucao.equals("xhdpi"))
					recursos.setIntXhdpi(1);
				if (resolucao.equals("xxhdpi"))
					recursos.setIntXxhdpi(1);
				if (resolucao.equals("xxxhdpi"))
					recursos.setIntXxxhdpi(1);
				if (resolucao.equals("nodpi"))
					recursos.setIntNodpi(1);
			}
		}
		recursos.setSbCaminhoRecurso(sbResolucoes);
		return recursos;
	}
}
