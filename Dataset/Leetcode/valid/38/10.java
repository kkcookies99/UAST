class Solution {
    public String XXX(int n) {
        String ans = "1";
        for (int i = 2; i <= n; i++) {
            String temp = "";
            int count = 1;
            char c = ans.charAt(0);
            for (int j = 1; j < ans.length(); j++){
                if (ans.charAt(j) == c) {
                    count++;
                }
                else {
                    temp += String.valueOf(count);
                    temp += String.valueOf(c);
                    c = ans.charAt(j);
                    count = 1;
                }
            }
            temp += String.valueOf(count);
            temp += String.valueOf(c);
            ans = temp;
        }
        return ans;
    }
}

