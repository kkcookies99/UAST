class Solution {
    public int XXX(String s) {
        int result = 0;
        int last = 0;
        int now = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            now = getValue(s.charAt(i));
            result = now < last ? result - now : result + now;
            last = now;
        }
        return result;
    }

    private int getValue(char ch) {
        switch (ch) {
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
                throw new IllegalArgumentException();
        }
    }
}

