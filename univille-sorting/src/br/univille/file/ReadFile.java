package br.univille.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {
	final static String PATH = "files\\";

	public static int[] getFileNumbers(String fileName){
		List<String> file = null;
		int[] list = null;
		
		try {
			file = Files.readAllLines(Paths.get(PATH+fileName));
			list = new int[file.size()];
			
			System.out.println("Quantidade de linhas no arquivo: " + file.size());
			
			for(int i = 0;i < file.size();i++){
				list[i] = Integer.parseInt(file.get(i));
			}
			
		} catch (IOException e) {
			System.out.println("Erro ao buscar o arquivo.");
			//e.printStackTrace();
		}
		
		return list;
	}
}
