 class Solution {
public:
    vector<string> ret;
    void search(int k,string str,int n){
        if(k == 0 && n == 0){
            ret.push_back(str);
            return;
        }
        if(n>0)search(k+1,str+"(",n-1);
        if(k>0)search(k-1,str+")",n);
    }

    vector<string> XXX(int n) {
        if(n<1) return {};
        int k = 0;
        search(k,"",n);
        return ret;
    }
};

