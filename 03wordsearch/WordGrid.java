import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class WordGrid{
    private char[][]data;
    private int rowd, cold;

    /**Initialize the grid to the size specified and fill all of the positions
     *with spaces.
     *@param row is the starting height of the WordGrid
     *@param col is the starting width of the WordGrid
     */
    public WordGrid(int height, int width){
	data = new char[height][width];
	clear();
	compWords();
    }
    
    /**Set all values in the WordGrid to spaces ' '*/
    private void clear(){
	for(int i = 0;i < data.length;i++){
	    for(int c = 0;c < data[i].length;c++){
		data[i][c] = ' ';
	    }
	}
    }
    /**Retrieves words from a separate txt file */
    private void compWords(){
	Random rand = new Random();
	try{
	    File input = new File("words.txt");
	    Scanner in = new Scanner(input);
	    while(in.hasNext()){
		addUniversal(in.nextLine(), rand.nextInt(data.length), rand.nextInt(data[0].length));
	    }
	}catch(FileNotFoundException fnfe){
	    System.out.println("Not such file");
	}
    }
    /**The proper formatting for a WordGrid is created in the toString.
     *@return a String with each character separated by spaces, and each row
     *separated by newlines.
     */
    public String toString(){
	String ret = "";
	for(int i = 0;i < data.length;i++){
	    ret += "*";
	    for(int c = 0;c < data.length;c++){
		ret += Character.toString(data[i][c]) + " ";
	    }
	    ret += "*\n";
	}
	return ret;
    }
    /**Attempts to add a given word to the specified position of the WordGrid horizontally.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     */    
    public boolean addWordHorizontal(String word, int row, int col){
	if(word.length() <= (data[row].length - col)){
	    for(int c = 0; c < word.length();c++){
		if(data[row - 1][col + c - 1] != word.charAt(c) && (data[row - 1][col + c - 1]) != ' '){
		    System.out.println("Yikes");
		    return false;
		}
	    }
	    for(int i = 0; i < word.length();i++){
		data[row - 1][col + i - 1] = word.charAt(i);
	    }
	    return true;
	}
	System.out.println("dang");
	return false;
    }
    /**Attempts to add a given word to the specified position of the WordGrid vertically.
     *The word is added from top to bottom, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     */
    public boolean addWordVertical(String word, int row, int col){
	if(word.length() <= (data.length - row)){
	    for(int c = 0; c < word.length();c++){
		if(data[row - 1 + c][col - 1] != ' ' && data[row - 1 + c][col - 1] != word.charAt(c)){
		    System.out.println("oh no");
		    return false;
		}
	    }
	    for(int i = 0; i < word.length();i++){
		data[row + i - 1][col - 1] = word.charAt(i);
	    }
		return true;
	}
	System.out.println("shucks");
	return false;
    }
    /**Attempts to add a given word to the specified position of the WordGrid diagonally.
     *The word is added from left to right, top to bottom, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     */
    public boolean addWordDiagonal(String word, int row, int col){
	if(word.length() <= (data.length - row) && word.length() <= (data[row].length - col)){
	    for(int c = 0; c < word.length(); c++){
		if(data[row + c - 1][col + c - 1] != ' ' && data[row + c - 1][col + c - 1] != word.charAt(c)){
		    System.out.println("shoot");
		    return false;
		}
	    }
	    for(int i = 0; i < word.length();i++){
		data[row + i - 1][col + i -1] = word.charAt(i);
	    }
	    return true;
	}
	System.out.println("AAAHHH");
	return false;
    }
    /**Attempts to add a given word to the specified position of the WordGrid in any direction.
     *The word must fit on the WordGrid. It is added in any of the eight cardinal or intercardinal
     *directions, and must have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     */
    public boolean addUniversal(String word, int row, int col){
	ArrayList<Integer> h = new ArrayList<Integer>();
	ArrayList<Integer> v = new ArrayList<Integer>();
	Random rand = new Random();
	int t;
	for(int c = 0;c < 8;c++){
	    if((c % 4) == 0){
		cold = 0;
		if(c != 0){
		    rowd = -1;
		}else{
		    rowd = 1;
		}
	    }else if((c % 4) == 1){
		if(c != 1){
		    cold = -1;
		    rowd = -1;
		}else{
		    cold = 1;
		    rowd = 1;
		}
	    }else if((c % 4) == 2){
		rowd = 0;
		if(c != 2){
		    cold = -1;
		}else{
		    cold = 1;
		}
	    }else{
		if(c != 3){
		    cold = 1;
		    rowd = -1;
		}else{
		    cold = -1;
		    rowd = 1;
		}
	    }
	    if((word.length() <= ((data.length - (rowd * row)) % data.length) || rowd == 0) && ((word.length() <= ((data[row].length - (cold * col)) % data[row].length ) || cold == 0))){
		for(int i = 0; i < word.length();i++){
		    if(data[row + (i * rowd)][col + (i * cold)] != ' ' && data[row + (i * rowd)][col + (i * cold)] != word.charAt(i)){
			System.out.println("shazbot");
			break;
		    }else{
		    h.add(rowd);
		    v.add(cold);
		    }
		}
	    }
	}
	if(!(h.isEmpty())){
	    t = rand.nextInt(h.size());
	    rowd = h.get(t);
	    cold = v.get(t);
	    for(int q = 0; q < word.length(); q++){
		data[row + (q * rowd)][col + (q * cold)] = word.charAt(q);
	    }
	    return true;
	}
	return false;
    }
}
