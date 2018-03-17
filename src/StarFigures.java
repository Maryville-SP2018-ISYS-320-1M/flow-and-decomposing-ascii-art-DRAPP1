/*
  	ISYS 320
  	Name(s): David Rapp
  	Date: 3-17-18
*/

// 4. Your pseudocode algorithm for how to break down the figure 
    /* System.out.println("*****");
       System.out.println("*****");
       System.out.println(" * *");
       System.out.println("  * ");
       System.out.println(" * *");
 and then repeat as needed to complete the design
 */


public class StarFigures {

public static void main(String[] args) {
   drawStars4();
   drawStars4();
   drawStars2();
   drawStars1();
   drawStars2();
   System.out.println("\n");
   
   drawStars4();
   drawStars4();
   drawStars2();
   drawStars1();
   drawStars2();
   drawStars4();
   drawStars4();
   System.out.println("\n");
   
   drawStars1();
   drawStars1();
   drawStars1();
   drawStars4();
   drawStars4();
   drawStars2();
   drawStars1();
   drawStars2();
	}
	
public static void drawStars1() {
	System.out.println("  * ");
}

public static void drawStars2() {
	System.out.println(" * *");
}

public static void drawStars4() {
	System.out.println("*****");
}
	}
