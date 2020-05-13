package br.com.processador;

import java.util.stream.Collectors;

/**
 * 
 * @author andreendo
 * 
 *         It filters the native Android app projects in a given folder.
 */
public class NativeProjectsFilter {
	/**
	 * @param project
	 * @return true if the project is an Android native app written in Java
	 * 
	 *         To be classified as native, the project should contain more than one
	 *         layout file and the number of Java files must be greater than the
	 *         number of source file of other languages (the following languages
	 *         were considered: JavaScript, HTML, CSS, C, C++, Ruby, Python and
	 *         Scala)
	 */
	public static boolean isNative(Projeto project) {
		var dirs = (new Diretorios()).mapearDirs(project);
		var files = (new Arquivos()).mapearArqs(dirs);
		int numberOfOtherSourceFiles = files.getArqsJS().size() 
				+ files.getArqsHTML().size() + files.getArqsCSS().size() 
				+ files.getArqsH().size() + files.getArqsC().size() 
				+ files.getArqsCPP().size() + files.getArqsRb().size() 
				+ files.getArqsPy().size() + files.getArqsScala().size();

		// remove projects with Kotlin files (mixed with Java files)
		return files.getArqsLayout().size() >= 1 
				&& files.getArqsJavaSRC().size() >= 1
				&& files.getArqsJavaSRC().size() > numberOfOtherSourceFiles 
				&& files.getArqsKotlin().size() == 0;
	}

	/**
	 * @param args[0] should be a string related to the benchmark folder.
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No benchmark folder provided.");
			System.exit(0);
		}

		var projects = (new Projeto()).listarProjetos(args[0]);
		var nativeProjects = projects.stream()
				.filter(NativeProjectsFilter::isNative)
				.collect(Collectors.toList());
		
		nativeProjects.forEach(project -> System.out.println(project.getNome()));
		System.out.println("Native apps: " + nativeProjects.size());
		System.out.println("Non-native apps: " + (projects.size() - nativeProjects.size()));
	}
}