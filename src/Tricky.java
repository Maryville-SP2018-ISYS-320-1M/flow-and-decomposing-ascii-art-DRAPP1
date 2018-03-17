/*
  	ISYS 320
  	Name(s): Dave Rapp
  	Date: 3-17-18
*/

// 1. My predicted output was an error message!
 

public class Tricky {
	public static void main(String[] args) {
        message1();
        message2();
        System.out.println("Done with main.");
    }
    
    public static void message1() {
        System.out.println("This is message1.");
    }
    
    public static void message2() {
        System.out.println("This is message2.");
        message1();
        System.out.println("Done with message 2.");
    }
}

// 3. I was incorrect because I thought that you would have to declare message input 
// in the main and not in the statement below.
 
 

