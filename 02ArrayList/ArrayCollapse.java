import java.util.*;
public class ArrayCollapse{
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
    public static void main(String[]args){
	ArrayList<Integer> Q = new ArrayList<Integr>();
	Q.add(2);
	Q.add(3);
	Q.add(3);
	Q.add(4);
	Q.add(5);
	Q.add(4);
	Q.add(4);
	Q.add(4);
	System.out.println(Q);
	collapseDuplicates(Q);
	System.out.println(Q);
    }
}
