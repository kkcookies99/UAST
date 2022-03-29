class Solution {
    public String XXX(int n) {
        String res = "1";

        if(n == 1){
            return res;
        }

        while(n > 1){
            int cur = 0;
            String tmp = "";
            while(cur < res.length()){
                int count = 1;
                while(cur != res.length() -1 && res.charAt(cur) == res.charAt(cur + 1)){
                    cur++;
                    count++;
                }
                tmp = tmp+count;
                tmp = tmp+res.charAt(cur);
                cur++;
            }
            res = tmp;
            n--;
        }

        return res;
    }
}

