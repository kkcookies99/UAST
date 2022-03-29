 class Solution {
public:
    string XXX(vector<string>& strs) {
        int n=strs.size();
        int j=0;
        int flag=1;
        if(n==0)
            return "";
        if(n==1)
            return strs[0];
    while(1){
        for(int i=1;i<n;i++){
            if(strs[0][j]!=strs[i][j]){
                flag=0;
                break;
            }
        }
        j++;
        if(j>strs[0].length()||flag==0)
            break;
    }
    string s=strs[0].substr(0,j-1);
        return s;
    }
};

