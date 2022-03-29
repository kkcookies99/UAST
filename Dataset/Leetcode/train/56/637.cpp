 class Solution {
public:
    struct comp{
        bool operator()(std::vector<int>&v1,std::vector<int>& v2){
            return v1[0] < v2[0];
        }
    };
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        std::sort(intervals.begin(),intervals.end(),comp());
        std::vector<std::vector<int>> ret;
        std::vector<int> tmp = intervals[0]; 
        for(int i = 1; i < intervals.size(); ++i){
            if(intervals[i][0] <= tmp[1]){
                tmp[1] = std::max(tmp[1],intervals[i][1]);
            }else{
                ret.push_back(tmp);
                tmp = intervals[i];
            }
        }
        ret.push_back(tmp);
        return ret;
    }
};

