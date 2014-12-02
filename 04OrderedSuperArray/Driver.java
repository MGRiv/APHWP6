public class Driver{
    public static void main(String[]args){
	OrderedSuperArray q = new OrderedSuperArray();
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
    }
}
