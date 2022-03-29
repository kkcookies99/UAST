 class Solution {
public:
    vector<string>res;
    string temp;
    void dfs(int n,int left,int right){
        if(left==right&&left+right==n*2){
            res.push_back(temp);
            return;
        }
        if(left<n){
            temp.push_back('(');
            dfs(n,left+1,right);
            temp.pop_back();
        }
        if(right<n&&right<left){
            temp.push_back(')');
            dfs(n,left,right+1);
            temp.pop_back();
        }
    }
    vector<string> XXX(int n) {
        dfs(n,0,0);
        return res;
    }
};

