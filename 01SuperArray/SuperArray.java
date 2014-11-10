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
	return !(index < 0 || index >= con);
    }
    public void add(Object e){
	if(L.length > 0){
	    if(L[L.length - 1] != null){
		resize(L.length + 1);
		L[L.length - 1] = e;
	    }
	    for(int i = 0; i < L.length; i++){
		if(L[i] == null){
		    L[i] = e;
		    break;
		}
	    }
	}else{
	    resize(1);
	    L[0] = e;
	}
    }
    public void add(int index, Object e){
	private Object[] temp = new Object[con + 1];
	for(int i = 0; i < index - 1; i++){
	    


    public int size(){
	for(int i = 0; i < L.length; i++){
	    if(L[i] != null){
		con++;
	    }
	}
	return con;
    }
    public void resize(int newSize){
	if(L.length > 0){
	    Object[]temp = new Object[newSize];
	    for(int i = 0; i < size() && i < newSize;i++){
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
    }
    public Object get(int index){
	return L[index - 1];
    }
    public void set(int index, Object e){
	L[index - 1] = e;
    }
}
