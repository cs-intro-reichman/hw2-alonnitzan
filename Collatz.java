// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    
		int N = Integer.parseInt(args[0]);
		String stringType = args[1];

		boolean hailstone = true;

		// the loop of seed 1 to N
		for (int i = 1; i <= N; i++){

			int counterSteps = 1;
			String outputToPrint = "";
			int cuurentNumber = i;

			// add current seed (starting cuurentNumber) to string
			outputToPrint += cuurentNumber + " ";
			
			// for the first irretation when i=1
			if (cuurentNumber == 1){
				
				cuurentNumber = (cuurentNumber * 3) + 1;
				counterSteps += 1;
				
				// add the new cuurentNumber
				outputToPrint += cuurentNumber + " ";
			}
			
			// the loop that checks the hailstone sequence and prints it
			while ( cuurentNumber != 1){
				
				// when cuurentNumber even
				if (cuurentNumber % 2 == 0) cuurentNumber = cuurentNumber / 2;

				// when cuurentNumber odd
				else cuurentNumber = (cuurentNumber * 3) + 1;

				counterSteps += 1;
				
				outputToPrint += cuurentNumber + " ";
			}

			if (stringType.equals("v")) System.err.println(outputToPrint + "(" + counterSteps + ")");
		}

		// prints summary line
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}
