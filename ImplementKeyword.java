package Keywords;
	
	interface FirstInterface {
		  public void myMethod();
		}

		interface SecondInterface {
		  public void myOtherMethod(); 
		}

	
		class ImplementKeyword implements FirstInterface, SecondInterface {
		  public void myMethod() {
		    System.out.println("Some text..");
		  }
		  public void myOtherMethod() {
		    System.out.println("Some other text...");
		  }
		}

		class MyMainClass {
		  public static void main(String[] args) {
		    ImplementKeyword myObj = new ImplementKeyword();
		    myObj.myMethod();
		    myObj.myOtherMethod();
		  }
		}

