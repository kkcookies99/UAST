 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target){
        map <int, int> mp;
        vector <int> res(2);
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            int another = target - nums[i];
            if (mp.count(another)) {
                res[0] = mp[another];
                res[1] = i;
                break;
            }
            mp[nums[i]] = i;
        }
        return res;
    }
};

