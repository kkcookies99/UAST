public int XXX(int n) {
    if (n==0||n==1) return n==0?0:1;
    int max=n/2;
    long path=1;
    long mid=1;
    for (int i=1;i<=max;i++){
        n--;
        for (int j=1,k=n-i+1;j<=i;j++,k++){
            mid=mid*k/j;
        }
        path+=mid;
        mid=1;
    }
    return (int)path;
    }//组合数学方法
    public int XXX(int n) {
   if (n==0||n==1) return n==0?0:1;
        if (n==2) return 2;
    int path=0;
    int f=1,b=2;
    for (int i=3;i<=n;i++ ){
        path=f+b;
        f=b;
        b=path;
    }
    return path;
    }//动态规划 n的走法=n-1的走法+n-2的走法 因为到达n最后一步要么是2步要么是1步，即走法向量最后一个数要么为2要么为1，则把最后为2+最后为1既得

