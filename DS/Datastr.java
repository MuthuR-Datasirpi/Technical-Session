
import java.util.*;


public class Datastr {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value To declare");
		int value=sc.nextInt();
		int[] a=new int[value];
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		System.out.println("Sum of integer value = "+sum);
		LinkedList<Integer> linkedlist= new LinkedList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		Stack<Integer> stack=new Stack<>();
		for(int i=lst.size()-1; i>=0; i-- ) {
			st.push(lst.get(i));
		}
		Queue<Integer> queue=new LinkedList<>();
		
		for(int i=0; i<st.size(); i=i+2) {
				qe.add(st.get(i));
		}
		Map<String, Integer> mp= new TreeMap<String, Integer>();
		for(int i=1; i<st.size(); i=i+2) {
			mp.put("Index "+i, st.get(i));
		}
		System.out.println("Linked list = " +lst);
		System.out.println("Reverse list = "+st);
		System.out.println("Even index = "+qe);
		System.out.println("Odd Index = "+mp);
	}
}
	

