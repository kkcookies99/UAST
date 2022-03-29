class Solution {
    public int XXX(String s) {
        return XXXMy(s);
    }
    public int XXXMy(String s) {
        if(s.length()==0) return 0;
        int n = s.length();
        int i = 0;
        while(i < n &&  s.charAt(i)=='0') i++;
        if(i==n) return 0;
        if(i-1 >=0 && s.charAt(i-1) == '0'&& s.charAt(i)==' ') return 0;
        while(i<n && s.charAt(i)==' ') i++;
        if(i==n) return 0;
        int flag = 1;
        if(i-1>=0 && s.charAt(i-1)=='0' && s.charAt(i)=='-') return 0;
        if(s.charAt(i)=='-') {flag = 0; i++;}
        else if(s.charAt(i)=='+') {flag = 1; i++;}
        else if(s.charAt(i) != '-' && (s.charAt(i) - '0' < 0 || s.charAt(i) - '9' >0))  return 0;
        while(i<n && s.charAt(i)=='0') i++;
        int start = i,end = i;
        while(end < n && s.charAt(end) - '0' >= 0 && s.charAt(end) - '9' <= 0) end++;
        if(start==end) return 0;
        if(flag==0 && end - start >11)  return -2147483648;
        if(flag==1 && end - start >11)  return 2147483647;
        String bak = new String();
        if(end <= n) bak = s.substring(start,end);
        long newbak;
        if(flag==0) newbak = -Long.valueOf(bak);
        else newbak = Long.valueOf(bak);
        return (flag==0) ? (int)Math.max(newbak,-2147483648):(int)Math.min(newbak,2147483647);
    }
}

