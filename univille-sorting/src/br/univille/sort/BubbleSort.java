package br.univille.sort;


public class BubbleSort {

	public long bubbleSort(int[] v){
		int aux = 0;
		int i = 0;
		int j = 0;
		int[] vet = new int[v.length];
		
		for(i =0;i < vet.length;i++){
			vet[i] = v[i];
		}
		
		
		//System.out.println("go bubble");
		//long start = System.nanoTime();
		long start = System.currentTimeMillis();
		for(i = 0; i<vet.length; i++){
			for(j = 0; j<vet.length-1; j++){
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
