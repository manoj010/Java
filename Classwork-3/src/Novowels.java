public class Novowels {
    public static void main(String[] args) {
        String str = "MOBILE PHONE IS DEAD";
        String output = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                output += c;
            }
        }
        System.out.println(output);
    }
}
