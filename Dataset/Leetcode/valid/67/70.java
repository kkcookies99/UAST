 class Solution {
    public String XXX(String a, String b) {
        int m = a.length() - 1;
        int n = b.length() - 1;
        int add = 0;//进位,满2进1
        StringBuilder sb = new StringBuilder();
        while(m >= 0 || n >= 0 || add != 0){
            int x = m >= 0 ? a.charAt(m) - '0':0;
            int y = n >= 0 ? b.charAt(n) - '0':0;
            int product = x + y + add;
            sb.append(product % 2);
            add = product / 2;
            m--;
            n--;
        }
        return sb.reverse().toString();
    }
}

