import java.util.Scanner;

public class Knapsacko1 {

	private static Scanner sc;
	private static int W;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int[] wt = new int[10];
		int[] val = new int[10];
		System.out.println("the bag maximum capacity");
		W = sc.nextInt();
		System.out.println("the number of items");
		int n =sc.nextInt();
		System.out.println("enter weight values");
		for(int i=0;i<n;i++) {
			wt[i] = sc.nextInt();
		}
		System.out.println("enter values of the items");
		for(int i=0;i<n;i++) {
			val[i]= sc.nextInt();
		}
		check(W,wt,val,n);
	}

	private static void check(int W, int[] wt, int[] val, int n) {
		// TODO Auto-generated method stub
			int i,w;
			int[][] dp = new int[n+1][W+1];
			for(i=0;i<=n;i++) {
				for(w=0;w<=W;w++) {
					if(i==0 || w==0) {
						dp[i][w] = 0;
					}
					else if(wt[i-1]<=w) {
						dp[i][w] = max(val[i-1]+dp[i-1][w-wt[i-1]],dp[i-1][w]);
					}
					else {
						dp[i][w]= dp[i-1][w];
					}
				}
			}
	System.out.println(dp[n][W]);
	
	for(i=0;i<n+1;i++) {
		for(int j=0;j<W+1;j++) {
			System.out.print(dp[i][j]+" ");
		}
		System.out.println();
	}
	}

	private static int max(int i, int j) {
		// TODO Auto-generated method stub
		return i>j ? i:j;
	}

}
