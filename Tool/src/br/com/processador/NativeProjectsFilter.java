package br.com.processador;

/**
 * 
 * @author andreendo
 * 
 *         It filters the native Android app projects in a given folder.
 */
public class NativeProjectsFilter {

	public static String PROJECTS_FOLDER = "/home/utfpr/github/endo/newProjs";

	/**
	 * 
	 * @param p
	 * @return true if the project is an Android native app written in Java
	 * 
	 *         To be classified as native, the project should contain more than one
	 *         layout file and the number of Java files must be greater than the
	 *         number of source file of other languages (the following languages
	 *         were considered: JavaScript, HTML, CSS, C, C++, Ruby, Python and
	 *         Scala)
	 */
	public static boolean isNative(Projeto p) {
		Diretorios dirs = (new Diretorios()).mapearDirs(p);
		Arquivos files = (new Arquivos()).mapearArqs(dirs);

		int numberOfOtherSourceFiles = files.getArqsJS().size() + files.getArqsHTML().size() + files.getArqsCSS().size()
				+ files.getArqsH().size() + files.getArqsC().size() + files.getArqsCPP().size()
				+ files.getArqsRb().size() + files.getArqsPy().size() + files.getArqsScala().size();

		// remove projects with Kotlin files (mixed with Java files)
		if (files.getArqsLayout().size() >= 1 && files.getArqsJavaSRC().size() >= 1
				&& files.getArqsJavaSRC().size() > numberOfOtherSourceFiles && files.getArqsKotlin().size() == 0)
			return true;

		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Projeto projeto = new Projeto();

		int numNativeApps = 0, numNonNativeApps = 0;
		for (Projeto p : projeto.listarProjetos(PROJECTS_FOLDER)) {
			if (isNative(p)) {
				numNativeApps++;
				System.out.println(p.getNome());
			} else
				numNonNativeApps++;

		}

		System.out.println("Native apps: " + numNativeApps);
		System.out.println("Non native apps: " + numNonNativeApps);
	}
}