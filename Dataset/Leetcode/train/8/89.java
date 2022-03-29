class Solution {
    public int XXX(String str) {
        Automatic auto = new Automatic();
        for (char ch: str.toCharArray()) {
            auto.get(ch);
        }
        return (int)(auto.sign * auto.num);
    }
}

class Automatic {
    private int[][] table = new int[][] {
        {0, 1, 2, 3},
        {3, 3, 2, 3},
        {3, 3, 2, 3},
        {3, 3, 3, 3}
    };
    int sign = 1;
    long num = 0;
    int state = 0;

    public void get(char ch) {
        state = table[state][gets(ch)];
        if (state == 2) {
            num = num * 10 + (ch - '0');
            num = (sign == 1) ? Math.min(num, Integer.MAX_VALUE) :
                    Math.min(num, (long)Integer.MAX_VALUE + 1);
        }
        else if (state == 1 && ch == '-') sign = -1;
    }

    public int gets(char ch) {
        if (ch == ' ') return 0;
        else if (ch == '+' || ch == '-') return 1;
        else if (ch >= 48 && ch <= 57) return 2;
        else return 3;
    }
}

