/**
 * @author KISHORE
 *
 */
import java.util.LinkedList;
import java.util.Scanner;

public class LL2 {

	private static LinkedList<String> l;
	private static Scanner sc;
	public static void main(String[] args) {
		l = new LinkedList<String>();
		sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test>0) {
			String amen = sc.next();
			l.add(amen);test--;
		}
		int position = sc.nextInt();
		String yo = sc.next();
		insertafter(l,position,yo);
		deleteafter(l,position);
	}

	/**
	 * @param l2
	 * @param pos
	 * @param yo 
	 */
	private static void insertafter(LinkedList<String> l2, int pos, String yo) {
		int n = l2.size();
		if(pos+1>n) {
			System.out.println("incompatible to insert");
		}
		else {
			l2.add(pos, yo);
		}
		System.out.println(l2);
	}

	/**
	 * @param l2
	 * @param pos
	 */
	private static void deleteafter(LinkedList<String> l2, int pos) {
		int size = l2.size();
		if(size==0) {
			System.out.println("list is empty to delete");
		}
		else {
			if(pos>size) {
				System.out.println("list is small to delete the position becoz the size is "+l2.size());
			}
			else {
				while(pos<l2.size()) {
					l2.remove(pos);
				}

			}
		}
		System.out.println(l2);
	}
}
