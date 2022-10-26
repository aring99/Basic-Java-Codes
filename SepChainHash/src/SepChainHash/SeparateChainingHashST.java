package SepChainHash;

public class SeparateChainingHashST<Key, Value> {
	
private int M = 8191;
private Node[] st = new Node[M];
private static class Node {
Object key;
Object val;
Node next;
Node(Object key, Object val, Node next) {
this.key = key;
this.val = val;
this.next = next;
}
}
private int hash(Key key) {
return (key.hashCode() & 0x7fffffff) % M;
}
public void put(Key key, Value val) {
int i = hash(key);
for (Node x = st[i]; x != null; x = x.next) {
if (key.equals(x.key)) {
x.val = val;
return;
}
}
st[i] = new Node(key, val, st[i]);
}

public Value get(Key key) {
int i = hash(key);
for (Node x = st[i]; x != null; x = x.next)
if (key.equals(x.key))
return (Value) x.val;
return null;
}
}