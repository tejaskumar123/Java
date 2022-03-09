package lab3;
import java.util.*;
public class sorting_array_3 {

	public static void main(String[] args) {
		int i=0,j=0;
		System.out.println("Enter n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of array");
		for(i=0 ; i<n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("The array elements before sorting are:");
		for(i=0;i<n;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
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

	}

	

}
