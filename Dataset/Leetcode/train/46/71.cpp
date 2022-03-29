class Solution {
public:
    vector<vector<int>> finalResult;

    vector<vector<int>> XXX(vector<int>& nums) {
        subResult(nums, nums.size()-1);
        return finalResult;
    }

    void subResult(vector<int>& nums, int posi){
        if(posi==0){
            finalResult.push_back({nums[0]});
            return;
        }

        subResult(nums, posi-1);

        int originalSize = finalResult.size();

        for(int i=0;i<originalSize;i++){
            for(int j=0;j<=finalResult[i].size();j++){
                vector<int> temp = finalResult[i];
                temp.insert(temp.begin()+j, nums[posi]);
                finalResult.push_back(temp);
            }
        }

        finalResult.erase(finalResult.begin(), finalResult.begin()+originalSize);
    }
};

