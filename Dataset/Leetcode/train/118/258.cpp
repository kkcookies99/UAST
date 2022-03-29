 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> res;
        res.push_back({1});
        if(numRows==1)
            return res;
        while(numRows>res.back().size()){
            vector<int> temp;
            temp.push_back(1);
            for(int i=1;i<res.back().size();i++){
                if(i-1>=0)
                    temp.push_back(res.back()[i]+res.back()[i-1]);
            }
            temp.push_back(1);
            res.push_back(temp);
        }
        return res;
    }
};

