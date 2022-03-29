 class Solution {
    public String XXX(String a, String b) {
        boolean hugo = false;
        String res = "";

        int atone = Math.abs(a.length() - b.length());

        if (a.length() > b.length()) {
            for (int i = 0; i < atone; i++) b = 0 + b;
        }
        else {
            for (int j = 0; j < atone; j++) a = 0 + a;
        }

        for (int k = a.length() - 1; k >= 0; k--) {
            if (a.charAt(k) == '0' && b.charAt(k) == '0') {
                if (hugo == true) {
                    res = 1 + res;
                    hugo = false;
                }
                else {
                    res = 0 + res;
                    hugo = false;
                }
            }
            else if ((a.charAt(k) == '1' && b.charAt(k) == '0') || (a.charAt(k) == '0' && b.charAt(k) == '1')) {
                if (hugo == true) {
                    res = 0 + res;
                    hugo = true;
                }
                else {
                    res = 1 + res;
                    hugo = false;
                }
            }
            else {
                if (hugo == true) {
                    res = 1 + res;
                    hugo = true;
                }
                else {
                    res = 0 + res;
                    hugo = true;
                }
            }
        }
        if (hugo == true) return 1 + res;
        return res;

    }
}```

