import java.util.HashMap;

public class UC8Bannerapp {
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('0', new String[]{
                "   ***   ",
                "  **  ** ",
                "  **  ** ",
                "  **  ** ",
                "  **  ** ",
                "  **  ** ",
                "   ***   "
        });

        charMap.put('P', new String[]{
                "  ****** ",
                "  **   **",
                "  **   **",
                "  ****** ",
                "  **      ",
                "  **      ",
                "  **      "
        });

        charMap.put('S', new String[]{
                "   ***** ",
                "  **     ",
                "  **     ",
                "   ***** ",
                "      ** ",
                "      ** ",
                "  *****  "
        });

        return charMap;
    }
    public static void displayBanner(String message,HashMap<Character, String[]> charMap){

        int patternHeight = charMap.get('0').length;
    
        for (int line = 0; line < patternHeight; line++) {
    
            StringBuilder sb = new StringBuilder();
    
            for (char ch : message.toUpperCase().toCharArray()) {
    
                String[] pattern = charMap.get(ch);
    
                if (pattern != null) {
                    sb.append(pattern[line]).append("  ");
                }
            }
            System.out.println(sb);
        }
    }
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "00PS";
        displayBanner(message, charMap);
    }
}