package com.pizza.java;
//import com.order.java.composition.delivery;
import java.util.Scanner;
import com.order.java.composition.veg;
import com.order.java.composition.delivery;
public class Pizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		veg obj=new veg();
    	nonveg obj2= new nonveg();
  
    	System.out.printf("%nOptions:%n1)Veg %n2)Non-Veg %nEnter your choice: ");
        Scanner input=new Scanner(System.in);
        int choice=input.nextInt();
        if(choice==1)
        {
         obj.display();
        }
        else
        {
        	obj2.display1();
        	
        }
      
       if(choice==1)
       {
       obj.execute();
       }
        else
       {
         obj2.execute();	
        }
      input.close();
	}

	}


class nonveg extends delivery{

	public void display1() {
   String a1="CHICKEN DOMINATOR";
   String b1="PEPPER BARBECUE";
   String c1="CHICKEN SAUSAGE";
   String d1="PERI PERI CHICKEN";
   String e1="CHICKEN FIESTA";
   System.out.printf("FLAVORS AVAILABLE IN VEGETARIAN: %n1. "+a1+"%n2."+b1+"%n3."+c1+"%n4."+d1+"%n5."+e1+"%nEnter your choice ");
   Scanner input=new Scanner(System.in);
   int ch1=input.nextInt();
   if(ch1==1)
	   System.out.println("Your option is "+a1);
	   else if(ch1==2)
	   System.out.println("Your option is "+b1);
	   else if(ch1==3)
	   System.out.println("Your option is "+c1);
	   else if(ch1==4)
	   System.out.println("Your option is "+d1);
	   else
	  	 System.out.println("Your option is "+e1);
   input.close();
   
}  
}

