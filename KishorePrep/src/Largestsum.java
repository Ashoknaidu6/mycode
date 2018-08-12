import java.util.Scanner;
//Largest Sum Contiguous Subarray
public class Largestsum {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[100];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		check(a);
	}

	private static void check(int[] a) {
		// TODO Auto-generated method stub
		int len = a.length;
		int max_sofar = Integer.MIN_VALUE;
		int max_endhere = 0;
		for(int i=0;i<len;i++) {
			max_endhere = max_endhere+a[i];
			if(max_sofar < max_endhere) {
				max_sofar = max_endhere;
			}
			if(max_endhere < 0) {
				max_endhere =0;
			}
		}
		System.out.println(max_sofar);
	}

}
