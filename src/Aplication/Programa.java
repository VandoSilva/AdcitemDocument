package Aplication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Programa {

	public static void main(String[] args) {
		
		
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good nigth"};
		
		String path ="c:\\Users\\Cronos Info\\eclipse-workspace\\ont.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}