package main;


public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
//        for (char ch : str.toCharArray()) {
//            if (ch == '[') {
//                brackets++;
//            } else if (ch == ']') {
//                brackets--;
//            }
//        }

        int leftBracket = 0;
        int rightBracket = 0;

        //[LaunchCode[HI]] WORKS
        //][ NOW FAILS CORRECTLY

        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                leftBracket++;
            }
            if (ch == ']') {
                rightBracket++;
            }
            if (rightBracket > leftBracket) {
                return false;
            }

        }
        //leftBracket = 1

        int temp = 0;

        for (char ch : str.toCharArray()) {
            if (temp == leftBracket) {
                if (ch == '[') {
                    return false;
                }

            }
            if (ch == '[') {
                temp++;
            }
        }

        return true;
    }
}

//    int left = 0;
//    int right = 0;

//[LaunchCode[HI]]

//        for (char ch : str.toCharArray()) {
//                if (ch == '[') {
//                left++;
//                } else if (ch == ']') {
//                right++;
//                }
//                }
