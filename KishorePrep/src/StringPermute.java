//program to print all permutations of a given string
public class StringPermute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "JHJBGJH";
		int n =str.length();
		permute(str,0,n-1);
	}

	private static void permute(String str, int l, int r) {
		// TODO Auto-generated method stub
		if(l==r) {
			System.out.println(str);
		}
		else {
			for(int i=l;i<=r;i++) {
				str = swap(str,l,i);
				//System.out.print(str+" ");
				permute(str,l+1,r);
				str = swap(str,l,i);
			}
		}
	}

	private static String swap(String a, int i, int j) {
		// TODO Auto-generated method stub
		char temp;
		char[] chararray = a.toCharArray();
		temp = chararray[i];
		chararray[i] = chararray[j];
		chararray[j] = temp;
		return String.valueOf(chararray);
	}

}
