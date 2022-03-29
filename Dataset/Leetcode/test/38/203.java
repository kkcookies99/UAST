class Solution {
    public String XXX(int n) {
        StringBuilder res = new StringBuilder("1");
        int count = 1;
        while(count < n) {
            int tCount = 1;
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i < res.length();i++) {
                if((i + 1) == res.length() || res.charAt(i) != res.charAt(i + 1)) {
                    sb.append(tCount).append(res.charAt(i));
                    tCount = 1;
                }else{
                    tCount++;
                }
            }
            count++;
            res = sb;
        }
        return res.toString();
    }
}

