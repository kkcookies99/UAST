 class Solution {
    public int XXX(int m, int n) {
            int [][]a=new int[m+1][n+1];
            return XXX(m,n,a);
        }
        public int XXX(int m,int n,int [][]a){
            int total=0;
            if (m==1||n==1)
                return 1;
            else{
                if(a[m][n]!=0){
                    return a[m][n];
                }else {
                    a[m-1][n]=XXX(m-1,n,a);
                    total+=a[m-1][n];
                    a[m][n-1]=XXX(m,n-1,a);
                    total+=a[m][n-1];
                }
            }
            return total;
        }
    
}

