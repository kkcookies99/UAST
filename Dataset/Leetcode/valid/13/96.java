class Solution {
    public int XXX(String s) {
        char[] chars = s.toCharArray();
        int sum = 0, pre = 0;
        for (int i = 0; i < chars.length; i ++) {
            int cur = getValue(chars[i]);
            sum += pre < cur ? cur - 2 * pre : cur;
            pre = cur;
        }
        return sum;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default: 
                return 0;
        }
    }
}

