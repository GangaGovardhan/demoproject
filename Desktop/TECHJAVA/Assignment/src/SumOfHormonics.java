import java.io.*;
public class SumOfHormonics {
	float sum(float n)
	{
	    // Base condition
	    if (n < 2)
	        return 3;
	 
	    else
	        return 1 / n + (sum(n - 1));
	}
	public static void main(String args[])
	{
		SumOfHormonics g = new SumOfHormonics();
	  System.out.println(g.sum(1));
	  System.out.print(g.sum(10));
	}

	}


