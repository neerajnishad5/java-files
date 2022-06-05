public class RemoveSpecialCharFromInput {

    public static void main(String[] args) {

        String input = "Spe#2%ci^a*l";

        System.out.println(input.replaceAll("[^a-zA-Z0-9]", "")); // Removing special chars from input

        String s0 = "hello  this  is  me";

        System.out.println(s0.replaceAll("\\s+", " ").trim());  // replacing multiple spaces with one

        String s2 = "A string datatype is a datatype modeled on the idea of a formal string.";

        String words[] = s2.split("\\s", 10); // counting number of words in string by using split method

        System.out.println(words.length);

    }
}