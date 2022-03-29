 class Solution {
public:
    int XXX(string& s) {
        int i=0,ans=0;
        for(int j=0;j<s.size();j++){
            for(int k=i;k<j;k++){
                if(s[k]==s[j]){
                    i=k+1;
                    break;
                }
            }
            ans=max(ans,j-i+1);
        }
        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

