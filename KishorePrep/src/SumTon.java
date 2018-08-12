import java.util.Scanner;
//Different ways to sum n using numbers greater than or equal to m
public class SumTon {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
			//int n=3;int m=1;
			check(n,m);
	}

	private static void check(int n, int m) {
		// TODO Auto-generated method stub
		int[][] dp = new int[n+2][n+2];
		dp[0][n+1] = 1;
		for(int k=n;k>=m;k--) {
			for(int i=0;i<=n;i++) {
				dp[i][k] = dp[i][k+1];
			if(i-k>=0) {
				System.out.print(i-k+" "+k+" "+dp[i][k]+" "+dp[i-k][k]);
				dp[i][k] = (dp[i][k]+dp[i-k][k]);
				System.out.println();
			}
			}
		}
		System.out.println("matrix value");
		for(int i=0;i<n+2;i++) {
			for(int j=0;j<n+2;j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
	System.out.println(dp[n][m]);
	}

}
