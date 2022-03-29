 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        int size = nums.size();
        vector<vector<int>> result;//存储结果
        if(size<3) return result;//特判

        std::sort(nums.begin(),nums.end());//排序
        for(int i = 0;i < size-2;i++){
            if(nums[i] > 0) return result;//如果第一个数大于0，三数之和不可能小于0，直接返回。
            if(i>0 && nums[i] == nums[i-1]) continue;//第一个数去重；
            
            int left = i+1;//左指针，指向第二个数
            int right = size-1;//右指针，指向第三个数
            while(left<right){
                if(nums[left]+nums[right] > -nums[i]){//后两数之和太大，右指针左移
                    right--;
                }else if(nums[left]+nums[right] < -nums[i]){//后两数之和太小，左指针右移
                    left++;
                }else{
                    result.push_back({nums[i],nums[left],nums[right]});
                    left++;
                    right--;
                }

                while(left < right && nums[left] == nums[left-1])left++;//第二个数去重
                while(left < right && nums[right] == nums[right+1])right--;//第三个数去重
            }
        }

        return result;
    }
};

