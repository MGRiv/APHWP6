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
	    SuperArray w = new SuperArray();
	    w.add("yotta");
	    w.add("yabba");
	    w.add("dabba");
	    w.add("doo");
	    w.add("wakka");
	    Long begin = System.nanoTime();
	    w.badInsertionSort();
	    Long end = System.nanoTime();
	    System.out.println(begin - end);
	    System.out.println(w.toString());
	}else{
	    SuperArray w = new SuperArray();
	    w.add("yotta");
	    w.add("yabba");
	    w.add("dabba");
	    w.add("doo");
	    w.add("wakka");
	    Long begin = System.nanoTime();
	    w.insertionSort();
	    Long end = System.nanoTime();
	    System.out.println(begin - end);
	    System.out.println(w.toString());
	}
    }
}
