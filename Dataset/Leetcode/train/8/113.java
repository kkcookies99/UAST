import java.math.BigInteger;
class Solution {
    public int XXX(String str) {
        String res = "";
        str = str.trim();
        if(str == null || str.length() == 0) return 0;
        char c = str.charAt(0);
        int i = 1;
        
        
        if((c != '-') && (c != '+') && (c < '0' || c > '9')) return 0;        
        res = res + c;        
        while(i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <='9'){
            res = res + str.charAt(i);
            i++;
        }        
        if(res.equals("-") || res.equals("+")) return 0;
        
        BigInteger b = new BigInteger(res);
        if(c == '-'){
            if( b.compareTo(new BigInteger("-2147483648")) == -1) return Integer.MIN_VALUE;
        }else{
            if(b.compareTo(new BigInteger("2147483647")) == 1) return Integer.MAX_VALUE;
        }
        
        return Integer.valueOf(res);
    }
}

