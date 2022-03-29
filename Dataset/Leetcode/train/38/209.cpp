class Solution {
public:
    string  DFS(string ans,int depth, int target){
        if(depth==target){
            return ans;
        }
        int n = ans.size();
        string temp = "";
        for(int i=0;i<n;i++){
            int counter=1;
            while(i+1<n&&ans[i+1]==ans[i]){
                counter++;
                i++;
            }
            temp+=to_string(counter)+ans[i];
        }
        return DFS(temp,depth+1,target);      
    }

    string XXX(int n) {
        string ans = DFS("1",1,n);
        return ans;
    }
};

