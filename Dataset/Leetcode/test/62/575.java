class Solution {
    public int XXX(int m, int n) {
        int [][] f=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0||j==0){
                    f[i][j]=1;
                }else {
                    f[i][j]=f[i-1][j]+f[i][j-1];
                }
            }
        }
        return f[m-1][n-1];
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


