import java.io.*;
public class Pascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		Pascal(n);

	}
 static void Pascal(int n)
 {
	 for (int line =0; line<n; line++) {
		 for(int i=0;i<=line;i++)
			 System.out.print(binomialCoeff(line, i)+" ");
		      System.out.println();
	 }
 }
 static int binomialCoeff(int n, int k)
 {
	 int res =1;
	 
	 if(k>n-k)
		 k=n-k;
	 for(int i=0;i<k;++i)
	 {
		 res *=(n-i);
		 res/=(i+1);
	 }
	 return res;
 }
}
