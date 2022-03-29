class Solution {
private:
    void _XXX(vector<int>& nums,vector<int>& count,vector<vector<int>>& re,vector<int>& current){
        if(current.size() == nums.size()){
            re.push_back(current);
            return;
        }
        for(int i = 0; i < nums.size(); i++){
            if(count[i] == 0){
                current.push_back(nums[i]);
                count[i] = 1;
                _XXX(nums,count,re,current);
                current.pop_back();
                count[i] = 0;
            }
        }
        return;
    }
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<int> count(nums.size());
        vector<vector<int>> re;
        vector<int> current;
        _XXX(nums,count,re,current);
        return re;
    }
};

