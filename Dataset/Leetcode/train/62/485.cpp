class Solution {
public:
    int XXX(int m, int n) {
        int cnt[110];
        for(int i=0; i<n; ++i){
            cnt[i] = 1;
        }
        for(int i=1; i<m; ++i){
            for(int j=1; j<n; ++j){
                cnt[j] += cnt[j-1];
            }
        }
        return cnt[n-1];
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


