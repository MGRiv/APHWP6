public class Driver{
    public static void main(String[]args){
	SuperArray L = new SuperArray();
	SuperArray M = new SuperArray(0);
	L.add(new Boolean(true));
	M.add(new Integer(5));
	L.resize(5);
	M.add(6, new Boolean(true));
	M.add(0, new Boolean(false));
	System.out.println(L.toString());
	System.out.println(M.toString());
    }
}
