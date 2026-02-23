public class UC4Banner {

    public static void main(String[] args) {

        // Store banner lines in String array
        String[] banner = {
                String.join(" ", "*", "*", "*", "*", "*", "*", "*"),
                String.join(" ", "*", " ", " ", " ", " ", " ", "*"),
                String.join(" ", "*", " ", "U", "C", "4", " ", "*"),
                String.join(" ", "*", " ", " ", " ", " ", " ", "*"),
                String.join(" ", "*", "*", "*", "*", "*", "*", "*")
        };

        // Print banner using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
