package Keywords;

public class StrictfpKeyword {
	
	    float f = 9.678f;
	    
	    strictfp public void displayValue()
	    {
	        System.out.println(f);
	    }

	    public static void main(String[] args) 
	    {
	      StrictfpKeyword strictfpDemo = new StrictfpKeyword();
	      strictfpDemo.displayValue();
	    }

	}

