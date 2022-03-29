 class Solution {
    public int XXX(String str) {
        char[] c=str.toCharArray();
        if(str.length()==0) return 0;
        if(c.length==1&&c[0]=='-') return 0;
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(char c1:c){
            if(c1==' ') count++;
            else   break;
        }
        for(int i=count;i<str.length();i++){
            sb.append(c[i]);
        }
        if(sb.length()==0) return 0;
        StringBuilder sb1=new StringBuilder();
        if(sb.charAt(0)-'0'>9&&sb.charAt(0)!='-') return 0;
        int i=sb.charAt(0)=='-'?1:0;
        int count1=i;
        if(sb.charAt(0)=='+') i=1;
        char[] c1=sb.toString().toCharArray();
        for(int j=i;j<sb.length();j++){
            if(!Character.isDigit(sb.charAt(j))) {break;}
            sb1.append(c1[j]);
        }
        if(sb1.length()==0) return 0;
        long num=sb1.charAt(0)-'0';
        for(int k=1;k<sb1.length();k++){
            num=num*10+(sb1.charAt(k)-'0');
             if(num>Integer.MAX_VALUE) {
                  return count1==0?Integer.MAX_VALUE:Integer.MIN_VALUE;
             }
        }
        if(sb.charAt(0)=='+') return (int)num;
        num=count1==1?-num:num;
        return (int)num;
    }
}

