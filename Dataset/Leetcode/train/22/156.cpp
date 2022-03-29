 class Solution {
public:
    vector<string> res;
    string temp;
    void dfs(int n,int left ,int right){  //left right分别为左右括号个数
        if(right==n){   //只有右括号==n时匹配结束
            res.push_back(temp);
            return;
        }
        if(left<n){
            temp.push_back('(');
            dfs(n,left+1,right);
            temp.pop_back(); 
        }
        if(right<n && left>right){  //注意右括号个数小于等于左括号个数
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

