public class OrderedSuperArray extends SuperArray{
    
    public void add(Object e){
	boolean ret = true;
	if(L.length > 0){
	    add((L.size() / 2), e);
	}else{
	    resize(1);
	    L[0] = e;
	}
    }
    public void add(int index, Object e){
	if(e.compareToIgnoreCase(L[index]) > 0){
	    add((index + 1),e); 
	}else if(e.compareToIgnoreCase(L[index]) < 0
    }
}
//Check cases, (-), (+), (=)
//add approrpiately, resize & shift
//
					 
	   