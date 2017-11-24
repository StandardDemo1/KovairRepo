package Demo3;

public class CodeFile3 {

	public static void main(String[] args) {
								//For User Story 44
		int r,sum=0,temp;    
		  int n=454;
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");  
	}

}
