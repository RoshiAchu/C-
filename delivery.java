package com.order.java.composition;
import java.util.*;
//import java.io.*;
import java.util.Scanner;


public class delivery {
	 String colony;
	    String area;
	    String address;
	    String landmark;
	    long pincode;
	    long contact;
		int dis;
		int doorno;
//		public delivery(String colony,String address,String landmark,long pincode,long contact,String area,int dis)
//	     {
//	    	 this.address=address;
//	    	 this.colony=colony;
//	 	  this.landmark=landmark;
//	 	    this.pincode=pincode;
//	 	   this.contact=contact;
//  this.area=area;
//  this.dis=dis;
//	     }
		public delivery()
		{
			System.out.println("Object created");
		}
		public delivery(String colony,String address,String landmark,long pincode,long contact,String area,int dis,int doorno)
        {
			 this.address=address;
	    	 this.colony=colony;
	 	  this.landmark=landmark;
	 	    this.pincode=pincode;
	 	   this.contact=contact;
            this.area=area;
 	       this.dis=dis; 
 	       this.doorno=doorno;
        }
                protected void finalize()
                {
                    System.out.println("Finalizer");
                }
                
		 public int calc(String area)
		    {
		    	int dis;
				if(area.compareTo("Guindy")==0)
		    	{
		    		dis=4;
		    		return dis;
		    	}
		    	else if(area.compareTo("T.Nagar")==0)
		    	{
		    		dis=6;
		    		return dis;
		    	}
		    	else if(area.compareTo("Alwarpet")==0)
		    	{
		    		dis=8;
		    		return dis;
		    	}
		    	else if(area.compareTo("Adyar")==0)
		    	{
		    		dis=1;
		    		return dis;
		    	}
		    	else if(area.compareTo("IT Expressway")==0)
		    	{
		    		dis=3;
		    		return dis;
		    	}
		    	else
		    	{
		    		System.out.println("ENTER DISTANCE FROM YOUR AREA");
		    		Scanner input = new Scanner(System.in);
					dis=input.nextInt();	
					input.close();
		    		return dis;
		    	}	
		    }
		    	public int check(int dis)
		 	   {
		 		    int s;
		 			if(dis<20)
		 		   {
		 			   System.out.printf("GET DETAILS%n");
		 			   s=1;
		 			   return s;
		 		   }
		 		   else
		 		   {
		 			   System.out.println("SORRY...OUR SERVICE IS NOT AVAILED TO YOUR AREA...:(:(");
		 			   s=0;
		 			   return (s);
		 		   }    	
		    }  
		    	public void change()
		    	{
		    		System.out.println("Menu");
		    		System.out.print("\n1 - Door number\n2 - Colony\n3 - Landmark\n4 - Address\n5 - Pincode\n6 - Contact\n7 - Exit\nEnter your choice ");
		    		short j;
		    		Scanner input=new Scanner(System.in);
		    		j=input.nextShort();
		    		switch(j)
		    		{
		    		case 1:
		    			System.out.print("Old door number is "+doorno+" Enter new door number ");
		    			doorno=input.nextInt();
		    			 System.out.printf("Colony: "+colony+"\nAddress: "+address+"\nLandmark: "+landmark+"\nPincode: "+pincode+"\nContact: "+contact);
		    			break;
		    		case 2:
		    			System.out.print("Old colony name is "+colony+" Enter new colony name ");
		    			colony=input.next();
		    			colony+=input.nextLine();
		    			 System.out.printf("Colony: "+colony+"\nAddress: "+address+"\nLandmark: "+landmark+"\nPincode: "+pincode+"\nContact: "+contact);
		    			break;
		    		case 3:
		    			System.out.print("Old landmark name is "+landmark+ " Enter new landmark ");
		    			landmark=input.next();
		    			landmark+=input.nextLine();
		    			 System.out.printf("Colony: "+colony+"\nAddress: "+address+"\nLandmark: "+landmark+"\nPincode: "+pincode+"\nContact: "+contact);
		    			break;
		    		case 4:
		    			System.out.print("Old address is "+address+" Enter new address ");
		    			address=input.next();
		    			address+=input.nextLine();
		    			 System.out.printf("Colony: "+colony+"\nAddress: "+address+"\nLandmark: "+landmark+"\nPincode: "+pincode+"\nContact: "+contact);
		    			break;
		    		case 5:	
		    			System.out.print("Old pincode number is "+pincode+" Enter new pincode number ");
		    			pincode=input.nextLong();	 
		    			System.out.printf("Colony: "+colony+"\nAddress: "+address+"\nLandmark: "+landmark+"\nPincode: "+pincode+"\nContact: "+contact);
		    			break;
		    		case 6:
		    			System.out.print("Old door number is "+contact+" Enter new contact ");
		    			contact=input.nextLong();
		    			 System.out.printf("Colony: "+colony+"\nAddress: "+address+"\nLandmark: "+landmark+"\nPincode: "+pincode+"\nContact: "+contact);
		    			break;
		    		case 7:
//		    			System.out.print("\nAre you sure that all is right??\nEnter 1 if sure..else enter 0 ");
//		    			int r;
//		    			r=input.nextInt();
//		    			if(r==1)
//		    		  delivery obj=new delivery(colony,address,landmark,pincode,contact,area);
		    			break;
		    		default:
		    			System.out.println("Enter a value from 1-7");
		    		}
		    		input.close();
		    	}
public void disp()
{
	 System.out.printf("Colony: "+colony+"\nAddress: "+address+"\nLandmark: "+landmark+"\nPincode: "+pincode+"\nContact: "+contact);

}
		 
         @SuppressWarnings("UnusedAssignment")
         public void del(){
	String colony;
String area;
String address;
String landmark;
long pincode;
long contact;
int dis;
int k;
        @SuppressWarnings("LocalVariableHidesMemberVariable")
int doorno;
System.out.println("Enter your area name: ");
Scanner input = new Scanner(System.in);
while(input.hasNext())
{
area=input.next();
area+=input.nextLine();
dis=calc(area);
k=check(dis);
int checking;
if(k==1)
{
	System.out.println("Enter your door number ");
	 doorno=input.nextInt();
	 System.out.println("Enter your colony name ");
	 colony=input.next();
	 colony+=input.nextLine();
	 System.out.println("Enter your address");
	 address=input.next();
	 address+=input.nextLine();
	 System.out.println("Enter your pincode ");
	 pincode=input.nextLong();
	 System.out.println("Enter your contact ");
	 contact=input.nextLong();
	 System.out.println("Enter your landmark name ");
	 landmark=input.next();
	 landmark+=input.nextLine();
	 delivery obj=new delivery(colony,address,landmark,pincode,contact,area,dis,doorno);
	 System.out.println("Please Verify your details ");
//	 System.out.printf("Colony: "+colony+"\nAddress: "+address+"\nLandmark: "+landmark+"\nPincode: "+pincode+"\nContact: "+contact);
	obj.disp();
	 System.out.printf("\nEnter 1 to change any detail...0 to continue ");
	 checking=input.nextInt();
	 if(checking==1)
	 obj.change();
	//	 obj.deliconfirm();
}

else
{
	 System.out.println("SERVICE NOT AVAILABLE");
}

}

input.close();
}
public void execute()
{
//	String colony,address,landmark,area;
//	long pincode,contact;
	delivery obj1=new delivery();
	obj1.del();
//public void deliconfirm() {
//    obj.del();
}
	
	
	 
//}
}
