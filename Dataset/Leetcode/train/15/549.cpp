 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<int> vec;
        vector<vector<int>> vtr;
        sort(nums.begin(),nums.end());
        set<vector<int>> st;
        if(nums.size() < 3)  return {};
        for(int i = 0; i < nums.size()-2; i++){
            int l = i+1;
            int r = nums.size()-1;
            while(l < r){
                if(nums[i]+nums[l]+nums[r]==0){
                    vec.push_back(nums[i]);
                    vec.push_back(nums[l]);
                    vec.push_back(nums[r]);
                    st.insert(vec);
                    vec.clear();
                    l++;
                    r--;
                }
                else if(nums[i]+nums[l]+nums[r] < 0){
                    l++;
                }
                else{
                    r--;
                }
            } 
        }
        for(auto iter = st.begin(); iter!=st.end(); iter++){
            vtr.push_back(*iter);
        }
        return vtr;
    }
};

