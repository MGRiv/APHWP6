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
	    String temp = null;
	    int val = i;
	    for(int j = i; j < Q.length; j++){
		if(temp == null){
		    temp = Q[j];
		}else{
		    if(Q[j].compareTo(temp) < 0){
			temp = Q[j];
			val = j;
		    }
		}
	    }
	    Q[val] = Q[i];
	    Q[i] = temp;
	}
    }
    public static void insertionSort(int[] Q){
	for(int i = 1;i < Q.length; i++){
	    String temp = Q[i];
	    int c = 1;
	    while((i - c) >= 0 && Q[i].compareTo(get(i - c)) < 0){
		c++;
	    }
	    for(int q = 0; q < (c - 1); q++){
		Q[i - q] = Q[i - q - 1];
	    }
	    System.out.println(temp);
	    Q[i - c + 1] = temp;
	}
    }
}