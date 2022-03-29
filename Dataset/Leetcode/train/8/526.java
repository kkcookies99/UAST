 class Solution {
    public int XXX(String s) {
        if(s == null || (s = s.trim()).length() == 0){
            return 0;
        }
        char first = s.charAt(0);
        if(first != '-' && first != '+' && (first < 48 || first > 57)) {
            return 0;
        }
        int start = -1;
        int end = -1;
        boolean flag = false;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) > 47 && s.charAt(i) < 58) {
                if(start == -1) {
                    if(s.charAt(i) != 48) {
                        start = i;
                        flag = false;
                    } else {
                        flag = true;
                    }
                }
            } else {
                if(flag || (i == 1 && start == -1)) {
                    return 0;
                }
                if (start != -1) {
                    end = i;
                    break;
                }
            }
        }
        long res = 0l;
        if(start == -1){
            return 0;
        } else {
            s = s.substring(start, end == -1 ? s.length() : end);
            if(s.length() > String.valueOf(Integer.MAX_VALUE).length()) {
                if(first != '-') {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
            res = (first == '-' ? -1 : 1) * Long.valueOf(s);
        }
        if (res > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if(res < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return (int) res;
        }
    }
}

