 class Solution {
    public String XXX(String s) {
        char[] arr=s.toCharArray();
        int n=arr.length;

        int[][] PalinLen=new int[n][n]; //PalinLen[i][j]表示i-1...j-1的回文串长度
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                        PalinLen[i][j]=0;;
            }
        }

        for (int k=0;k<n;k++){
            int i,j;

            //奇数位回文串
            i=j=k;
            while (i>=0 && j<n && arr[i]==arr[j]){
                PalinLen[i][j]=j-i+1;
                i--;
                j++;
            }

            //偶数位回文串
            i=k;
            j=k+1;
            while (i>=0 && j<n && arr[i]==arr[j]){
                PalinLen[i][j]=j-i+1;
                i--;
                j++;
            }
        }

        int x=0,y=0;
        int max=PalinLen[0][0];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (max<PalinLen[i][j]){
                    x=i;
                    y=j;
                    max=PalinLen[i][j];
                }
            }
        }

        String str=s.substring(x,y+1);
        return str;
    }
}

