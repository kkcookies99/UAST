class Solution {
    public String XXX(int n) {
        String[] str=new String[n+1];
        str[1]="1";
        for(int i=2;i<=n;i++){
            str[i]=process(str[i-1]);
        }
        return str[n];

    }
    public String process(String s){
        int len=s.length();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<len;){
            int r=i+1;
            while(r<len&&s.charAt(r)==s.charAt(i))r++;
            res.append(String.valueOf(r-i)).append(s.charAt(i));
            i=r;
        }
        return res.toString();
    }
}

