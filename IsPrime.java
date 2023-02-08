package week1.day2;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int i;
		   int m=0;
		   int flag=0;  
		   int k;
		   String str;
		   int primeCheck=0;//it is the number to be checked 	
		   //Input the values 
		   Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		   System.out.print("Enter Prime number to be checked : ");  
		   str= sc.nextLine();              //reads string  
		   //System.out.print("You have entered: "+str);	
		   int f=Integer.parseInt(str);
		   System.out.println();
		   System.out.println("Prime Number to be checked : "+f);	
		   primeCheck=f;
		   m=primeCheck/2;      
		  if(primeCheck==0||primeCheck==1){  
		   System.out.println(primeCheck+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(primeCheck%i==0){      
		     System.out.println(primeCheck+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(primeCheck+" is prime number"); }  
		  }//end of else  
		
	}

}
