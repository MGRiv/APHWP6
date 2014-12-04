public class SuperArray{
    private Object[] L;
    private int con;
    
    public SuperArray(){
	L = new Object[10];
    }
    public SuperArray(int n){
	L = new Object[n];
    }
    public String toString(){
	String r = "[";
	for(int i = 0; i < L.length;i++){
	    r += " " + L[i];
	}
	r += " ]";
	return r;
    }
    public boolean range(int index){
	return !(index < 0 || index >= size());
    }
    public void add(Object e){
	if(con == L.length){
	    resize(L.length * 2);
	}
	L[con] = e;
	con++;
    }
    public void add(int index, Object e){
	if(range(index)){
	    if(con == L.length){
		resize(L.length * 2);
	    }
	    for(int i = con; i > index; i--){
		L[i] = L[i - 1];
	    }
	    set(index,e);
	    con++;
	}else{
	    throw new IndexOutOfBoundsException("invalid index");
	}
    }
    public int size(){
	return con;
    }
    public void resize(int newSize){
	if(L.length > 0){
	    Object[]temp = new Object[newSize];
	    for(int i = 0; i < L.length && i < newSize;i++){
		temp[i] = L[i];
	    }
	    L = temp;
	}else{
	    L = new Object[1];
	}
    }
    public void clear(){
	for(int i = 0; i < L.length; i++){
	    L[i] = null;
	}
	con = 0;
    }
    public Object remove(int index){
	if(range(index)){
	    Object r = L[index];
	    for(int i = index; i < L.length - 1; i++){
		L[i] = L[i + 1];
	    }
	    resize(L.length - 1);
	    con--;
	    return r;
	}else{
	    throw new IndexOutOfBoundsException("invalid index");
	}
    }
    public Object get(int index){
	if(range(index)){
	    return L[index - 1];
	}else{
	    throw new IndexOutOfBoundsException("invalid index");
	}
    }
    public Object set(int index, Object e){
	if(range(index)){
	    L[index] = e;
	    return e;
	}else{
	    throw new IndexOutOfBoundsException("invalid index");
	}
    }
}
