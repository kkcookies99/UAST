class Solution {
    public int XXX(String s) {
        int count=0;
        String s2=s.trim();
        if(s2.length()==0) return 0;
        StringBuffer sb=new StringBuffer();
        if(s2.charAt(0)!='-' && s2.charAt(0)!='+'  && !Character.isDigit(s2.charAt(0))) return 0;
        if(s2.charAt(0)=='-' || s2.charAt(0)=='+') count++;
        while(count<s2.length() && Character.isDigit(s2.charAt(count))){
            sb.append(s2.charAt(count));
            count++;
        }
        long sum=0;
        boolean flag=s2.charAt(0)=='-';
        for(int i=0;i<sb.length();i++){
            sum=sum*10+Integer.parseInt(Character.toString(sb.charAt(i)));
            if(!flag && sum>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(flag && sum>1L+Integer.MAX_VALUE) return Integer.MIN_VALUE;
        }
        return flag?-(int)sum : (int)sum;
    }
}