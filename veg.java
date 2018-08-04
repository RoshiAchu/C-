package com.order.java.composition;
import com.order.java.composition.delivery;
import java.util.Scanner;

public class veg extends delivery{
//		delivery kill=new ("null","null","null",0,0,"null",0);
//		kill.del();
		public void display() {
	 String a="ITALIAN";
	 String b="CHEESE";
	 String c="PANEER";
	 String d="VEGGIE";
	 String e="MUSHROOM";
	 System.out.printf("FLAVORS AVAILABLE IN VEGETARIAN: %n1. "+a+"%n2."+b+"%n3."+c+"%n4."+d+"%n5."+e+"%nEnter your choice ");
	 Scanner input=new Scanner(System.in);
	 int ch=input.nextInt();
	 if(ch==1)
	 System.out.println("Your option is "+a);
	 else if(ch==2)
	 System.out.println("Your option is "+b);
	 else if(ch==3)
	 System.out.println("Your option is "+c);
	 else if(ch==4)
	 System.out.println("Your option is "+d);
	 else
		 System.out.println("Your option is "+e);
	 input.close();
	}


}
