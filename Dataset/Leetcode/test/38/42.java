class Solution {
    public String XXX(int n) {
        if(n == 1) return "1";
        String temp = XXX(n-1);
        StringBuilder sb = new StringBuilder();
        char c = '0';
        int count = 0;
        for(int x = 0 ; x < temp.length() ; x ++){
            if(x == 0){
                c = temp.charAt(x);
                count = 1;
            }else{
                if(temp.charAt(x) == c){
                    count++;
                }else{
                    sb.append(count);
                    sb.append(c);
                    c = temp.charAt(x);
                    count = 1;
                }
            }
        }
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }
}

