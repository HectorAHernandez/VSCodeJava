package com.java_concepts.firstpackage;

public class C02FlowControlStatements {
    	public static void main(String[] args) {
		// Selection Statements: if.../if...else.../if...else if...else/switch
		int a = 5, b = 3;
		
		if (a > b) {
			System.out.println("Inside if block as a > b");
		}
		
		// if...else:
		if (a < b) {
			System.out.println("if block executed because a is < b");
			System.out.println("Another in if-block");
		} else {
			System.out.println("else executed because a is > b");
			System.out.println("Second statement on the else block");
		}
		
		// if...else if....else if....else if....else
		int c = 2;
		
		if (c > 1000) {
			System.out.println("value is in the Thousands");
		} else if (c > 100) {
			System.out.println("Value is in the Hundreds");
		} else if (c > 10) {
			System.out.println("value is in the tens");
		} else {
			System.out.println("value is in the units");
		}
				
		
		// Switch selection statement:
		String item_to_eat = "potatoes";
		
		switch(item_to_eat) {
		case "cake":
			System.out.println("The price for "+ item_to_eat + " is 1.25" );
			System.out.println("Enjoy your "+ item_to_eat);
			break;
		case "fish":
			System.out.println("The price for "+ item_to_eat + " is 51.11" );
			System.out.println("Enjoy your "+ item_to_eat);
			break;
		case "salad":
			System.out.println("The price for "+ item_to_eat + " is 2.17" );
			System.out.println("Enjoy your "+ item_to_eat);
			break;
		case "juice":
			System.out.println("The price for "+ item_to_eat + " is 0.42" );
			System.out.println("Enjoy your "+ item_to_eat);
			break;
		default:
			System.out.println(item_to_eat + " is free" );
			System.out.println("Enjoy your "+ item_to_eat);		
		}
		
		
		
		// Iterative statements: for loop/ while loop/ do while loop/ for each loop:
		// while the condition is checked BEFORE executing the block
		// while loop : Infinite loop:
		int aa = 5, bb= 4;
		/*while (aa > bb) {
			System.out.println("Inside the loop, because aa is > bb");
		}*/
		
		// while loop : Never executed because condition is false since beginning:
		while (aa < bb) {
			System.out.println("This will never be executed");
		}
			
		// while loop: normal execution:
		int i = 0;
		while (i < 5) {
			System.out.println("Inside the loop, because 'i' is < 5");
			i++;
		}
		
		
		// do while: the condition is verified at the AFTER the execution of the code block.
		do {
			System.out.println("do...while Executed at least once no matter aa is NOT < bb");
		} while (aa < bb);
		
		// do...while normal:
	    i = 0;
	    do {
	    	System.out.println("do..while normal for i < 5 value of i = " + i);
	    	i++;
	    } while (i < 5);
		
		
	    // for loop: it is the most used loop. it is the simplest one
	    // contains initialization, condition, increment of the control variable
	    for (int j=0; j < 5; j++) {
	    	System.out.println("for...loop j=0, j < 5, j++ value of j = "+ j);
	    }
	    
	    // for loop: now decrementing the value of the control variable
	    for (int n = 5; n > 0; n--) {
	    	System.out.println("for..loop, n=5, n > 0, n--, value of n = "+ n);
	    }
	    
	    // for....each loop will be explained later with arrays and collection
	    
	    
	    
	    // Transfer statements: breaak, continue, return, try-catch-finally
	    // break can NOT be use in selection statement. only inside an iterative/loop statement
	    int t = 62;
	    
	    switch (t) {
	    case 0:
	    	System.out.println("inside case 0");
	    	break;
	    case 1:
	    	System.out.println("Inside case 1");
	    	break;
	    case 2:
	    	System.out.println("Inside case 2");
	    	break;
	    default:
	    	System.out.println("Inside the default case");
	    }
	  
	    
	    i = 0;
	    while (i < 5) {
	    	if (i == 3) {
	    		System.out.println("i got the value 3 then exit");
	    		break;
	    	}
	    	System.out.println("i is < 5 value of i = "+ i);
	    	i++;
	    }
    	System.out.println("out of the loop i == 3 value of i = "+ i);
	    

	    i = 0;
	    while (i < 5) {
	    	if (i == 3) {
	    		System.out.println("i got the value 3 then SKIPP-Continue");
	    		i++; //to go to the next iteration
	    		continue;
	    	}
	    	System.out.println("i is < 5 value of i = "+ i);
	    	i++;
	    }
    	System.out.println("out of the loop NOT i < 5 value of i = "+ i);
	      	
    	
	}


}
