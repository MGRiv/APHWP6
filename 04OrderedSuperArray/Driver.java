import java.util.*;
public class Driver{
    public static void main(String[]args){
	OrderedSuperArray q = new OrderedSuperArray();
	/*
	q.add("beep");
	System.out.println(q.toString());
	q.add("boop");
	System.out.println(q.toString());
	q.add("aeep");
	System.out.println(q.toString());
	q.add("zorp");
	System.out.println(q.toString());
	q.add("tape");
	System.out.println(q.toString());
	q.add(3,"xitp");
	System.out.println(q.toString());
	*/
	if(args.length > 0){
	    if(args.length > 1){
		SuperArray w = new SuperArray();
		for(int i = 0; i < 500000; i++){
		    w.add(Integer.toString(i));
		}
		System.out.println("Done");
		Long begin = System.nanoTime();
		w.badInsertionSort();
		Long end = System.nanoTime();
		System.out.println(end - begin);
		System.out.println(w.toString());
	    }else{
		SuperArray w = new SuperArray();
		for(int i = 0; i < 500000; i++){
		    w.add(Integer.toString(i));
		}
		Long begin = System.nanoTime();
		Arrays.sort(w.getL());
		Long end = System.nanoTime();
		System.out.println(end - begin);
		System.out.println(w.toString());
	    }
	}else{
	    SuperArray w = new SuperArray();
	    for(int i = 0; i < 500000; i++){
		w.add(Integer.toString(i));
	    }
	    Long begin = System.nanoTime();
	    w.insertionSort();
	    Long end = System.nanoTime();
	    System.out.println(end - begin);
	    System.out.println(w.toString());
	}
    }
}
