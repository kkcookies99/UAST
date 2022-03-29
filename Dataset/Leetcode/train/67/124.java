 class Solution {
    public String XXX(String a, String b) {
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        StringBuffer s = new StringBuffer();
        int a1len = a1.length;
        int b1len = b1.length;
        int count = 0;
        for (int i = a1len - 1, j = b1len - 1; i >= 0 || j >= 0; i--, j--) {
            int a1temp = 0;
            int b1temp = 0;
            if (i >= 0)
                a1temp = a1[i] - '0';
            if (j >= 0)
                b1temp = b1[j] - '0';
            int temp = (a1temp + b1temp + count) % 2;
            s.insert(0, temp);
            count = (a1temp + b1temp + count) / 2;
        }
        if (count > 0)
            s.insert(0, count);
        return s.toString();        
    }
}

