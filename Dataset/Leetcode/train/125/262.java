 class Solution {
    public boolean XXX(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        char leftNext;
        char rightNext;
        while (left <= right) {
            leftNext = chars[left];
            rightNext = chars[right];
            while (!verify(leftNext) && ++left <= right) {
                leftNext = chars[left];
            }
            
            while (!verify(rightNext) && left <= --right) {
                rightNext = chars[right];
            }
            
            if (leftNext != rightNext) {
                if (alpha(leftNext) != alpha(rightNext) || Math.abs(leftNext - rightNext) != 32) {
                    return false;
                }
            }
            left++;
            right--;
        }
        return true;
    }
    
    
    public boolean verify(char c) {
        return (c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c >= 48 && c <= 57);
    }
    
    public boolean alpha(char c) {
        return (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
    }
}

