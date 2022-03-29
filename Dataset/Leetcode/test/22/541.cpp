 class Solution {
public:
    vector<string> ans;
    void dfs(string s,int n,int a,int b){
        if(s.size()==n*2){
            ans.push_back(s);
            return;
        }
        if(a==b){
            dfs(s+'(',n,a+1,b);
        }
        else{
            if(a==n){
                dfs(s+')',n,a,b+1);
            }
            else{
                dfs(s+'(',n,a+1,b);
                dfs(s+')',n,a,b+1);
            }
        }

    }
    vector<string> XXX(int n) {
        dfs("",n,0,0);
        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


