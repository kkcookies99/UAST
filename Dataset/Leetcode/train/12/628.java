 class Solution {
    public String XXX(int num) {
        int values[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String reps[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        String ans = "";
        for (int i = 0 ; i < 13 ; ++ i){
            while (num >= values[i]){
                ans += reps[i];
                num -= values[i];
            }
        }
        return ans;
    }
}

