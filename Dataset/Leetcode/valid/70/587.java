class Solution {
    public int XXX(int n) {
        if(n<=1){
            return 1;
        }
        int[][] a={{1,0},{0,1}};
        int[][] b={{0,1},{1,1}};
        while(n>0){
            if(n%2==1){
                multiply(a,b);
            }
            multiply(b,b);
            n/=2;
        }
        return a[0][0]+a[0][1];
    }
    private void multiply(int[][] a,int[][] b){//a=a*b;
        int a00=a[0][0]*b[0][0]+a[0][1]*b[1][0];
        int a01=a[0][0]*b[0][1]+a[0][1]*b[1][1];
        int a10=a[1][0]*b[0][0]+a[1][1]*b[1][0];
        int a11=a[1][0]*b[0][1]+a[1][1]*b[1][1];
        a[0][0]=a00;
        a[0][1]=a01;
        a[1][0]=a10;
        a[1][1]=a11;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


