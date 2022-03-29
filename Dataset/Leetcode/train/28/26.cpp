 class Solution {
public:
    int XXX(string haystack, string needle) {
        int n=haystack.length();
        int m=needle.length();
        int i,j;
        if(m==0)
            return 0;
        for(i=0;i<=n-m;i++){
            for(j=0;j<m;j++){
                if(haystack[i+j]==needle[j]) {
                    if(j==m-1) return i;
                }
                else {
                    break;
                }
            }
        }
        return -1;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

