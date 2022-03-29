 class Solution {
public:
    void generate(int left,int l,int n,vector<string>& res,string temp){
        if(temp.length()==n*2){
            res.push_back(temp);
            return;
        }
        if(left>0){
            temp+=")";
            generate(left-1,l,n,res,temp);
            temp.erase(temp.end()-1);
        }
        if(l<n){
            temp+="(";
            generate(left+1,l+1,n,res,temp);
        }
        return;
    }
    vector<string> XXX(int n) {
        vector<string> res;
        string temp="(";
        generate(1,1,n,res,temp);
        return res;
    }
};

