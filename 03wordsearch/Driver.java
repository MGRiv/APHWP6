public class Driver{
    public static void main(String[]args){
	WordGrid Q = new WordGrid(6,6);
	System.out.println(Q.toString());
	try{
	    Q.addWordHorizontal("Willnotwork",3,6);
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Can't be done 1");
	}
	try{
	    Q.addWordHorizontal("Will",4,1);
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Can't be done 2");
	}
	try{
	    Q.addWordHorizontal("Nope",7,0);
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Can't be done 3");
	}
	try{
	    Q.addWordHorizontal("Nah",7,0);
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Can't be done 4");
	}
	System.out.println(Q.toString());
    }
}
