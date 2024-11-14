// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    
                String word = args[0];
                int shoutTimes = Integer.parseInt(args[1]);

                word = word.toUpperCase();

                // print the chars of the word
                for (int i = 0; i < word.length(); i++){
                        char ch = word.charAt(i);

                        // checks if need 'an'
                        if (ch == 'A' || ch == 'E' || ch == 'F' || ch == 'H' || ch == 'I' ||ch == 'L' || ch == 'M' ||ch == 'N' || ch == 'O' || ch == 'R'){
                                System.out.println("Give me an " + ch + ": " + ch + "!");
                        }
                        else System.out.println("Give me a  " + ch + ": " + ch + "!");
                }

                System.out.println("What does that spell?");
                
                for (int i = 0; i < shoutTimes; i++){
                        System.out.println(word + "!!!");
                }
        }
}
