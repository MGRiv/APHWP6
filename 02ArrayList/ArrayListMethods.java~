import java.util.*;
public class ArrayListMethods{
    public static void collapseDuplicates(ArrayList<Integer> L){
	int c = 1;
	while(c < L.size()){
	    if(L.get(c) == L.get(c - 1)){
		L.remove(c);
	    }else{
		c++;
	    }
	}
    }
    public static void randomize(ArrayList<Integer> L){
	Random rand = new Random();
	for(int c = L.size(); c > 1; c--){
	    L.add(L.remove(rand.nextInt(c)));
	}
    }
    public static void main(String[]args){
	ArrayList<Integer> Q = new ArrayList<Integer>();
	Q.add(1);
	Q.add(2);
	Q.add(3);
	Q.add(4);
	Q.add(5);
	Q.add(6);
	Q.add(7);
	Q.add(8);
	System.out.println(Q);
	randomize(Q);
	System.out.println(Q);
    }
}
