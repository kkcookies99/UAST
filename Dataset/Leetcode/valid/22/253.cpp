 class Solution {
public:
    vector<string> XXX(int n) {
        vector<string> res;
        if(n == 1) {
            res.push_back("()");
            return res;
        } 
        vector<string> ss = XXX(n-1);
        for(int i=0;i<ss.size();i++){
            res.push_back("()"+ss[i]);
            res.push_back("("+ss[i]+")");
            if(ss[i]+"()"!="()"+ss[i])
                res.push_back(ss[i]+"()");
               
        }
        
        return res;
    }
};

