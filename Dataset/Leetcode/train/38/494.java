 class Solution {
    public String XXX(int n) {
        if(n == 1){
            return "1";
        }
        String s = "1";
        String ans = "";
        for(int i = 2;i <= n;i++){
            int start = 0;
            for(int j = 1;j <s.length();j++){
                if(s.charAt(start) == s.charAt(j)){
                }else{
                    int a2 = j - start;
                    ans += a2;
                    ans += s.charAt(start);
                    start = j;
                }
            }
            int a1 = s.length() - start ;
            ans = ans + a1 + s.charAt(start);
            s = ans;
            ans = "";
        }
        return s;
    }
}

