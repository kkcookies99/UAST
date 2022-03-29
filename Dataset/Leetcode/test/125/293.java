 class Solution {
    public boolean XXX(String s) {
        if ("".equals(s))return true;
        s = s.toLowerCase();
        int left = 0;
        int right = s.length()-1;
        while (left <= right) {
            if (left == right && Character.isLetterOrDigit(s.charAt(left))) {
                return true;
            }
            else if (!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            } else {
                if (s.charAt(right) != s.charAt(left)) {
                    return false;
                }else {
                    left++;
                    right--;
                }
            }
        }
        return true;
    }
}

