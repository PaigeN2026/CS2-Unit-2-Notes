import java.util.Scanner; // import the scanner class

public class Main {

   public static void main(String []args) {

      System.out.println("Testing methods that RETURN values...");

      // Construct a Scanner object
      // note: System.in() is the computer's keyboard
      Scanner scan = new Scanner(System.in);

      /*
      // Take input with the Scanner methods
      System.out.println("Enter some text: ");
      String inputStr = scan.nextLine();
      System.out.println("Enter a whole number: ");
      int inputInt = scan.nextInt();
      System.out.println("Enter a decimal number: ");
      double inputDouble = scan.nextDouble();

      // Handle the user input (do something with the values)
      // Use it in a print statement
      System.out.println("You entered: " + inputStr);
      // Use values in an expression
      double sum = inputInt + inputDouble;
      */

      // *** STRING CLASS ***
      // Original way of structing a String object
      String message = new String("APCS is awesome");

      // Shortcut (common) way of creating a String
      String greeting = "Hello coders!"; // text in quotes is a "String literal"

      // Concatenate (combine) two or more String objects 
      String concatenated = greeting + message;
      System.out.println(concatenated);
      System.out.println(greeting + " " + message);
      // can combine String variables AND "String literals"

      // Numbers get converted to a String here
      System.out.println("I am " + 16 + " years old");
      System.out.println("12" + 3 + 4); // it doesnt add, it concatenates
      System.out.println(12 + 3 + 4); // NOT concatenation, just addition
      System.out.println("12" + (3 + 4)); // does parenthesis first
      System.out.println(("12") + 3 + 4);

      // *** STRING METHODS
      // .length() returns number of characters
      int messageLength = message.length();
      System.out.println("Length: " + messageLength);

      //.length()-1 represents final index
      System.out.println("Final Index: " + (message.length()- 1));

      // Use index to access characters(s)
      // .substring(int, int) return a string from first index to second 
      // not including the character at the second index
      String firstWord = message.substring(0,4);
      System.out.println(firstWord); 

      // .substring(int) returns a String from first index to end of string \
      String lastWord = message.substring(8);
      System.out.println(lastWord);
      
      // .indexOf(String) returns an int representing the index 
      // or position of the String argument passed in
      int indexOfAwesome = message.indexOf("awesome");
      System.out.println(indexOfAwesome);

      // not on AP exam but useful
      System.out.println(message.toUpperCase());
      System.out.println(message.toLowerCase());

      // .equals compares a parameter String to the calling String object
      // then returns a boolean representing whether they are EQUAL
      String s1 = "I am tired";
      String s2 = "It is almost the weekend";

      boolean isEqual = s1.equals(s2);
      System.out.println(isEqual);
      boolean isEqual2 = s1.equals("I am tired");
      System.out.println(isEqual2);

      String a = "ape";
      String z = "zebra";

      // .compareTo returns a positive integer if this string > other string
      // returns a negeative integer if this string < is other string 
      System.out.println(a.compareTo(z));
      System.out.println(z.compareTo(a));
  }
}
