class Solution {
    public String XXX(int n) {
        String ans = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder temp = new StringBuilder();
            int count = 1;
            for (int j = 0; j < ans.length(); j++) {
                if (j + 1 >= ans.length() || ans.charAt(j) != ans.charAt(j + 1)) {
                    temp.append(count);
                    temp.append(ans.charAt(j));
                    count = 0;
                }
                count++;
            }
            ans = temp.toString();
        }
        return ans;
    }
}

