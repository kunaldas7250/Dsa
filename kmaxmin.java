/*import java.util.Scanner;
class kmaxmin{
public static void main(String args[]){
Scanner pc=new Scanner(System.in);
System.out.println("enter the elemnet of an array");
int a=pc.nextInt();
int array[]=new int[a];
System.out.println("array elemnet");
for(int i=0;i<=a;i++)
{
array[i]=pc.nextInt();

}
System.out.println("kth max and min of an elemnet array");
for(int i=0;i<=a.length-1;i++){
for(int j=i+1;j<a.length;j++){
if(array[i]<array[j]){
int temp;
temp=array[i];
array[i]=array[j];
array[j]=temp;
}
}
System.out.println("enter the kth elemnet");
k=pc.nextInt();
if(array[i]==k-1){
System.out.println(array[i]);
}
}
for(int i=0;i<=a.length;i++)
{
System.out.println(array[i]);
}
}
}*/


import java.util.Scanner;

class KMaxMin {
    public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int a = pc.nextInt();
        int[] array = new int[a];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < a; i++) {
            array[i] = pc.nextInt();
        }

        System.out.println("Enter the value of k:");
        int k = pc.nextInt();

        // Sort the array in descending order
        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < a; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // Print the kth largest element
        System.out.println("Kth largest element: " + array[k - 1]);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < a; i++) {
            System.out.println(array[i]);
        }
    }
}