 class Solution {
    public int XXX(String haystack, String needle) {
            int t = needle.length();     // t 字符串为长度
            int t1=haystack.length();
            int  g=-1;
            int pay=0;

            for(int i=0; i+t-1 <t1;i++){
                String str = haystack.substring(i,i+t);
                if( str.equals(needle)&&pay!=1){
                    g=i;    
                    pay=1;
                }
            }

            if( t<=0 ){
                g=0;
            }

            return g;
    }
}

