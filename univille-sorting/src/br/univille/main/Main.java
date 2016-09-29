package br.univille.main;


import br.univille.file.ReadFile;
import br.univille.sort.BubbleSort;
import br.univille.sort.InsertionSort;
import br.univille.sort.QuickSort;
import br.univille.sort.ShakerSort;

public class Main {
	private final static int SAMPLES = 100;
	private final static int[] RESULTFILES = ReadFile.getFileNumbers("ALEATORIO_1000.txt");

	public static void main(String[] args) {
		
		/*
		 * BubleSort 
		 * 
		 */
		BubbleSort bubble = new BubbleSort();
		long media = 0;
		for(int i = 0; i < SAMPLES;i++){
			long temp = bubble.bubbleSort(RESULTFILES);
			media =+ temp;
			//System.out.println("BubleSort: " + temp);
		}
		
		System.out.println("media: "+ media/SAMPLES);
		
		/*
		
		 * Insertion Sort
		 
		InsertionSort insert = new InsertionSort();
		
		for(int i = 0; i < SAMPLES;i++){
			long temp = insert.insertionSort(RESULTFILES.clone());
			System.out.println("Insertion Sort: " + temp);
		
		}
		
		
		 * Shaker Sort
		 
		ShakerSort shaker = new ShakerSort();
		
		for(int i = 0; i < SAMPLES;i++){
			long temp = shaker.shakerSort(RESULTFILES.clone());
			System.out.println("Shaker Sort: " + temp);
		}
		
		
		
		 * Quick Sort
		 
		QuickSort quick= new QuickSort();
		
		for(int i = 0; i < SAMPLES;i++){
			long temp = quick.quickSort(RESULTFILES.clone(),0,RESULTFILES.length-1);
			System.out.println("Quick Sort: " + temp);
		}*/
		
	}

}
