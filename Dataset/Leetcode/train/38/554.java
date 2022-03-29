 class Solution {
    public String XXX(int n) {
        String s = "1";
        while(n>1){
            s = pri(s);
            n--;
        }
        return s;
    }
    public String pri(String s){
        StringBuffer sb = new StringBuffer();
        char ch = s.charAt(0);
        int sum = 0;
        int i;
        for(i = 0;i < s.length();i++){
            if(ch == s.charAt(i)){
                sum++;
            }else{
                sb.append(sum);
                sb.append(ch);
                ch = s.charAt(i);
                sum = 1;
            }
        }
        sb.append(sum);
        sb.append(ch);
        return sb.toString();
    }
}

