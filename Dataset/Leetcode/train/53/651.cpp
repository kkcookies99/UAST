 class Solution {
public:
    //好像做过，动态规划法。好像还有中心扩散法(奇扩散，偶扩散)。
    //我连o(n)都写不出来，还让我写o(logn)
    //分治是可以的。
    //我好想只能写出暴力算法。
    int XXX(vector<int>& nums) {
        int start, end, sum;
        int max = 2147483648;
        
        for(int i = 0; i < nums.size(); i++){
            sum = 0;
            for(int j = i; j < nums.size(); j++){
                sum = sum + nums[j];
                if(sum > max){
                    max   = sum;
                    start = i;
                    end   = j;
                }
            }
        }
        //nums.assign(nums.begin() + start,nums.end() + end);
        return max;
    }
};

