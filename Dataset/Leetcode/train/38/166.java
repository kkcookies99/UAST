class Solution {
    public String XXX(int n) {
        if(n == 1) return "1";
        String res = "1";
        for(int i = 2;i<=n;i++){
            res = test(res);
        }
        return res;
    }

    public String test(String n){
        StringBuilder sb = new StringBuilder();
        int k = 1;
        int pre = n.charAt(0) - '0';
        for(int i = 1;i<n.length();i++){
            int temp = n.charAt(i) - '0';
            if(temp == pre){
                k++;
            }else{
                sb.append(k).append(pre);
                pre = temp;
                k = 1;
            }
        }
        sb.append(k).append(pre);
        return sb.toString();
    }
}

