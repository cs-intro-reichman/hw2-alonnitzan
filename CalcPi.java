// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    
		int numberOfTerms = Integer.parseInt(args[0]);

		double divider = 1;
		double piSum = 0;

		// add or subtract the term
		boolean plusSign = true;

		// sum the terms
		for (int i = 0; i < numberOfTerms; i++){
			if(plusSign){
				piSum += 1 / divider;
				plusSign = false;
			} else {
				piSum -= 1 / divider;
				plusSign = true;
			}
			divider += 2;
		}

		piSum = piSum * 4;
		
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated    : " + piSum);
	}
}
