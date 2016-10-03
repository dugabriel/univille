package br.univille.sort;

public class ShakerSort {

	public long shakerSort(int[] vetor){
		int swap, aux;
		int inicio = 0;
		int fim = vetor.length - 1;
		swap = 0;
		
		//long start = System.nanoTime();
		long start = System.currentTimeMillis();
		while (swap == 0 && inicio < fim){
			swap = 1;
			for (int i = inicio; i < fim; i = i + 1){
				if (vetor[i] > vetor[i + 1]){
					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					swap = 0;
				}
			}
			fim = fim - 1;
			for (int i = fim; i > inicio; i = i - 1){
				if (vetor[i] < vetor[i - 1]){
					aux = vetor[i];
					vetor[i] = vetor[i - 1];
					vetor[i - 1] = aux;
					swap = 0;
				}
			}
			inicio = inicio + 1;
		}
		long end = System.currentTimeMillis();
		return end-start;
	}

}
