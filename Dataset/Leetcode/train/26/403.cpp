 class Solution {
public:
    int XXX(vector<int>& nums) {
        set <int>st(nums.begin(),nums.end());
        nums.erase(nums.begin(),nums.end());
        for(int x:st){
            nums.push_back(x);
        }
        return st.size();

    }
};

