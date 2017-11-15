package Demo3;

public class CodeFile2 {

	public static void main(String[] args) {
		try{  
		    int a[]=new int[5];  
		    a[5]=30/0;  // Code for Requirement 1202
		   }  
		   catch(ArithmeticException e){System.out.println("task1 is completed mod12");}  
		   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}  
		   catch(Exception e){System.out.println("common task completed");}  
		  
		   System.out.println("rest of the code...");
	}

}
