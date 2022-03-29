class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        sort(intervals.begin(),intervals.end());
        vector<vector<int>> res;
        res.push_back(intervals[0]);
        for(int i=1;i<intervals.size();i++){
            two_XXX(res,intervals[i]);
        }
        return res;
    }

    void two_XXX(vector<vector<int>>& res,const vector<int>& right){
        vector<int> &temp = res.back();
        if(temp[1]<right[0])
            res.push_back(right);
        else
            temp[1] = temp[1] <= right[1] ? right[1] :temp[1];
    }
};

