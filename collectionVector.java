import java.util.Vector;
 
public class CollectionVector {
public static void main(String[] args) {
Vector<String> v = new Vector<>();
v.add("java");
v.add("python");
v.add("angular");
v.add("react");
v.add("bootstrap");
v.add("java");

System.out.println(v.size());
System.out.println(v.capacity()); 
}
}