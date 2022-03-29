 class Solution {
    public String XXX(int num) {
        int val[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String ans = new String("");
        int i = 0;
        while(num > 0) {
            if(num >= val[i]) {
                ans += roman[i];
                num -= val[i];
            } else {
                i++;
            }
        }
        return ans;
    }
}

