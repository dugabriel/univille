package br.univille.sort;


public class BubbleSort {
	private static int[] sorted;

	public int[] getSorted() {
		return sorted;
	}

	public long bubbleSort(int[] vet){
		int aux = 0;
		int i = 0;
		
		long start = System.currentTimeMillis();
		for(i = 0; i<vet.length; i++){
			for(int j = 0; j<vet.length-1; j++){
				if(vet[j] > vet[j + 1]){
					aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}
			}
		}
		long end = System.currentTimeMillis();
		return end-start;
	}

}
