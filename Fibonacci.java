

public class Fibonacci {
	
		public static void main(String[]args) {
			int count=10;
			int first=0;
			int second=1;
			System.out.println("Fibonacci Series up to " + count + " terms:");

			for(int i=0;i<count;i++) {
				  System.out.print(first + " ");
				int next=first+second;
				first=second;
				second=next;
				
			}
		}

	}



