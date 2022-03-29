 class Solution {
    public String XXX(int n) {
        return XXX(n - 1, "1");
    }

    //1.     1
    //2.     11
    //3.     21
    //4.     1211
    //5.     111221
    public String XXX(int n, String s) {
        if (n == 0) return s;
        StringBuilder builder = new StringBuilder();
        int i = 0;
        while (i < s.length() - 1) {
            int count = 1;
            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            builder.append(count).append(s.charAt(i));
            i++;
        }
        if (s.length() == 1 || s.charAt(s.length() - 1) != s.charAt(s.length() - 2))
            builder.append(1).append(s.charAt(s.length() - 1));

        return XXX(n - 1, builder.toString());
    }
}

