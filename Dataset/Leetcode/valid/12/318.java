 class Solution {
    public String XXX(int num) {
       int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (num/nums[i]!=0){
                int time = num/nums[i];
                num = num%nums[i];
                for (int j = 0; j < time; j++) {
                    sb.append(strs[i]);
                }
            }
        }
        return sb.toString();
    }
}

