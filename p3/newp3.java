import java.io.*;
import java.util.*;

public class newp3 {

    private static final Set<String> KEYWORDS = Set.of(
            "auto", "break", "case", "char", "const", "continue", "default", "do", "double",
            "else", "enum", "extern", "float", "for", "goto", "if", "int", "long", "register",
            "return", "short", "signed", "sizeof", "static", "struct", "switch", "typedef",
            "union", "unsigned", "void", "volatile", "while"
    );

    private static final Set<String> OPERATORS = Set.of(
            "+", "-", "*", "/", "%", "++", "--", "=", "==", "!=", "<", "<=", ">", ">=",
            "&&", "||", "!", "&", "|", "^", "~", "<<", ">>", "+=", "-=", "*=", "/=", "%=",
            "&=", "|=", "^=", "<<=", ">>="
    );

    private static final Set<Character> PUNCTUATIONS = Set.of(
            ';', ',', '(', ')', '{', '}', '[', ']', '.'
    );

    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Hp\\Desktop\\SEM 6\\DLP\\p3\\input.txt"; // Replace with your file path


        Set<String> tokens = new HashSet<>();
        Set<String> identifiers = new HashSet<>();
        Set<String> operators = new HashSet<>();
        Set<Character> punctuations = new HashSet<>();
        Set<String> keywords = new HashSet<>();


        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        boolean inMultiLineComment = false;
        while ((line = reader.readLine()) != null) {
            line = line.trim();


            if (inMultiLineComment) {
                if (line.contains("*/")) {
                    inMultiLineComment = false;
                    line = line.substring(line.indexOf("*/") + 2).trim();
                } else {
                    continue;
                }
            }


            if (line.contains("//")) {
                line = line.substring(0, line.indexOf("//")).trim();
            }


            if (line.contains("/*")) {
                inMultiLineComment = true;
                line = line.substring(0, line.indexOf("/*")).trim();
            }


            String[] splitTokens = line.split("\\s+|(?=[{}()\\[\\].,;+-/*%<>=!&|^~])|(?<=[{}()\\[\\].,;+-/*%<>=!&|^~])");

            for (String token : splitTokens) {
                if (token.isEmpty()) continue;
                tokens.add(token);


                if (KEYWORDS.contains(token)) {
                    keywords.add(token);
                } else if (OPERATORS.contains(token)) {
                    operators.add(token);
                } else if (token.length() == 1 && PUNCTUATIONS.contains(token.charAt(0))) {
                    punctuations.add(token.charAt(0));
                } else if (Character.isJavaIdentifierStart(token.charAt(0))) {
                    identifiers.add(token);
                }
            }
        }
        reader.close();


        System.out.println("Tokens: " + tokens);
        System.out.println("Identifiers: " + identifiers);
        System.out.println("Operators: " + operators);
        System.out.println("Punctuations: " + punctuations);
        System.out.println("Keywords: " + keywords);
    }
}
