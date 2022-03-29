class Solution {
    public String XXX(int n) {
        StringBuilder ans = new StringBuilder("1");
        for (int i=1; i<n; ++i){
            StringBuilder tmp = new StringBuilder();
            char ch = ans.charAt(0);
            int count = 1;
            for (int j=1; j<ans.length(); ++j){
                if (ans.charAt(j) == ch) ++count;
                else {
                    tmp.append(""+count+ch);
                    ch = ans.charAt(j);
                    count = 1;
                }
            }
            tmp.append(""+count+ch);
            ans = tmp;
        }
        return ans.toString();
    }
}

