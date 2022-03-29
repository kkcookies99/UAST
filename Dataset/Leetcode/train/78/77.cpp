class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        iteration(nums, vector<int>(), 0);
        return mRet;
    }
    
    void iteration (vector<int>& nums, vector<int> tmp, int index) {
        mRet.push_back(tmp);
        for (int i = index; i < nums.size(); i++) {
            tmp.push_back(nums[i]);
            iteration(nums, tmp, i+1);
            tmp.pop_back();
        }
    }
    
private:
    vector<vector<int>> mRet;
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


