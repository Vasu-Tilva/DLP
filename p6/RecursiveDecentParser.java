public class RecursiveDecentParser {

    static int count = 0;
    static int bracket = 0;

    public static boolean S(String input, String grammer[][], int len) {

        if (count < len && input.charAt(count) == grammer[0][1].charAt(0)) {
            count++;
            bracket++;

            if (L(input, grammer, len)) {

                if (count < len && input.charAt(count) == grammer[0][1].charAt(2)) {
                    count++;
                    bracket--;
                    if(bracket==0 && count<len){
                        return false;
                    }
                    return true;
                }
            }
        } else if (count < len && input.charAt(count) == grammer[0][2].charAt(0)) {
            count++;
            if (count == 1 && len > 1) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean L(String input, String grammer[][], int len) {

        if (S(input, grammer, len)) {
            // count++;
            if (M(input, grammer, len)) {
                return true;
            }
        }
        return false;
    }

    public static boolean M(String input, String grammer[][], int len) {

        if (count < len && input.charAt(count) == grammer[2][1].charAt(0)) {
            count++;
            if (S(input, grammer, len)) {
                if (M(input, grammer, len)) {
                    return true;
                }
            }
        } else {
            // count++;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String grammer[][] = {
                { "S", "(L)", "a" },
                { "L", "SM", "" },
                { "M", ",SM", "@" }
        };

        String input = "(a,a),a";
        int len = input.length();

        System.out.println(S(input, grammer, len));
        // System.out.println(count);
        // System.out.println(len);
    }
}