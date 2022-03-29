 class Solution {
    public boolean XXX(String s) {
        int left = 0, right = s.length() - 1;
        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))) left ++;
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))) right --;
            if((s.charAt(left) | 100000) != (s.charAt(right) | 100000)) return false;
            left ++; right --;
        }
        return true;
    }
}

