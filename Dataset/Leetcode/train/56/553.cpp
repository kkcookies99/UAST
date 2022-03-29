 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        if(intervals.empty()) return intervals;
        int len = intervals.size();
        sort(intervals.begin(), intervals.end());
        vector<vector<int>> ans;
        for(int i=0 ;i<len; i++){
            if(ans.empty()||intervals[i][0]>ans.back()[1]){
                ans.push_back(intervals[i]);
            }else{
                if(intervals[i][1]>ans.back()[1]) 
                    ans.back()[1] = intervals[i][1];
            }
        }

        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


