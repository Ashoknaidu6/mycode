import java.util.Scanner;
//Smallest sum contiguous sub array
public class SmallestSum {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] a = new int[100];
		for(int i=0;i<n;i++) {
			a[i]= sc.nextInt();
		}
		check(a);
	}

	private static void check(int[] a) {
		// TODO Auto-generated method stub
		int len =a.length;
		int min_sofar = Integer.MAX_VALUE;
		int min_here = Integer.MAX_VALUE;
		for(int i=0;i<len;i++) {
			if(min_here >0) {
				min_here = a[i];
			}
			else {
				min_here = min_here+a[i];
			}
			min_sofar = Math.min(min_sofar, min_here);
		}
		System.out.println(min_sofar);
	}
}
