 class Solution {
public:
    void backtrack(int left, int right, int n,string& temp, vector<string>& ans){
        if(left==n && right ==n){
            ans.emplace_back(temp);
            return;
        }
        if(left>n) return;
        
        temp += "(";
        backtrack(left+1,right,n,temp,ans);
        temp.pop_back();

        if(left>right){
            temp += ")";
            backtrack(left, right+1, n, temp, ans);
            temp.pop_back();
        }
    }
    vector<string> XXX(int n) {
        vector<string> ans;
        string temp="";
        backtrack(0, 0, n, temp, ans);
        return ans;
    }
};

