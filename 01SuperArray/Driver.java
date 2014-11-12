public class Driver{
    public static void main(String[]args){
	SuperArray L = new SuperArray();
	SuperArray M = new SuperArray(0);
	L.add(new Boolean(true));
	L.add(new Integer(1));	
	L.add(new Integer(1));
	L.add(new Integer(2));
	L.add(new Integer(3));
	L.add(new Integer(4));
	M.add(new Integer(5));
	L.resize(5);
	try{
	    M.add(6, new Boolean(true));
	}catch(IndexOutOfBoundsException e){
	    System.out.println("That can't be done");
	}
	try{
	    M.add(7, new Boolean(false));
	}catch(IndexOutOfBoundsException e){
	    System.out.println("That can't be done");
	}
	try{
	    L.remove(7);
	}catch(IndexOutOfBoundsException e){
	    System.out.println("That can't be done");
	}
	try{
	    L.remove(2);
	}catch(IndexOutOfBoundsException e){
	    System.out.println("That can't be done");
	}
	try{
	    L.get(3);
	}catch(IndexOutOfBoundsException e){
	    System.out.println("That can't be done");
	}
	try{
	    L.get(9);
	}catch(IndexOutOfBoundsException e){
	    System.out.println("That can't be done");
	}
	System.out.println(L.toString());
	System.out.println(M.toString());
    }
}
