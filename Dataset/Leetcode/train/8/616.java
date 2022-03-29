 class Solution {
    public int XXX(String s) {
        char[] array = s.trim().toCharArray();
        if (array.length == 0) return 0;
        int sign = 1, i = 1, res = 0, board = Integer.MAX_VALUE / 10;
        if (array[0] == '-') sign = -1;
        else if (array[0] != '+') i = 0;
        for (int t = i; t < array.length; t++) {
            if (array[t] < '0' || array[t] > '9') break;
            if (res > board || (res == board && array[t] > '7')) return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + (array[t] - '0');
        }
        return res * sign;
    }
}

