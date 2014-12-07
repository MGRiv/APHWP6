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
	    while(c < con && e.compareTo(get(c)) > 0){
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
    public int find(String target){
	return findhelp(target, 0, con, 0);
    }
    public int findhelp(String target, int lower, int upper, int trials){
	if(trials > Math.round(Math.floor(Math.log(con * 1.0)/Math.log(2.0)) + 1)){
	    return -1;
	}
	if(target.compareTo(get((upper - lower) / 2)) > 0){
	    return findhelp(target, ((upper - lower) / 2), upper, trials + 1);
	}else if(target.compareTo(get((upper - lower) / 2)) < 0){
	    return findhelp(target, lower, ((upper - lower) / 2), trials + 1);
	}else{
	    return trials;
	}
    }
}
    /*public String set(int index, String e){
      if(range(index)){
      super.remove(index);
      add(e);
      return e;
      }else{
      throw new IndexOutOfBoundsException("invalid index");
      }
      }
    */

					 
	   
// do set method, and the insertion sort
