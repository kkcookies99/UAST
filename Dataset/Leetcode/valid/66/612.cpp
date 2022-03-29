class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int n = digits.size();
        int x = 0;
        for(int i = 1;i<=n;i++){
            digits[n-i] += ((i==1?1:0)+x);
            digits[n-i]/10?x=1:x=0;
            digits[n-i] -= (10*x);
        }
        if(1==x){
            vector<int> ans(n+1,1);
            for(int j = 1;j<=n;j++) ans[j] = digits[j-1];
            return ans;
        }
        return digits;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


