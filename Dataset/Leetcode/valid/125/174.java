 class Solution {
    public boolean XXX(String s) {
        char[] chs = s.toCharArray();
        int left = 0, right = chs.length-1;
        while(left < right){
            if(!Character.isLetterOrDigit(chs[left]) && !Character.isUpperCase(chs[left])){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(chs[right]) && !Character.isUpperCase(chs[right])){
                right--;
                continue;
            }
            if(Character.toLowerCase(chs[left]) == Character.toLowerCase(chs[right])){
                left++;
                right--;
            } else return false;
        }
        return true;
    }
}

