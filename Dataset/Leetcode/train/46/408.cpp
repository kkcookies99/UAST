 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        std::vector<std::vector<int>> vecRes;
        std::sort(nums.begin(), nums.end());
        vecRes.push_back(nums);
        while(next_perm(nums)) {
            vecRes.push_back(nums);
        }
        return vecRes;
    }

    bool next_perm(vector<int>& nums) {
        int len = nums.size();

        // step-1
        bool bFind = false;
        int pos1 = len-1;
        for(int i = len-2; i >= 0; i--) {
            if(nums[i] < nums[i+1]) {
                bFind = true;
                pos1 = i;
                break;
            }
        }
        if(!bFind) {
            return false;
        }

        // step-2
        int pos2 = len-1;
        for(int i = len-1; i > pos1; i--) {
            if(nums[i] > nums[pos1]) {
                pos2 = i;
                break;
            }
        }

        // step-3
        std::swap(nums[pos1], nums[pos2]);

        // step-4
        int i = pos1+1, j = len-1;
        while(i < j) {
            std::swap(nums[i], nums[j]);
            ++i;
            --j;
        }

        return true;
    }
};


