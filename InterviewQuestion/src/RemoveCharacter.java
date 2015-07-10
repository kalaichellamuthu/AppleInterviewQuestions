
public class RemoveCharacter {

	
    static String input = "";
    public static void main(String[] args) {
        input = "Hello";
        char token = 'l';
        removeChar1(token);
    }

    private static void removeChar1(char token) {
        System.out.println(input);
        for (int i=0;i<input.length();i++) {
            if (input.charAt(i) == token) {
            input = input.replace(input.charAt(i), ' ');
                System.out.println("MATCH FOUND");
            }
            input = input.replaceAll(" ", "");
            System.out.println(input);
        }
    }
}