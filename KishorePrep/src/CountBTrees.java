import java.util.Scanner;
//Count Balanced Binary Trees of Height h
public class CountBTrees {

	private static Scanner sc;

	public static void main(String[] args) {
			sc = new Scanner(System.in);
			int height = sc.nextInt();
			int result = check(height);
			System.out.println(result);
	}

	private static int check(int height) {
		if(height==0 || height==1)return 1;
		return (check(height-1)*(2*check(height-1)+check(height-2)));
	}

}
