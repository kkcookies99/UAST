 class Solution {
public:
    vector<string> XXX(int n) {
        vector<string> ans;
        if(n == 0) return ans;
        string temp;
        int st = 0;
        DFS(ans,n,st,temp);
        return ans;
    }
    void DFS(vector<string> &ans,int n, int &st, string &str){
        if(n == 0&&st == 0){
            ans.push_back(str);
            return;
        }
        if(n>0){
            str += '(';
            st++;
            DFS(ans,n-1,st,str);
            st--;
            str.pop_back();
        }
        if(st>0){
            str += ')';
            st--;
            DFS(ans,n,st,str);
            st++;
            str.pop_back();
        }
    }
};

