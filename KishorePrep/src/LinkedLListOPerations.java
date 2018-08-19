import java.util.LinkedList;
import java.util.Scanner;

public class LLOpe {

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
		
		System.out.println(l);
		reversedisplay(l);
		copy(l);
		count(l);
		sum(l);
		System.out.println("enter string to search and delete");
		String s=sc.next();
		search(l,s);
		delete(l,s);
		deleteall(l);
	}

	/**
	 * @param l2
	 */
	private static void deleteall(LinkedList<String> l2) {
		if(l2.size()==0) {
			System.out.println("list is already empty");
		}
		else {
			
			while(l2.size()!=0) {
				l2.remove(0);
			}
		}
		System.out.println("after remove operation "+l2);
	}

	/**
	 * @param l2
	 */
	private static void sum(LinkedList<String> l2) {
		String s ="";
		int n =l2.size();int i=0;
		while(i<n) {
			s = s+l2.get(i);i++;
		}
		System.out.println("concated string "+s);
	}

	/**
	 * @param l2
	 * @param s
	 */
	private static void delete(LinkedList<String> l2, String s) {
		if(l2.contains(s)) {
			l2.remove(s);
		}
		System.out.println(l2);
	}

	/**
	 * @param l2
	 * @param s
	 */
	private static void search(LinkedList<String> l2, String s) {
		if(l2.contains(s)) {
			
			System.out.println("present in the index "+l2.indexOf(s));
		}
		else {
			System.out.println("not found");
		}
	}

	/**
	 * @param l2
	 */
	private static void count(LinkedList<String> l2) {
		System.out.println(l2.size());
	}

	/**
	 * @param l
	 */
	private static void copy(LinkedList<String> l) {
		LinkedList<String> l2 = new LinkedList<String>();
		l2 = l;
		System.out.println(l2);
	}

	/**
	 * @param l2
	 */
	private static void reversedisplay(LinkedList<String> l2) {
		int n = l.size();int i=n-1;
		while(i>=0) {
			String s = l.get(i);
			System.out.print(s+" ");
			i--;
		}
	}

}
