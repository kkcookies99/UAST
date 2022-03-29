 class Solution {
    public int XXX(String s) {
        int num = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && trans(s.charAt(i)) < trans(s.charAt(i + 1))) {
                num += trans(s.charAt(i + 1)) - trans(s.charAt(i));
                i++;
            } else {
                num += trans(s.charAt(i));
            }
        }
        return num;
    }

    public int trans(char ch) {
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
                return 0;
        }
    }
}

