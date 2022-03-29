class Solution {
    public String XXX(String a, String b) {
        int lena = a.length(),lenb=b.length();
        StringBuilder sum= new StringBuilder();  
        int len=Math.max(lena,lenb);       
        int mid=0;
        if (lena<len){
            for(int i=0;i<len-lena;i++){
                a = "0"+a;
            }
        }
        if (lenb<len){
            for(int i=0;i<len-lenb;i++){
                b = "0"+b;
            }
        }
       for(int i = len-1;i>=0;i--){
            int x = a.charAt(i)-'0';
            int y = b.charAt(i)-'0';
            if(x+y+mid==0){
                sum.append("0");
                mid=0;
            }else if(x+y+mid==1){
                sum.append("1");
                mid=0;
            }else if(x+y+mid==2){
                sum.append("0");
                mid = 1;
            }else if(x+y+mid==3){
                sum.append("1");
                mid = 1;
            }
        }
        if (mid ==1) {
            sum.append("1");
        }
        return sum.reverse().toString();
    }
}```

