 class Solution {
    public int XXX(String s) {

        char[] chars =s.toCharArray();

        int num = 0;

        for(int i = 0; i < chars.length; i ++) {
            char c = chars[i];

            if (c == 'I' && i + 1 < chars.length && chars[i + 1] == 'V') {
                num += 4;
                i++;
            } else if (c == 'I' && i + 1 < chars.length && chars[i + 1] == 'X') {
                num += 9;
                i++;
            } else if (c == 'X' && i + 1 < chars.length && chars[i + 1] == 'L') {
                num += 40;
                i++;
            } else if (c == 'X' && i + 1 < chars.length && chars[i + 1] == 'C') {
                num += 90;
                i++;
            } else if (c == 'C' && i + 1 < chars.length && chars[i + 1] == 'D') {
                num += 400;
                i++;
            } else if (c == 'C' && i + 1 < chars.length && chars[i + 1] == 'M') {
                num += 900;
                i++;
            } else if (c == 'I') {
                num += 1;
            } else if (c == 'V') {
                num += 5;
            } else if (c == 'X') {
                num += 10;
            } else if (c == 'L') {
                num += 50;
            } else if (c == 'C') {
                num += 100;
            } else if (c == 'D') {
                num += 500;
            } else if (c == 'M') {
                num += 1000;
            }

        }
        return num;

    }
}

