 class Solution {
public:
    vector<string> res;
    string tmp;
    vector<string> XXX(int n) {
        if(n==0)
            return res;
        DFS(0,0,n);
        return res;    
    }
    void DFS(int left,int right,int n){
        if(tmp.size()==2*n){
            res.push_back(tmp);
            return;
        }
        //当前序列符合括号生成规则需要满足：左边的括号数量大于等于右边括号数量
        //分为以下三种情况讨论：（1）两边括号数量相等（2）左边括号大于右边括号数量，且两者数量都小于nn
        //（3）左括号数量达到n，右边括号数量小于n
        if(left==right){
            tmp.push_back('(');
            DFS(left+1,right,n);
            tmp.pop_back();
        }
        else if(left<n&&right<left){
            tmp.push_back('(');
            DFS(left+1,right,n);
            tmp.pop_back();
            tmp.push_back(')');
            DFS(left,right+1,n);
            tmp.pop_back();
        }
        else if(left==n&&right<n){
            tmp.push_back(')');
            DFS(left,right+1,n);
            tmp.pop_back();
        }
        return;
    }
};

