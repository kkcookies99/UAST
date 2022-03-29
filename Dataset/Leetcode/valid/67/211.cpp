 class Solution {
public:
    string ans;
    string XXX(string a, string b) {
        reverse(a.begin(), a.end());
        reverse(b.begin(), b.end());
        int n = max(a.size(), b.size());
        for(int i = 0; i < n; i++){
            ans[i]=(a[i] - '0') + (b[i] - '0');
        }
        for(int i = 0; i < n; i++){
            if(ans[i] >= 2){
                ans[i+1] += ans[i] / 2;
                ans[i] %= 2;
                //长度加1
                if(i == n - 1){
                    n++;
                }
            }
        }
        reverse(ans.begin(), ans.end());
        return ans;
    }
};


