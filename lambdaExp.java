@FunctionalInterface
interface In1
{
public int calc(int p,int g);
}
public class Lambdaexp {
public static void main(String[] args) throws Exception{
int c=99;
In1 i2 = (w,d)->
{
return w+d;
};
System.out.println(i2.calc(3, 6));
}
}