 class Solution {
    public boolean XXX(String s) {
        int start = 0, end = s.length() - 1;
        while(start<end) {
            char tempA = s.charAt(start);
            char tempB = s.charAt(end);
            if(!isValid(tempA)) {
                start ++;
            }
            if(!isValid(tempB)) {
                end --;
            }
            if(isValid(tempB) && isValid(tempA)) {
                if(tempA == tempB) {
                    start++; end--;
                    continue;
                } else if(tempA >= 65 && tempB >= 65 && Math.abs(tempA - tempB) == 32) {
                    start++; end--;
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;

    }

    public boolean isValid(char a) {
        if(a >= 48 && a <= 57) return true;//是否是数字0-9
        if(a >= 65 && a <= 90) return true;//是否是A-Z
        if(a >= 97 && a <= 122) return true;//是否是a-z
        return false;
    }

}```

