package SepChainHash;

public class Hashmaker<T> {
int key;
T value;
Hashmaker next;
public Hashmaker(int key, T value) {
this.key=key;
this.value=value;
next=null;	
}
public Hashmaker() {
next=null;	
}
public int GetKey() {
	return key;
}
public T getValue() {
	return value;
}

}
