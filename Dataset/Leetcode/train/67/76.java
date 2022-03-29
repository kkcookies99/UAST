 class Solution {
    public String XXX(String a, String b) {
        int max=Math.max(a.length(),b.length());
        StringBuilder builder = new StringBuilder();
        int carry=0;//表示进位
        int i,j;
        if(a.equals("0"))return b;
        if(b.equals("0"))return a;
        //保证i为最长的字符串
        if(max==a.length()){
            i=a.length()-1;j=b.length()-1;
        }else{
            i=b.length()-1;j=a.length()-1;
        }
        while(j>=0){
            builder.append((char)((a.charAt(i)-'0'+b.charAt(j)-'0'+carry)%2+'0'));
            carry=(a.charAt(i)-'0'+b.charAt(j)-'0'+carry)/2;
            j--;
            i--;
        }
        //j已遍历完，还有部分i待遍历
        while(i>=0){
            builder.append((char)((a.charAt(i)-'0'+carry)%2+'0'));
            carry=(a.charAt(i)-'0'+carry)/2;
            i--;
        }
        if(carry!=0)  builder.append((char)(carry+'0'));
        return builder.reverse().toString();
    
    }
}

