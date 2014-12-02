public class OrderedSuperArray extends SuperArray{
    
    public OrderedSuperArray(){
	super();
    }
    public OrderedSuperArray(int size){
	super(size);
    }
    public void add(String e){
	if(con > 0){
	    int c = 0;
	    System.out.println(e.compareTo(get(c)));
	    while(c < con && e.compareTo(get(c)) > 0){
		System.out.println(e.compareTo(get(c)));
		c++;
	    }
	    if(c == size()){
		super.add(e);
	    }else{
		super.add(c, e);
	    }
	}else{
	    super.add(e);
	}
    }
    public void add(int index, String e){
	if(range(index)){
	    add(e);
	}else{
	    throw new IndexOutOfBoundsException("invalid index");
	}
    }
    public void insertionSort(){
	int c = 0;
	for(int i = 1;i < con; i++){
	    while(){
	    }
	}
    }
    /*
    public String set(int index, String e){
	if(range(index)){
	    super.remove(index);
	    add(e);
	    return e;
	}else{
	    throw new IndexOutOfBoundsException("invalid index");
	}
    }
    */
}
					 
	   
// do set method, and the insertion sort