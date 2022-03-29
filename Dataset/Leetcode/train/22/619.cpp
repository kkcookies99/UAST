 class Solution {
public:
    vector<string>res;
    void DFS(string& s,int left,int right){//当前字符串，可用左右括号
        if(left==0&&right==0){
            res.push_back(s);
            return;
        }else{
            if(left!=0){
                s+="(";
                DFS(s,left-1,right);
                s.erase(s.end()-1,s.end());
            }
            if(right>left){
                s+=")";
                DFS(s,left,right-1);
                s.erase(s.end()-1,s.end());
            }
        }
    }
    vector<string> XXX(int n) {
        string  s="";
        DFS(s,n,n);
        return res;
    }
};

