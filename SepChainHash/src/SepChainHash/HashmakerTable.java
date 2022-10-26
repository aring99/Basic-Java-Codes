package SepChainHash;
public class HashmakerTable <T>{
  Hashmaker[] arrayHash;
  int Size;
	public HashmakerTable(int Size){
		this.Size= Size;
		arrayHash= new Hashmaker[this.Size];
		for(int i=0; i<arrayHash.length;i++) {
			arrayHash[i]= new Hashmaker<T>();
		}
		}
	int GetHash(int Key) {
		int randomator= (int) Math.random();
		int randomator2= (int) Math.random();
		return ( (Key*randomator*randomator2*984) & 0x7fffffff)%8191;
		//return Key%Size;
	}
	public void put(int key, T value) {
		int index=GetHash(key)%Size;
		Hashmaker ArrValue= arrayHash[index]; //linkedlist
		Hashmaker newItem= new Hashmaker<T>(key, value);
		newItem.next= ArrValue.next;
	    ArrValue.next=newItem;
	    
	}
	public T Get(int key) {
		T value=null;
		int index= GetHash(key);
		Hashmaker ArrValue= arrayHash[index];
		while (ArrValue.next!=null) {
			System.out.println(value);
			if(ArrValue.GetKey()==key) {
				value= (T)ArrValue.getValue();
				break;
			}
			ArrValue=ArrValue.next;
		}
		return value;
	}
}
