public class SuperArray{
    public String[] L;
    public int con = 0;
    
    public SuperArray(){
	L = new String[10];
    }
    public SuperArray(int n){
	L = new String[n];
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
    public void add(String e){
	if(con == L.length){
	    resize(L.length * 2);
	}
	L[con] = e;
	con++;
    }
    public void add(int index, String e){
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
	    String[]temp = new String[newSize];
	    for(int i = 0; i < L.length && i < newSize;i++){
		temp[i] = L[i];
	    }
	    L = temp;
	}else{
	    L = new String[1];
	}
    }
    public void clear(){
	for(int i = 0; i < L.length; i++){
	    L[i] = null;
	}
	con = 0;
    }
    public String remove(int index){
	if(range(index)){
	    String r = L[index];
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
    public String get(int index){
	if(range(index)){
	    return L[index];
	}else{
	    throw new IndexOutOfBoundsException("invalid index");
	}
    }
    public String set(int index, String e){
	if(range(index)){
	    L[index] = e;
	    return e;
	}else{
	    throw new IndexOutOfBoundsException("invalid index");
	}
    }
    public void insertionSort(){
	for(int i = 1;i < con; i++){
	    String temp = L[i];
	    int c = 1;
	    while((i - c) >= 0 && L[i].compareTo(get(i - c)) < 0){
		c++;
	    }
	    for(int q = 0; q < (c - 1); q++){
		L[i - q] = L[i - q - 1];
	    }
	    L[i - c + 1] = temp;
	}
    }
    public void badInsertionSort(){
        OrderedSuperArray c = new OrderedSuperArray();
        while( this.size() > 0){ 
            c.add(this.remove(0));
        }
        while(c.size() > 0){
            this.add(c.remove(0));
        }
    }
    public int find(String target){
	for(int i = 0;i < con; i++){
	    if(target.compareTo(get(i)) == 0){
		return i;
	    }
	}
	return -1;
    }
    public void selectionSort(){
	for(int i = 0; i < con; i++){
	    String temp = null;
	    for(int j = i; j < con; j++){
		if(temp == null){
		    temp = L[j];
		}else{
		    if(L[j].compareTo(temp) < 0){
			temp = L[j];
		    }
		}
	    }
	    for(int q = con;q>i + 1;q--){
		L[q] = L[q-1];
	    }
	    L[i] = temp;
	}
    }
}
