package Day7_assignment;

//1. Check if character is a Digit
class WrapperDemo1 {
public static void main(String[] args) {
   char ch1 = '7';
   char ch2 = 'N';
   
   System.out.println(ch1 + " is digit: " + Character.isDigit(ch1));
   System.out.println(ch2 + " is digit: " + Character.isDigit(ch2));
}
}