 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        int len=intervals.size();
    
        map<int,int> mp;
        for(int i=0;i<len;i++){
            mp[intervals[i][0]]=max(intervals[i][1], mp[intervals[i][0]]);
        }

        vector<vector<int>> res;
        vector<int> tp;

        for(auto it=mp.begin();it!=mp.end();it++){
            if(it==mp.begin()){
                tp.push_back(it->first);
                tp.push_back(it->second);
                res.push_back(tp);
            }else{
                if(it->first<=tp[1]){
                    if(it->second<=tp[1])continue;
                    tp[1]=it->second;
                    res.pop_back();
                    res.push_back(tp);
                  //  tp.clear();
                }else{
                    tp.clear();
                    tp.push_back(it->first);
                    tp.push_back(it->second);
                    res.push_back(tp);
                }
            }
            
           
        }
        return res;
    }
};

