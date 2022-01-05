import java.util.Scanner;
public class RadiusOfaCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner input = new Scanner(System.in);
		        System.out.println("Enter Radius ");
		        double r = input.nextDouble();
		        System.out.println(r);
		        System.out.printf("1.Diameter\n2.circumference\n3.area\n4.exit\n");
		        System.out.println("Enter number you want ");
		        int n = input.nextInt();
		        switch(n)
		        {
		            case 1:
		                {
		                    System.out.println("The diameter of the circle is "+(r*2));
		                    break;
		                }
		            case 2:
		                {
		                    System.out.println("The Circumference of the circle is "+2*Math.PI*r);
		                    break;
		                }
		            case 3:
		                {
		                    System.out.println("The Area of the circle is "+Math.PI*r*r);
		                    break;
		                }
		            case 4:
		                {
		                    return;
		                }
		            default:
		                {
		                    System.out.println("Wrong Input");
		                }

		        }
		  }
		}
	