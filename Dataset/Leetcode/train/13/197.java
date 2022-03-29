class Solution {
    public int XXX(String s) {
        int[] value =    new int[]{1000, 900, 500, 400,  100, 90,   50,  40,   10,  9,    5,   4,    1};
        String[] key = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV","I"};
        int ki = 0;
        int si = 0;
        int res = 0;
        while(si < s.length()){
            if(s.startsWith(key[ki], si)){
                res += value[ki];
                si += key[ki].length();
            }else{
                ki++;
            }
        }
        return res;
    }
}

