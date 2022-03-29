 class Solution {
    public boolean XXX(String s) {
        int left = 0;
        int length = s.length();
        int right = length-1;
        while(left<right){
            while(left<right&&!Character.isLetterOrDigit(s.charAt(left)))left++;
            while (left<right&&!Character.isLetterOrDigit(s.charAt(right)))right--;
            String left_s = String.valueOf(s.charAt(left));
            String right_s = String.valueOf(s.charAt(right));
            if(!left_s.equalsIgnoreCase(right_s)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

