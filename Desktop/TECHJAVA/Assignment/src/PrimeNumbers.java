public class PrimeNumbers {

	public static void main(String[] args) {
  // TODO Auto-generated method stub
		for(int n=1;n<=10;n++)
		{
         int temp=0;
         for (int i=2;i<=n-1;i++) {
        	 if(n%i==0) {
        		 temp=temp+1;
        	 }
         }
         if(temp==0) {
        	 System.out.println("No prime not number");
         }else
         {
        	 System.out.println("no is prime");
         }
	}

}
}