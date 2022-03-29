 class Solution {
    public String XXX(String a, String b) {
        StringBuilder c = new StringBuilder();
        int k = 0, i = 0 ,max = a.length()>b.length()?a.length():b.length();
        while(i < max){
            if( a.length() - i -1  >= 0)
            k = k + (a.charAt( a.length()-i-1) - '0');
            if( b.length() - i -1  >= 0)
            k = k + (b.charAt(b.length()-i-1) - '0');
             c.append(k % 2 +"");
            k = k / 2;
            i++;
        }
        if(k > 0) c.append("1");
        return c.reverse().toString();
    }
}

