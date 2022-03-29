 class Solution {
public:
    vector<string>res;
    vector<string> XXX(int n) {
        string temp="";
        backtrack(n,0,0,temp);
        return res;
    }
    void backtrack(int n,int curl,int curr,string temp){
        if(curr>curl)return ;

        if(curl==n && curr==n){
            res.push_back(temp);
            return ;
        }
        if(curl==n || curr<n){
            temp+=")";
            backtrack(n,curl,curr+1,temp);
            temp.pop_back();
        }
        if(curl<n){
            temp+="(";
            backtrack(n,curl+1,curr,temp);
            temp.pop_back();
        }
    }
};

