public class fibbnonic{
public static int  f(int n){
if(n<=1){
return n;
}
int last=f(n-1);
int slast=f(n-2);
return last + slast;
}
public static void main(String args[]){
int result=f(5);
System.out.println("Fibonacci number: " + result);
}
}
//dry run
/*5 return last=f(4) & slast=f(3)
4 return=lastf(3) & slast f(2)
3 return =lastf(2)  slast f(1)
2 return =last f(1) slast f(0)
1 return =return 1
0 return return 0



last f(4)=3
last f(3)=2
last f(2)=1
last f(1)=1

slast f(3)=1
slast f(2)=0
slast f(1)=return if statement 1
slast f(0)=return if statement 0*/
