 class Solution {
    public boolean XXX(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length-1;
        while (left<right) {
            char leftchar = chars[left];
            while (!Character.isLetterOrDigit(leftchar)&&left<right) {
                left++;
                leftchar = chars[left];
            }
            char rightchar = chars[right];
            while (!Character.isLetterOrDigit(rightchar)&&left<right) {
                right -- ;
                rightchar = chars[right];
            }
            if(Character.toLowerCase(leftchar) != Character.toLowerCase(rightchar)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

