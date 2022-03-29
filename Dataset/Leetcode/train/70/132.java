public int XXX(int n) {
    //就是一个斐波拉契数列
    int f1=0;
    int f2=1;
    int sum=0;
    for(int i=1;i<=n;i++){
        sum=f1+f2;
        f1=f2;//接收前一个参数的值
        f2=sum;//获取上两个值的之和
    }
    return sum;
    //相当于于一种斐波拉数列

}

