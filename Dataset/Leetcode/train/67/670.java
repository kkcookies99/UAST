class Solution {
    public String XXX(String a, String b) {
        if (a.length() > b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        StringBuilder res = new StringBuilder();
        int i = 0, car = 0;
        for (; i < b.length(); i++) {
            Integer valuea = 0;
            if (a.length() - i - 1 >= 0) {
                valuea = (a.charAt(a.length() - i - 1) - '0');
            }
            Integer valueb = (b.charAt(b.length() - i - 1) - '0');
            car = car + valuea + valueb;
            res.append(Integer.valueOf(car % 2));
            car = car / 2;
        }
        if (car > 0) {
            res.append("1");
        }
        res.reverse();
        return res.toString();
    }
}

