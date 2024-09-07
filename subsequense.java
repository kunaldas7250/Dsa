/*import java.util.Scanner;
public class subsequense{
public static int sequence(int ind,ArrayList<Integer> &ds,int [],int n ){
	if(ind==n){
		for(auto it:ds){
			System.out.println(it);
		}
		return;
	}
	// take 
	ds.add(arr[ind]);
	sequence(ind+1,ds,arr,n);
	ds.remove();
	//not take
	sequence(ind+1,ds,arr,n);
}
public static void main(String args[]){
	Scanner pc= new Scanner(System.in);
System.out.println("enter the array element:");
int size=pc.nextInt();
int arr[]=new int[size];
for(int i=0;i<size;i++){
	arr[i]=pc.nextInt();

}
int n=arr[i].length();
System.out.println(n);
}
}*/

import java.util.ArrayList;
import java.util.Scanner;

public class subsequense {
    public static void sequence(int ind, ArrayList<Integer> ds, int[] arr, int n) {
        if (ind == n) {
            for (Integer it : ds) {
                System.out.print(it + " ");
            }
            System.out.println();
            return;
        }
        // take
        ds.add(arr[ind]);
        sequence(ind + 1, ds, arr, n);
        ds.remove(ds.size() - 1);
        // not take
        sequence(ind + 1, ds, arr, n);
    }
	

    public static void main(String args[]) {
        Scanner pc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int size = pc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = pc.nextInt();
        }
        int n = arr.length;
        ArrayList<Integer> ds = new ArrayList<>();
        sequence(0, ds, arr, n);
	  // sequence(0, ds,0,s,int sum=0, arr, n);
    }
}


/*import java.util.ArrayList;
import java.util.Scanner;

public class subsequense {
    public static void sequence(int ind, ArrayList<Integer> ds, int s, int sum, int[] arr, int n) {
        if (ind == n) {
            if (s == sum) {
                for (Integer it : ds) {
                    System.out.print(it + " ");
                }
                System.out.println();
            }
            return;
        }
        // take
        ds.add(arr[ind]);
        s += arr[ind];
        sequence(ind + 1, ds, s, sum, arr, n);
        s -= arr[ind];
        ds.remove(ds.size() - 1);
        // not take
        sequence(ind + 1, ds, s, sum, arr, n);
    }

    public static void main(String args[]) {
        Scanner pc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int size = pc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = pc.nextInt();
        }
        int n = arr.length;
        ArrayList<Integer> ds = new ArrayList<>();
        System.out.println("Enter the sum:");
        int sum = pc.nextInt();
        sequence(0, ds, 0, sum, arr, n);
    }
}

/*
We are given an array arr = [1, 2, 1] and a sum sum = 2. We need to find a subset of the array that sums up to sum.

Here's the step-by-step dry run:

main method:
size = 3
arr = [1, 2, 1]
n = 3
ds = empty ArrayList
sum = 2
Call sequence(0, ds, 0, sum, arr, n)
sequence method (ind = 0, ds = [], s = 0, sum = 2, arr = [1, 2, 1], n = 3):
ind = 0, ds = [], s = 0, sum = 2
Take element 1:
ds = [1], s = 1
Call sequence(1, ds, 1, sum, arr, n)
Not take element 1:
ds = [], s = 0
Call sequence(1, ds, 0, sum, arr, n)
sequence method (ind = 1, ds = [1], s = 1, sum = 2, arr = [1, 2, 1], n = 3):
ind = 1, ds = [1], s = 1, sum = 2
Take element 2:
ds = [1, 2], s = 3
Call sequence(2, ds, 3, sum, arr, n)
Not take element 2:
ds = [1], s = 1
Call sequence(2, ds, 1, sum, arr, n)
sequence method (ind = 2, ds = [1, 2], s = 3, sum = 2, arr = [1, 2, 1], n = 3):
ind = 2, ds = [1, 2], s = 3, sum = 2
s > sum, so return
sequence method (ind = 2, ds = [1], s = 1, sum = 2, arr = [1, 2, 1], n = 3):
ind = 2, ds = [1], s = 1, sum = 2
Take element 1:
ds = [1, 1], s = 2
Call sequence(3, ds, 2, sum, arr, n)
Not take element 1:
ds = [1], s = 1
Call sequence(3, ds, 1, sum, arr, n)
sequence method (ind = 3, ds = [1, 1], s = 2, sum = 2, arr = [1, 2, 1], n = 3):
ind = 3, ds = [1, 1], s = 2, sum = 2
s == sum, so print the subset [1, 1]
So, the subset of the array that sums up to sum is [1, 1]*/