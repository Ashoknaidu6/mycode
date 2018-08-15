import java.util.Scanner;
//QUESTION GIVEN IN EPAM (@attendanc question)
public class Amen {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int emp = sc.nextInt();
		int days = sc.nextInt();
		int[][] yoyo = new int[days][emp];
		for(int i=0;i<days;i++) {
			String s = sc.next();
			for(int m=0;m<s.length();m++) {
				char ch = s.charAt(m);
				if(ch=='Y') {
					yoyo[i][m] = 1;
				}
				else {
					yoyo[i][m] = 0;
				}
			}
		}
		print(yoyo,days,emp);
	}

	private static void print(int[][] yoyo, int days, int emp) {
		// TODO Auto-generated method stub
		for(int i=0;i<days;i++) {
			for(int j=0;j<emp;j++) {
				System.out.print(yoyo[i][j]+" ");
			}
			System.out.println();
		}
		int i,j;int count=0,sum=0;
		int[] b = new int[days];
		for(i=0;i<days;i++) {
			for(j=0;j<emp;j++) {
				if(yoyo[i][j]==1) {
					count++;
				}
			}
			b[i] =count;
			count =0;
		}
		for(i=0;i<days;i++) {
			System.out.print(b[i]+" ");
			if(b[i]==emp) {
				sum++;
			}
		}
		System.out.println();
		System.out.println(sum);
	}
}
