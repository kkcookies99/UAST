 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows == 1)return s;
        int size = numRows + numRows - 2;
        int n = s.size(),cur = 0;
        string ans(n,' ');
        for (int i=0;i<numRows;++i){
            for (int j=i;j<n;j+=size){
                ans[cur++] = s[j];
                if(size > 2){
                    if(i >0 && i < numRows-1 && (j/size + 1) * size - i < n && cur <= n - 1)
                        ans[cur++]=s[(j/size + 1) * size - i];
                }
            }
        }
        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


