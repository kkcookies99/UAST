 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> return_vector;
        vector<int> tem_vector;
        int min_num, mid_num, max_num;
        int i, j;
        int l;
        l = size(nums);
        sort(nums.begin(),nums.end());
        for(i = 0; i < l-2; i++){
            if(i > 0){
                if(nums[i]==nums[i-1]){
                    continue;
                }
            }
            if(nums[i]+nums[i+1]+nums[i+2] > 0){
                break;
            }
            if(nums[i]+nums[l-2]+nums[l-1] < 0){
                continue;
            }
            mid_num = l-1;
            for(j = i+1; j < l-1; j++){
                if(j > i+1){
                    if(nums[j]==nums[j-1]){
                        continue;
                    }
                }
                if(nums[i]+nums[j]+nums[j+1] >= 0){
                    if(nums[i]+nums[j]+nums[j+1] == 0){
                        return_vector.push_back({nums[i],nums[j],nums[j+1]});
                    }
                    break;
                }
                if(nums[i]+nums[j]+nums[l-1] <= 0){
                    if(nums[i]+nums[j]+nums[l-1] == 0){
                        return_vector.push_back({nums[i],nums[j],nums[l-1]});
                    }
                    continue;
                }
                min_num = j+1;
                max_num = mid_num+1;
                while(max_num-1>min_num){
                    mid_num = min_num+(max_num-min_num)/2;
                    if(nums[i]+nums[j]+nums[mid_num] == 0){
                        return_vector.push_back({nums[i],nums[j],nums[mid_num]});
                        break;
                    }
                    else if(nums[i]+nums[j]+nums[mid_num] > 0){
                        max_num = mid_num;
                    }
                    else{
                        min_num = mid_num;
                    }
                }
            }
        }
        return return_vector;
    }
};

