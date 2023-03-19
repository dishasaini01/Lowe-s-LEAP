import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Assignment1 {
    public static void main(String[] args) {
        System.out.println("Hashset Task: ");
        HashSet<String> set = new HashSet<String>();
        set.add("cpp");
        set.add("java");
        set.add("python");
        set.add("javascript");
        set.add("springboot");
        System.out.println(set);
        boolean containsCpp = set.contains("cpp");
        boolean containsNodejs = set.contains("nodejs");
        System.out.println("Contains cpp: " + containsCpp);
        System.out.println("Contains nodejs: " + containsNodejs);
        set.remove("springboot");
        System.out.println(set);


        System.out.println("TreeSet Task: ");
        TreeSet<String> set2 = new TreeSet<String>();
        set2.add("cpp");
        set2.add("java");
        set2.add("python");
        set2.add("javascript");
        set2.add("springboot");
        System.out.println(set2);
        String firstLang = set2.first();
        String lastLast = set2.last();
        System.out.println("First Language is " + firstLang + " & Last Language is " + lastLang );
        System.out.println(set2);
        TreeSet<String> headSet = (TreeSet<String>) set2.headSet("python");
        TreeSet<String> tailSet = (TreeSet<String>) set2.tailSet("python");
        System.out.println(headSet);
        System.out.println(tailSet);

        System.out.println("ArrayList Demo: ");
        ArrayList<String> list = new ArrayList<String>();
        list.add("cpp");
        list.add("java");
        list.add("python");
        list.add("javascript");
        list.add("springboot");
        System.out.println(list);
        String langAtIndex2 = list.get(2);
        System.out.println("Language at index 2 is " + langAtIndex2);
        list.remove(3);
        System.out.println("After removing language at index 3");
        System.out.println(list);


        System.out.println("TreeMap Task: ");
        TreeMap<String, Double> map = new TreeMap<String, Double>();
        map.put("cpp", 3.4);
        map.put("java", 0.9);
        map.put("python", 9.9);
        map.put("javascript", 7.6);
        map.put("springboot", 2.5);
        System.out.println(map);
    }
}