import java.util.*;
import java.io.*;
class base{
    void disp(){
    System.out.println("factorial of 5 is: ");
    }

    void disp1(){
        System.out.println("\n\nsecond recursive function is executes");
        }
}

 class facto extends base {  
 int factorial(int n){      
          if (n == 1)      
            return 1;      
          else      
            return(n * factorial(n-1)); 
                 
    }      
    
}

class rec extends base {  
     int count=0;  
     void p(){  
    count++;  
    if(count<=5){  
    System.out.println("i am akash "+count);  
    p();  
    }  
    }  
}

class inheritance2{
public static void main(String[] args) 
{ 
  facto obj=new facto();
  obj.disp();
System.out.print(""+obj.factorial(5));

rec ob=new rec();
ob.disp1();
ob.p();

}  
}