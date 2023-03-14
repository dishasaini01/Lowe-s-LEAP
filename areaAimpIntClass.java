import com.disha.Test;

public class Out{
public static void main(String[] args){
	Test t=new Test();
	int i =Integer.parseInt(args[0]);
	int j =Integer.parseInt(args[1]);
	int k = Integer.parseInt(args[2]);
	int l = Integer.parseInt(args[3]);
	int m= Integer.parseInt(args[4]);

	System.out.println(t.area(i, j));
	System.out.println(t.simp(k,l,m)); 
	}
}