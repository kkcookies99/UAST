 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        if(nums.size() < 3)
            return {};

        sort(nums.begin(), nums.end());
        vector<vector<int>> res;
        int first = 0;
        for(first = 0 ; first < nums.size()-2; ++first){
            if(nums[first] > 0) break;
            if(first > 0 && nums[first] == nums[first-1])
                continue;

            int sumOf2 = -nums[first];

            int second = first+1;
            int third = nums.size()-1;
            while(second < third){
                int sum = nums[second] + nums[third];
                if(sum == sumOf2){
                    res.emplace_back(vector<int>{nums[first], nums[second], nums[third]});
                 ++second;
                --third;

                while(second < third && nums[second] == nums[second-1])
                    ++second;
                while(second < third && nums[third] == nums[third+1])
                    --third; 


                }
                else if(sum < sumOf2)
                    ++second;
                else
                    --third;
            }
        }
        return res;
    }
};

