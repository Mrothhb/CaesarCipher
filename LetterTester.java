/**
 *
 * @author Matthew Roth
 * mrroth@ucsd.edu  cs8bfds
 *
 * This program is designed to be a tester program to 
 * check if various input arguments will create an 
 * error in the Letter class op1-op4 methods
 *
 *
 *
 * */

public class LetterTester{
  public static void main (String[] args){
    System.out.println("This is the LetterTester.");

    //Method option 1
    if (Letter.op1('a',1) == 'a'){
      System.out.println("[op1] FAILED. 'a' + 1 should be 'b'.");
    }
    else{
      System.out.println("[op1] SUCCEEDED. ");
    }

    //Method option 2

    if (Letter.op2('z',Integer.MAX_VALUE) == 'y'){
      System.out.println("[op2] FAILED. 'z' + MAX_VALUE should be 'x'.");
    }

    else{
      System.out.println("[op2] SUCCEEDED. ");
    }

    //Method option 3
    if (Letter.op3('z',1 ) == '{' ){
      System.out.println("[op3] FAILED. 'z' + 1 should be 'a'. ");
    }
    else 
      System.out.println("[op3] SUCCEEDED .");

    
    if (Letter.op4('A',-1) == '@'){
      System.out.println("[op4] FAILED. 'A' or 'a' -1 should be 'Z' or 'z'. ");
    }
    else 
      System.out.println("[op4] SUCCEEDED. ");
  }
}

