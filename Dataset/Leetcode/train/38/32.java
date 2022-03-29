class Solution {
    public String XXX(int n) {
        String s = "1";
        for(int i=2;i<=n;i++){
            s = toConver(s);
        }
        return s;
    }

    String toConver(String s){
        int len = s.length();
        int n=0;
        StringBuilder sb = new StringBuilder();
        char c = s.charAt(0);
        int i=0;
        while(i<len){
            if(c == s.charAt(i)){
                n++;
                i++;
            }else{
                sb.append(n).append(c);
                n=1;
                c=s.charAt(i);
                i++;
            }
        }
        sb.append(n).append(c);
        return sb.toString();
    }
}

