class Solution {
public:
    bool XXX(vector<int>& nums) {
        int n = nums.size();
        if(n==1){
            return true;
        }
        for(int i=n-2;i>=0;--i){
            if(nums[i]==0){
                int step = 0;
                while(i>=0){
                    if(nums[i]>step){
                        break;
                    }else{
                        ++step;
                        --i;
                    }
                }
                if(i<0){
                    return false;
                }
            }
        }
        return true;
    }
};

