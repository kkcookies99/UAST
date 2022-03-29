 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> res;
        res.emplace_back(1,1);
        while(res.size()<numRows){
            res.emplace_back(res.size()+1,1);
            //这句要放在上一句的下面，因为引用的本质是指针，push之后地址可能改变
            vector<int>& v=res[res.size()-2];
            int n=res.back().size()-1;
            for(int i=1;i<n;i++){
                res.back()[i]=v[i-1]+v[i];
            }
        }
        return res;
    }
};

