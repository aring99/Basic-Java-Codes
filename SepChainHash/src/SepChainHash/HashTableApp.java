package SepChainHash;

public class HashTableApp {

	public static void main(String[] args) {
	HashmakerTable<String> hash= new HashmakerTable<String>(10);
hash.put(10, "jerry");
hash.put(10, "pack");
hash.put(11, "joe");
hash.put(12, "jeff");
System.out.println(hash.Get(10));

	}

}
