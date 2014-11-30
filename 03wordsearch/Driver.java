import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Driver{
    public static void main(String[]args){
	Random r = new Random();
	boolean y = true;
	if(args.length > 0){
	    WordGrid q = new WordGrid(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
	    if(args.length > 2){
		q.setSeed(Long.parseLong(args[2]));
	    }else{
		q.setSeed(r.nextLong());
	    }
	    if(args.length > 3){
		if(Integer.parseInt(args[3]) == 1){
		    System.out.println("Answers:");
		    y = false;
		}
	    }
	    q.loadWordsFromFile("words.txt", y);
	    System.out.println("\nFind these words:" + q.words());
	    System.out.println("\n" + q.toString());
	}else{
	    System.out.println("Please follow this format:");
	    System.out.println("java Driver <rows> <cols> [<seed> [<enter 1 for answer key>]]");
	}
    }
}
