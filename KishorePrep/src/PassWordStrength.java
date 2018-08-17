import java.util.Scanner;
//checking password strength
public class PassWordStrength {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String s = sc.next();
		check(s);
	}

	private static void check(String s) {
		// TODO Auto-generated method stub
		int  l = s.length();
		if(l<=8) {
			System.out.println("minimum length be 8 : Invalid pass");
			return;
		}
		int i=0;int lf=0,uf=0,nf=0,pf=0;
		while(i<l && (lf==0|| uf==0 || nf==0 || pf==0)) {
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch)) {
				uf=1;
			}
			if(Character.isLowerCase(ch)) {
				lf=1;
			}
			if(Character.isDigit(ch)) {
				nf=1;
			}
			if(isSpecial(ch)) {
				pf = 1;
			}
			i++;
		}
		yoyo(lf,nf,pf,uf);
	}

	private static void yoyo(int lf, int nf, int pf, int uf) {
		// TODO Auto-generated method stub
		boolean a = (lf!=0);
		boolean b = (nf!=0);
		boolean c = (pf!=0);
		boolean d = (uf!=0);
		if(a && b&& c && d) {
			System.out.println("valid pass");
		}
		else {
			if(lf==0) {
				System.out.println("use lower case");
			}
			if(nf==0) {
				System.out.println("use number");
			}
			if(uf==0) {
				System.out.println("use upper case");
			}
			if(pf==0) {
				System.out.println("use Spaical case");
			}
		}


	}

	private static boolean isSpecial(char ch) {
		// TODO Auto-generated method stub
		if(ch =='@')return true;
		else
			return false;
	}

}
