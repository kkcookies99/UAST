 class Solution {
public:
    int XXX(int m, int n) {
        int a[101][101];//a[i][j]表示(0,0)到(i,j)共有a[i][j]条路径
        for(int i = 0;i < m;i++)
            a[i][0] = 1;
        for(int i = 0; i < n;i++)
            a[0][i] = 1;
        for(int i = 1;i < m;i++){
            for(int j = 1;j < n;j++){
                a[i][j] = a[i-1][j] + a[i][j-1]; 
            }
        }
        return a[m-1][n-1];
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


