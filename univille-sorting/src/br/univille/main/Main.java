package br.univille.main;


import br.univille.file.ReadFile;
import br.univille.sort.BubbleSort;
import br.univille.sort.InsertionSort;
import br.univille.sort.QuickSort;
import br.univille.sort.ShakerSort;
import br.univille.statistic.Deviation;

public class Main {
	private final static int SAMPLES = 100;
	private final static int[] RESULTFILES = ReadFile.getFileNumbers("REVERSO_100000.txt");

	public static void main(String[] args) {
		
		/*
		 * BubleSort 
		 * 
		 */
		
		System.out.println("=== Bubblesort ===");
		
		BubbleSort bubble = new BubbleSort();
		long[] media = new long[SAMPLES];
		for(int i = 0; i < SAMPLES;i++){
			media[i] = bubble.bubbleSort(RESULTFILES);
			//System.out.println("BubleSort: " + media[i]);
		}
		long mean = Deviation.findMean(media);
		System.out.println("media: "+ mean);
		System.out.println("desvio padrao: "+ Deviation.findDeviation2(media, mean));
		

		/*
		 * 
		 * Insertion Sort
		*/
		
		System.out.println("=== Insertion Sort ===");
		
		InsertionSort insert = new InsertionSort();
		long[] mediaInsert = new long[SAMPLES];
		for(int i = 0; i < SAMPLES;i++){
			mediaInsert[i] = insert.insertionSort(RESULTFILES.clone());
			//System.out.println("Insertion Sort: " + temp);
		}
		long meanSort = Deviation.findMean(mediaInsert);
		System.out.println("media: "+ meanSort);
		System.out.println("desvio padrao: "+ Deviation.findDeviation2(mediaInsert, meanSort));
		
		
		
		/*
		 *  Shaker Sort
		 */
		
		
		System.out.println("=== Shaker Sort ===");
		
		
		ShakerSort shaker = new ShakerSort();
		long[] mediaShaker = new long[SAMPLES];
		for(int i = 0; i < SAMPLES;i++){
			mediaShaker[i] = shaker.shakerSort(RESULTFILES.clone());
			//System.out.println("Shaker Sort: " + temp);
		}
		long meanShaker = Deviation.findMean(mediaShaker);
		System.out.println("media: "+ meanShaker);
		System.out.println("desvio padrao: "+ Deviation.findDeviation2(mediaShaker, meanShaker));
		
		/*
		 *  Quick Sort
		 */
		
		System.out.println("=== Quick Sort ===");
		
		QuickSort quick= new QuickSort();
		long[] mediaQuick = new long[SAMPLES];
		for(int i = 0; i < SAMPLES;i++){
			mediaQuick[i] = quick.quickSort(RESULTFILES.clone(),0,RESULTFILES.length-1);
			//System.out.println("Quick Sort: " + temp);
		}
		long meanQuick= Deviation.findMean(mediaQuick);
		System.out.println("media: "+ meanQuick);
		System.out.println("desvio padrao: "+ Deviation.findDeviation2(mediaQuick, meanQuick));
		
		
	}

}
