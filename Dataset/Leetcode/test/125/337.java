 class Solution {
    public boolean XXX(String s) {
        //双指针就可以了
        int N = s.length();
        s = s.toLowerCase();
        int left = 0;
        int right = N - 1;
        while (left < right) {
            while (left < right && !isValid(s.charAt(left))) {
                left++;
            }
            while (left < right && !isValid(s.charAt(right))) {
                right--;
            }
            // String leftStr = String.valueOf(s.charAt(left));
            // String rightStr = String.valueOf(s.charAt(right));
            // if (!leftStr.equalsIgnoreCase(rightStr)) {
            //     return false;
            // }
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }
        return true;

    }

    public boolean isValid(char ch) {
        if (Character.isLetter(ch) || Character.isDigit(ch)) {
            return true;
        }
        return false;
    }

    
}

