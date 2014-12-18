public class Sorts{

    public static void Bubblesort(int[] Q){
	for(int i = 0; Q.length - i > 0; i++){
	    int c = 1;
	    int temp = Q[0];
	    while(c <= Q.length - i){
		if(Q[c] < Q[c - 1]){
		    temp = Q[c];
		    Q[c] = Q[c - 1];
		    Q[c - 1] = temp;
		}
		c++;
	    }
	}
    }
    public static void selectionSort(int[] Q){
	for(int i = 0; i < Q.length; i++){
	    int val = Q[i];
	    int index = i;
	    for(int j = i; j < Q.length - 1; j++){
		if(Q[j] < Q[j + 1]){
		    val = Q[j + 1];
		    index = j + 1;
		}
	    }
	    Q[index] = Q[i];
	    Q[i] = val;
	}
    }
    public static void insertionSort(int[] Q){
	for(int i = 1;i < Q.length; i++){
	    int temp = Q[i];
	    int c = 1;
	    while((i - c) >= 0 && Q[i] > Q[i - c]){
		c++;
	    }
	    for(int q = 0; q < (c - 1); q++){
		Q[i - q] = Q[i - q - 1];
	    }
	    Q[i - c + 1] = temp;
	}
    }
}
