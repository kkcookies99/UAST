class Solution {
    public String XXX(String a, String b) {
        String res="";
        int len_a=a.length(),len_b=b.length();
        //补零
        for(int i=0;i<len_b-len_a;i++) a="0"+a;
        for(int i=0;i<len_a-len_b;i++) b="0"+b;
        for(int i=0;i<Math.max(len_a,len_b);i++){
            if(a.charAt(i)=='1'&&b.charAt(i)=='1'){
                res+="2";
            }else if(a.charAt(i)=='0'&&b.charAt(i)=='0'){
                res+="0";
            }else{
                res+="1";
            }
        }
        char[] chars = res.toCharArray();
        for(int i=chars.length-1;i>0;i--){
            if(chars[i]=='2'){
                chars[i]='0';
                chars[i-1]=(char)(chars[i-1]-'0'+'1');
            }
            if(chars[i]=='3'){
                chars[i]='1';
                chars[i-1]=(char)(chars[i-1]-'0'+'1');
            }
        }
        res="";
        for (int i = 1; i < chars.length; i++) {
            res+=chars[i];
        }
        if(chars[0]=='2'){
            res="10"+res;
        }else if(chars[0]=='3'){
            res="11"+res;
        }else{
            res=chars[0]+res;
        }
  
        return res;
    }
}

