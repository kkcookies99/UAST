class Solution {
    public int XXX(int m, int n) {
        int[][] temp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if( i== 0){
                    temp[i][j] = 1;
                    continue;
                }
                if(j == 0){
                    temp[i][j] = 1;
                    continue;
                }
                temp[i][j] = temp[i][j-1]+temp[i-1][j];
            }
        }
        return temp[m-1][n-1];
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


