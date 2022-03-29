class Solution {
    public String XXX(String a, String b) {
        while (a.length() > b.length()) b = "0" + b;
        while (b.length() > a.length()) a = "0" + a;
        int next = 0;
        String res = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            int ans = a.charAt(i) + b.charAt(i) - 2 * '0'+next;
            int temp = ans % 2;
            res = temp + res;
            next = ans / 2;
        }
        if (next==1){
            return "1"+res;
        }
        return res;
    }
}

