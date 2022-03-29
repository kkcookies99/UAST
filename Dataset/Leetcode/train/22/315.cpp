 class Solution {
public:
    vector<string> result;
    vector<string> XXX(int n) {
        string s;
        backtrack(n,n,s);
        return result;

    }
    void backtrack(int m,int n,string &s){
        if(!m&&!n){
            result.push_back(s);
            return;
        }
        else if(n<m||n<0||m<0)
            return;
        for(int i=0;i<=1;i++){
            if(i==0){
                s.push_back('(');
                backtrack(m-1,n,s);
                s.pop_back();
            }
            else{
                s.push_back(')');
                backtrack(m,n-1,s);
                s.pop_back();
            }
        }
    }
};

