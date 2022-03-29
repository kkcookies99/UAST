 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        if(nums.size() < 3) return {};
        set<vector<int>> st;
        vector<int> vec;
        sort(nums.begin(),nums.end());
        int left = 0;
        int right = nums.size()-1;
        while(left < right){
            int i = left+1;
            int j = right;
            while(i < j){
                if(nums[left]+nums[i]+nums[j]== 0){
                    vec.push_back(nums[left]);
                    vec.push_back(nums[i]);
                    vec.push_back(nums[j]);
                    st.insert(vec);
                    vec.clear();
                    i++;
                    j--;
                }
                else if(nums[left]+nums[i]+nums[j] < 0){
                    i++;
                }
                else{
                    j--;
                }
            }
            left++;
        }
        return vector<vector<int>>(st.begin(),st.end());
    }
};

