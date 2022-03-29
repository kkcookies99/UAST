 class Solution {
public:
    vector<vector<int>> res;
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        sort(intervals.begin(),intervals.end(),[&](const vector<int>& a,const vector<int>& b){
            if(a[0]==b[0]){
                return a[1]<b[1];
            }
            return a[0]<b[0];
        });
        for(int i=0;i<intervals.size();++i){
            vector<int> cur = intervals[i];
            int maxx = intervals[i][1];
            while(i+1<intervals.size()&&maxx>=intervals[i+1][0]){
                maxx = max(maxx,max(intervals[i][1],intervals[i+1][1]));
                i++;
            }
            if(maxx!=INT_MIN&&i+1>=intervals.size()){
                vector<int> merg = {cur[0],maxx};
                res.push_back(merg);
                break;
            }else if(maxx!=cur[0]){
                vector<int> merg = {cur[0],maxx};
                res.push_back(merg);
            }else{
                res.push_back(intervals[i]);
            } 
        }
        return res;
    }
};

