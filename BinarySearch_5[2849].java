package lab4;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		int i=0,j=0;
		
		System.out.println("enter key");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
		System.out.println("enter no of elemetns in array");
		int n = sc.nextInt();
		int beg=0,ends=n-1,mid=(beg+ends)/2;
		int a[] = new int[n];
		System.out.println("Enter array");
		for(i=0 ; i<n;i++)
			a[i]= sc.nextInt();
		sc.close();
		
		for(i=0 ; i<n-1; i++) {
			for(j=0; j<n-i-1; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("The array elements after sorting are:");
		for(i=0;i<n;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		while(beg<=ends && a[mid]!=key) {
			if(a[mid]<key)
				beg=mid+1;
			else {
				ends=mid+1;
			}
			mid=(beg+ends)/2;
		}
		
		if(a[mid]==key)
			System.out.println("The key element found");
		else
			System.out.println("Key element not found");
		
	}

}
