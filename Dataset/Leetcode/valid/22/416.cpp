 class Solution {
public:
    vector<string> vec;
    vector<string> XXX(int n) {
        dfs(n,"",0,0);
        return vec;
    }
    void dfs(int n,string s,int cnt1,int cnt2){
        if(cnt2>cnt1 || cnt1>n || cnt2>n) return ;
        if(cnt1==n && cnt2==n){
            vec.push_back(s);
            return ;
        }
        dfs(n,s+"(",cnt1+1,cnt2);
        dfs(n,s+")",cnt1,cnt2+1);
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


