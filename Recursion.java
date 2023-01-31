public class Recursion {

    public static void main(String[] args) {
        
        // Remove letters (30 pts)

        // Instructions (Important!)

        // Without using arrays or loops or regular expressions, apply recursion to remove specific letters in
        // your full name.

        // 1. If the last letter of your surname is a vowel, remove all vowels in
        // your full name.

        // 2. If the last letter of your surname is a consonant, remove all
        // consonants in your full name.

        // 3. Use only lowercase letters
        
        // 4. Each letter should be removed one by one.

        // Example:
        // Full name is "elizer ponio jr".
        // The output should be "lzr pn jr".

        // Put your complete name in the "fullName" variable.
        // Example:
        // String fullName = "elizer ponio jr";

        String fullName = "justine aron malig";

        removeLetter(fullName);
    }

    static void removeLetter(String str) {
            // Add code here
             if (str.length() == 0) {
        return str;
    }
    char e = str.charAt(0);
    if (e == 'b' || e == 'c' || e == 'd' || e == 'f' || e == 'g' || e == 'h' || e == 'j' || e == 'k' ||
     e == 'l' || e == 'm' || e == 'n' || e == 'p' || e == 'q' || e == 'r' || e == 's' || e == 't' || e == 'v' || e == 'w' || e == 'x' ||
     e == 'y' || e == 'z') {
        return extractConsonants(str.substring(1));
    } else {
        return c+extractConsonants(str.substring(1));
    }
    }
}
