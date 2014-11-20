import java.util.*;
public class WordGrid{
    private char[][]data;

    /**Initialize the grid to the size specified and fill all of the positions
     *with spaces.
     *@param row is the starting height of the WordGrid
     *@param col is the starting width of the WordGrid
     */
    public WordGrid(int height, int width){
	data = new char[height][width];
	clear();
    }
    
    /**Set all values in the WordGrid to spaces ' '*/
    private void clear(){
	for(int i = 0;i < data.length;i++){
	    for(int c = 0;c < data[i].length;c++){
		data[i][c] = ' ';
	    }
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
    /**Attempts to add a given word to the specified position of the WordGrid.
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
	boolean ret = false;
	if(word.length() <= (data[row].length - col)){
	    for(int c = 0; c < word.length();c++){
		if(data[row - 1][col + c - 1] != word.charAt(c) && !(Character.toString(data[row - 1][col + c - 1]).equals(" "))){
		    System.out.println("Yikes");
		    return false;
		}
	    }
	    for(int i = 0; i < word.length();i++){
		data[row - 1][col + i - 1] = word.charAt(i);
	    }
	    ret = true;
	}else{
	    System.out.println("Can't be done");
	}
	return ret;
    }
}
