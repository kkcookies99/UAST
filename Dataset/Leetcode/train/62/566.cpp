class Solution {
public:
    int XXX(int m, int n) {//不考虑m、n不大于0的特殊情况
        vector<int> dpRow(n + 1, 1);
        dpRow[0] = 0;
        for(int i = 1; i<m; ++i){
            for(int j = 1; j<=n; ++j){
                dpRow[j] += dpRow[j-1];
            }
        }
        return dpRow.back();
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


