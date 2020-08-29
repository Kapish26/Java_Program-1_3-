import java.util.Scanner;
class Quadratic {
	public static void main(String[] args) {
		double a  , b  , c  ;
		Scanner s = new Scanner (System.in) ;
		System.out.println("Enter the coefficient of x^2 :  ");
		a = s.nextDouble() ; 
		System.out.println("Enter the coefficient of x :  ");
		b = s.nextDouble() ;
		System.out.println("Enter the constant :  ");
		c = s.nextDouble() ;
		s.close();
		double det = 0 , d = 0;
		det =((b*b) - 4 * a * c );
		// System.out.print(det);
		if ( det >=  0 ) {
			d = Math.sqrt(det);
			double r1 = ((- b + det ) / 2*a);
			double r2 = ((- b - det ) / 2*a);
			System.out.println("The Roots of the equation are : " + r1 + " , " + r2 );
		} else if( det < 0 ) {
			det *= -1 ;
			d = Math.sqrt(det);
			double real = -b / (2 * a) ; 
			double imaginary = d / (2 * a);
			System.out.println("The Roots of the equation are : " + real + " + i" + imaginary + " , " + real + " - i" + imaginary );
		}
		
	}
}