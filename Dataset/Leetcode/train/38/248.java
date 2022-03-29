class Solution {
    public String XXX(int n) {
        String pre = "1";
        String res = pre;
        for (int i = 2; i <= n; i++) {
            int count = 1;
            char preChar = pre.charAt(0);
            StringBuilder temp = new StringBuilder();
            for (int j = 1; j < pre.length(); j++) {
                char curChar = pre.charAt(j);
                if (preChar == curChar) {
                    count++;
                } else {    
                    temp.append(count);
                    temp.append(preChar);
                    count = 1;
                }
                preChar = curChar;
            }
            temp.append(count);
            temp.append(preChar);
            res = temp.toString();
            pre = res;
        }
        return res;
    }
}

