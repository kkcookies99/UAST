class Solution {
    public String XXX(String a, String b) {
        char[] chars = new char[Math.max(a.length(),b.length())+1];
        int c = 0;
        for (int i = a.length()-1 ,j = b.length()-1 , k = chars.length-1 ;
             i >= 0 || j>=0 ; i-- ,j-- ,k--) {
            int va = i<0 ? 0 : a.charAt(i) - '0';
            int vb = j<0 ? 0 : b.charAt(j) - '0';
            int sum = c + va + vb;
            switch (sum){
                case 0:
                    c = 0;
                    chars[k] = '0';
                    break;
                case 1:
                    c = 0;
                    chars[k] = '1';
                    break;
                case 2:
                    c = 1;
                    chars[k] = '0';
                    break;
                case 3:
                    c = 1;
                    chars[k] = '1';
                    break;
            }
        }
        if (c == 1){
            chars[0] = '1';
            return new String(chars);
        }
        return new String(chars,1,chars.length-1);
    
    }
}

