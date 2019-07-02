package Keywords;


public class Exceptionhandling
{
    public static void main(String[] args) 
    {
        try
        {
           int i ;
           i = Integer.parseInt("abc");
        }
        catch(NumberFormatException ex)
        {
            System.out.println(ex);
        }
        finally
        {
            System.out.println("This will be always executed");
        }
    }
}
	




