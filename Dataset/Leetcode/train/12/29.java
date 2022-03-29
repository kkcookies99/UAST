 class Solution {
    public String XXX(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] str = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int i=0;
        StringBuilder s = new StringBuilder();
        while(num!=0){
            if(num>=values[i]){
                s.append(str[i]);
                num -= values[i];
            }else{
                i+=1;
            }
        }
        return s.toString();
    }
}

