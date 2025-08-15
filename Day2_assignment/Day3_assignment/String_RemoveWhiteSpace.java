package Day3_assignment;

public class String_RemoveWhiteSpace {

	public static void main(String[] args) {
        String input = "   Java   is   Language   ";
        // Remove all white spaces
        String result = removeWhiteSpaces(input);

        System.out.println("Original String: \"" + input + "\"");
        System.out.println("String without spaces: \"" + result + "\"");
    }
    public static String removeWhiteSpaces(String str) {
        // Using the replaceAll method to remove all spaces
        return str.replaceAll("\\s+", "");
    }
}