
import java.util.Scanner;


public class LongestCommonSubsequence {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		check(s1.toCharArray(),s2.toCharArray(),s1.length(),s2.length());

	}

	private static void check(char[] str1, char[] str2, int m, int n) {

		int[][] dp =new int[m+1][n+1];
		int max =0;
		for(int i=1;i<dp.length;i++) {
			System.out.println(dp[i]+" "+dp[i].length);
			for(int j=1;j<dp[i].length;j++) {
				if(str1[i-1] == str2[j-1]) {
					System.out.print(str1[i-1]+" ");
					dp[i][j] = dp[i - 1][j - 1] + 1;
				}
				else {
					dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
				}
				if(dp[i][j] > max){
					max = dp[i][j];
				}
			}
		}


		System.out.println();
		for(int i=0;i<m+1;i++) {
			for(int j=0;j<n+1;j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(max);
	}

}
