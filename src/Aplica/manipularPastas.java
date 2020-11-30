package Aplica;

import java.io.File;
import java.util.Scanner;

public class manipularPastas {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS");
		for (File folder : folders);
			System.out.println(folder);
	}
	
	File[] files = path.listtFiles(File::isFile);
	System.out.println("FILES");
	for (File file : files) {
		System.out.println(file);
	}

	boolean sucess = new File(strPath + " \\sudir").mkdir();
	System.out.println("Directory created sucecessfully");

       sc.close();



}
