 class Solution {
public:
    void XXX(vector<int>& nums) {
        int n=0,m=nums.size()-1;
        int t=0;
        while(t <= m){
            if(nums[t] == 0){
                nums[t] = nums[n];
                nums[n] = 0;
                n++;
            }else if(nums[t] == 2){
                nums[t] = nums[m];
                nums[m] = 2;
                m--;
                //跟二交换时必须退一格，因为跟二交换的数还没检验过
                t--;
            }
            t++;
        }
    }
};

