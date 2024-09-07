/*class HelloWorld {
     static void printname(int i, int n) {
        if (i <= n) {
            System.out.println("hello");
            printname(i + 1, n);
        }
    }

    public static void main(String[] args) {
        printname(1, 5);
    }
}*/
/*class HelloWorld {
    static void print1ton(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        print1ton(i + 1, n);
    }

    public static void main(String[] args) {
        print1ton(1, 5);
    }
}*/
/*class HelloWorld {
    static void print1ton(int n, int i) {
        if (i <1) {
            return;
        }
        
        print1ton(n,i-1);
		System.out.println(i);
    }

    public static void main(String[] args) {
        print1ton(1, 5);
    }
}*/
/*public class HelloWorld{
    static void printnto1(int n, int i){
        if(i<1){
            return;
        }
        System.out.println(i);
        printnto1(n, i-1);
    }

    public static void main(String args[]){
        printnto1(1,5);
    }
}*/

/* public class HelloWorld{
    static int sumnnumber(int n){
		if(n<1){
			return 0;
		}
		  return n + sumnnumber(n-1);
		
	}

    public static void main(String args[]){
       int sum= sumnnumber(3);
	   System.out.println("The sum of numbers from 1 to 5 is: " + sum);
    }
}*/
//sum of 5 number
//1+2+3+4+5=15
import java.util.Scanner.*;
public class HelloWorld{
  /*  static int sumnnumber(int n){
		if(n<1){
			return 1;
		}
		  return n * sumnnumber(n-1);
		
	}*/
	

    public static void main(String args[]){
      /* int sum= sumnnumber(3);
	   System.out.println("factorial of a no from 1 to 5 is: " + sum);*/
	   Scanner pc=new Scanner();
	   System.out.println("enter the array ellement:");
	   int a=pc.nextInt();
	   int arr[]=new nextInt[a];
	   for(int i=0;i<a;i++){
		   arr[i]=pc.nextInt();
		   System.out.println(arr[i]);
	   }
    }
}
//factoial of a number 3
//1*2*3
/*dry run
n*n-1=3*2
n*n-1=2*1
n*n-1=1*0*/
