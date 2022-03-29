 class Solution {
public:
    vector<string> XXX(int n) {
        deque<pair<string,int>> mdeq;
        mdeq.emplace_back("(", 1);
        for(int i = 0; i < 2*n-2; ++i){
            int size = mdeq.size();
            pair<string, int> tem;
            while(size--){
                tem = mdeq.front();
                mdeq.pop_front();
                if(tem.second <= 2*n-1-i && tem.second > 0){
                    mdeq.emplace_back(tem.first+')', tem.second-1);
                }
                if(tem.second >= 0 && tem.second < 2*n-1-i){
                    mdeq.emplace_back(tem.first+'(', tem.second+1);
                }
            }
        }
        vector<string> res;
        for(auto p : mdeq){
            res.emplace_back(p.first + ')');
        }
        return res;
    }
};

