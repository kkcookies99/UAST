 class Solution {
    public int XXX(String s) {
         int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'M') {
                ans += 1000;
            } else if (s.charAt(i) == 'D') {
                ans += 500;
            } else if (s.charAt(i) == 'C') {
                ans += 100;
            } else if (s.charAt(i) == 'L') {
                ans += 50;
            } else if (s.charAt(i) == 'X') {
                ans += 10;
            } else if (s.charAt(i) == 'V') {
                ans += 5;
            } else {
                ans++;
            }
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'I' & (s.charAt(i + 1) == 'V' | s.charAt(i + 1) == 'X')) {
                ans -= 2;
            } else if (s.charAt(i) == 'X' & (s.charAt(i + 1) == 'L' | s.charAt(i + 1) == 'C')) {
                ans -= 20;
            } else if (s.charAt(i) == 'C' & (s.charAt(i + 1) == 'D' | s.charAt(i + 1) == 'M')) {
                ans -= 200;
            }
        }
        return ans;
    }
}

