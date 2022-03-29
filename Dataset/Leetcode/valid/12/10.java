 class Solution {
    public String XXX(int num) {
        int[] nums = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int cur = 0;
        String res = "";
        while(num != 0){
            while(num >= nums[cur]){
                res += strs[cur];
                num -= nums[cur];
            }
            cur += 1;
        }
        return res;
    }
}

