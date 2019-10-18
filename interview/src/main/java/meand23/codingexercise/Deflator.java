package meand23.codingexercise;

/*
Write a function that takes a string and returns a "compressed" version
of that string where repeated characters are represented by the character
followed by the number of times it was repeated.

Examples:
compress('abc') -> 'abc'
compress('aabbcc') -> 'a2b2c2'
compress('abbbcc') -> 'ab3c2'
compress('abcabc') -> 'abcabc'
compress('bbbaaabbbaaa') -> 'b3a3b3a3'

How should we test this?
*/

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */
public class Deflator {

    public String compress(String input) {
        // check arg
        if (input == null || input.length() <= 1)
            return input;

        StringBuffer compressed = new StringBuffer("");
        int count = 1;
        char buffer = input.charAt(0);

        for (int index = 1; index < input.length(); index++) {
            // shift right
            char next = input.charAt(index);

            // check if same letter
            if (buffer == next)
                count++;
            else {
                compressed.append( Character.toString(buffer) + count );
                buffer = next;
                count = 1;
            }

            // last write, check if on last character
            if (index == input.length() - 1)
                compressed.append( Character.toString(buffer) + count );
        }
        String results = // don't display count if only single
                compressed.toString().replace("1", "" );
        return results;
    }

    public static void main(String[] args) {
        /*
        Examples:
        compress('abc') -> 'abc'
        compress('aabbcc') -> 'a2b2c2'
        compress('abbbcc') -> 'ab3c2'
        compress('abcabc') -> 'abcabc'
        compress('bbbaaabbbaaa') -> 'b3a3b3a3'
        */
        String input;
        //input = "abc";
        //input = "aabbcc";
        //input = "abbbcc";
        //input = "abcabc";
        input = "bbbaaabbbaaa";
        //input = "a";
        String output = new Deflator().compress(input);

        System.out.println( "input  => " + input  );
        System.out.println( "output => " + output );
    }
}