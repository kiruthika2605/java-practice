public class UC7Bannerapp {

    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];

        charMaps[0] = new CharacterPatternMap('O', new String[]{
                "   ***   ",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                "   ***   "
        });

        charMaps[1] = new CharacterPatternMap('P', new String[]{
                " ******  ",
                " **   ** ",
                " **   ** ",
                " ******  ",
                " **      ",
                " **      ",
                " **      "
        });

        charMaps[2] = new CharacterPatternMap('S', new String[]{
                "  *****  ",
                " **      ",
                " **      ",
                "  *****  ",
                "      ** ",
                "      ** ",
                " *****   "
        });

        charMaps[3] = new CharacterPatternMap(' ', new String[]{
                "          ",
                "          ",
                "          ",
                "          ",
                "          ",
                "          ",
                "          "
        });

        return charMaps;
    }
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == Character.toUpperCase(ch)) {
                return map.getPattern();
            }
        }

        return null;
    }
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        int height = 7; // each letter is 7 lines tall

        for (int row = 0; row < height; row++) {

            for (int i = 0; i < message.length(); i++) {

                String[] pattern = getCharacterPattern(message.charAt(i), charMaps);

                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}