import java.util.Arrays;
import java.util.*;
public class Sorts{

    public static void main(String[]args){
	int[] test1 = new int[1000];
	for(int i = 0; i < test1.length; i++){
	    test1[i] = test1.length - i - 68;
	}
	Long begin = System.nanoTime();
	Bubblesort(test1);
	Long end = System.nanoTime();
	System.out.println(end - begin);

	int[] test2 = new int[1000];
	for(int i = 0; i < test1.length; i++){
	    test2[i] = test2.length -i - 68;
	}
	begin = System.nanoTime();
	Bubblesort(test2);
	end = System.nanoTime();
	System.out.println(end - begin);

	int[] test3 = new int[1000];
	for(int i = 0; i < test3.length; i++){
	    test3[i] = test3.length - i - 68;
	}
	begin = System.nanoTime();
	Bubblesort(test3);
	end = System.nanoTime();
	System.out.println(end - begin);

	int[] test4 = new int[1000];
	for(int i = 0; i < test4.length; i++){
	    test4[i] = test4.length - i - 68;
	}
	begin = System.nanoTime();
	Arrays.sort(test4);
	end = System.nanoTime();
	System.out.println(end - begin);

    }

    public static void bubble(int[] Q){
	for(int i = 0; Q.length - i > 0; i++){
	    int c = 1;
	    int temp = Q[0];
	    while(c < Q.length - i){
		if(Q[c] < Q[c - 1]){
		    temp = Q[c];
		    Q[c] = Q[c - 1];
		    Q[c - 1] = temp;
		}
		c++;
	    }
	}
    }
    public static void selection(int[] Q){
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
    public static void insertion(int[] Q){
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
    public static void radix(int[] Q){
	ArrayList<Integer> temp = new ArrayList<Integer>();
	for(int i = 0; i < 10; i++){
	    temp.add(new ArrayList<Integer>());
	}
	int large = Q[0];
	for(int i = 1; i < Q.length; i++){
	    if(Math.abs(Q[i]) > Math.abs(large)){
		large = Q[i];
	    }
	}
	int passes = 0;
	while(large > 0){
	    large = large / 10;
	    passes++;
	}
	for(int q = 0; q < passes; q++){
	    for(int p = 0; p < Q.length; p++){
		temp[Math.abs((Q[p] / (int)Math.pow(10, (double)q)) % 10)].add(Q[p]);
	    }
	    int c = 0;
	    for(int i = 0; i < 10; i++){
		for(int j = 0; j < temp.get(i).length; j++){
		    Q[c] = temp.get(i).get(j);
		    c++;
		}
		temp.get(i).clear();
	    }
	}
	
    }
    public static void toString(int[] Q){
	String ret = "[ ";
	for(int i = 0; i < Q.length; i++){
	    ret += Q[i] + " ";
	}
	ret += "]";
	System.out.println(ret);
    }
    public static String name(){
	return "Rivera,Michael";
    }
    public static int period(){
	return 6;
    }
}
