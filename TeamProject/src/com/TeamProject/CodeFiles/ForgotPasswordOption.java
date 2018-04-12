//sd261

package com.TeamProject.CodeFiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ForgotPasswordOption {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s3;
	    String s2;

	    double num1, num2, products;

	    // set up the buffered reader to read from the keyboard
	    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

	    System.out.println ("Enter a line of input");
	    
	    /* Following line triggers the error.  Error will show the type of
	       unhandled exception and where the call occurs */
	    s2 = br.readLine();

	    System.out.println ("The line has " + s2.length() + " characters");

	  /*  System.out.println ();
	    System.out.println ("Breaking the line into tokens we get:");*/
	    //Comment ID : 37(12)

	    int numTokens = 0;
	    StringTokenizer st = new StringTokenizer (s2);

	    while (st.hasMoreTokens()) {
		s2 = st.nextToken();
		numTokens++;
		System.out.println ("    Token " + numTokens + " is: " + s2); //
	    }
	}

}
