 class Solution {
    public String XXX(int n) {
        String res = "1";
        for(int i = 1; i < n; i++){
            StringBuilder sb = new StringBuilder();
            char p[] = res.toCharArray();
            int j = p.length-1;
            while(j >= 0){
                int t = j;
                char k = p[j];
                while(j - 1 >= 0 && p[j - 1] == k) j--;
                sb.append(k);
                sb.append(t - j + 1);
                j--;
            }
            res = sb.reverse().toString();
        }
        return res;
    }
}

