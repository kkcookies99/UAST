 class Solution {
    public boolean XXX(String s) {
        char[] c = s.toCharArray();
        int left = 0;
        int right = c.length - 1;
        while(left < right) {
            if(!isValid(c[left])) {
                left++;
                continue;
            }
            if(!isValid(c[right])) {
                right--;
                continue;
            }
            if(left < right) {
                if((c[left] + 32 - 'a') %32 != (c[right] + 32 - 'a') % 32) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
    
    public boolean isValid(char c) {
        if((c >= 'A' && c <= 'Z')||(c >= 'a' && c <= 'z') || (c >='0' && c <='9')) {
            return true;
        }
        return false;
    }
}

