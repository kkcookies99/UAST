class Solution {
    public String XXX(String a, String b) {
       StringBuffer stringBuffer =new StringBuffer();
        int Quotient = 0;
        int aindex = a.length()-1;
        int bindex = b.length()-1;
        while (aindex>=0 || bindex>=0 || Quotient>0){
           int  result =+Quotient ;
           if (aindex>=0){
                 result +=Integer.valueOf(a.charAt(aindex--)+"");
           }
           if (bindex>=0){
               result +=
                       Integer.valueOf(b.charAt(bindex--)+"");
           }
           stringBuffer.append(result%2);
           Quotient = result/2;
        }
        return  stringBuffer.reverse().toString();   
    }
}

