 class Solution {
public:

    void generate(string str, int l, int r, vector<string>& result){
        if(l==0 && r==0){
            result.push_back(str);
            return;
        }

        if(l>0) generate(str+'(',l-1,r,result);
        if(r>0 && l<r) generate(str+")",l,r-1,result);
    }

    vector<string> XXX(int n) {
        vector<string> ans;
        generate("",n,n,ans);
        return ans;
    }
};

