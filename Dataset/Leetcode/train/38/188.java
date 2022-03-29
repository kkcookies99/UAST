class Solution {
    public String XXX(int n) {
        String cur = "1";
        for(int i = 0; i < n - 1; i++){
            cur = process(cur);
        }
        return cur;
    }

    private String process(String s){
        StringBuilder res = new StringBuilder();
        char cur = s.charAt(0);
        int count = 1;
        int len = s.length();
        for(int i = 1; i < len; i++){
            if(s.charAt(i) == cur){
                count++;
            }else{
                res.append(count);
                res.append(cur);
                count = 1;
                cur = s.charAt(i);
            }
        }
        res.append(count);
        res.append(cur);
        return res.toString();
    }
}

