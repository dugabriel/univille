package br.univille.sort;

public class InsertionSort {
	private static int[] sorted;

	public int[] getSorted() {
		return sorted;
	}

	public long insertionSort(int[] num){
		int j;               
		int key;             
		int i;  

		long start = System.nanoTime();
		for (j = 1; j < num.length; j++){
			key = num[ j ];
			for(i = j - 1; (i >= 0) && (num[ i ] < key); i--){
				num[ i+1 ] = num[ i ];
			}
			num[ i+1 ] = key;
		}
		sorted = num;
		long end = System.nanoTime();
		return end-start;
	}

}
