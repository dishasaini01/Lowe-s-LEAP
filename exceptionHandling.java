public class ExceptionHandling {
    public static void main(String[] args) {
        try
        {
            int ar[]= {5,1,4,2,3};
            System.out.println(ar[5]);
        }
        catch (NumberFormatException  e) {
            e.printStackTrace();
            System.out.println("catch2");
        }
        catch(NullPointerException n)
        {
            n.printStackTrace();
            System.out.println("catch3");
        }
        catch(ArithmeticException a)
        {
            a.printStackTrace();
            System.out.println("catch4");
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("catch5");
        }
        finally {
            System.out.println("finally....");
        }
    }
}