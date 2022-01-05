public class Diff_Static_NonStatic {

		
			public static int sum(int a, int b)
			{
				// Simply returning the sum
				return a + b;
			}
	  
			
			public int diff (int c, int d) {
				
				return c-d;
				
			}

			// Main driver method
			public static void main(String[] args)
			{
				// Custom values for integer
				// to be summed up
				int n = 3, m = 6, c=10, d=4;

				// Calling the static method of above class
				// and storing sum in integer variable
				
				Diff_Static_NonStatic Dos = new Diff_Static_NonStatic();
				
				int s = Diff_Static_NonStatic .sum(n, m);

				// Print and display the sum
				System.out.println("sum is = " + s);
				
				int k=Dos.diff(c,d);
				
				System.out.println("Diff is "+ k);
			}
		}
	

	
