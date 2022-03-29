 class Solution {
    public String XXX(String a, String b) {
        String big=(a.length()>b.length())?a:b;
        String sml=(a.length()>b.length())?b:a;
        int len_big=big.length();
        int len_sml=sml.length();
        char[] result=new char[len_big+1];
        int i=len_big-1,j=len_sml-1;
        int next=0;
        while(i>=0){
            int sml_bit=j<0?0:(int)sml.charAt(j)-'0';
            int big_bit=(int)big.charAt(i)-'0';
            int val=(next+big_bit+sml_bit)%2;
            next=(next+big_bit+sml_bit)/2;
            result[i+1]=(char)(val+48);
            i--;
            j--;
        }
        if(next==1){
            result[0]=(char)(next+48);
        }
        String result_s=String.copyValueOf(result);
        if(next==0){
            return result_s.substring(1,len_big+1);
        }
        return result_s;
        
    }
}

