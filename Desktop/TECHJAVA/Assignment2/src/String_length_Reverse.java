
public class String_length_Reverse {

	   public static void main(String args[])
	    {
	      int c=1,b=2;
	      String str="Hyderbad";
	      int len=str.length();
	      System.out.println("Length of string="+len);
	      char[] a=new char[len];
	      switch(b)
	      {
	       case 1 :
	        { 
	          System.out.println("String is");
	          for(int i=0;i<len;i++)
	           {
	            a[i]=str.charAt(i);
	            System.out.print(a[i]);
	           }
	          System.out.println(" ");
	        }break;
	      case 2 :
	        {
	         System.out.print("Revaerse string is ->");
	         for(int i=len-1;i>=0;i--)
	          {
	           a[i]=str.charAt(i);
	           System.out.print(a[i]);
	         
	         }break;
	  
	        }
	      default:
	      System.out.println("out of switch");

	       }
	     
	   }
	   
	  }

