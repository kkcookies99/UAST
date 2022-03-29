public int XXX(int n) {
    return F(n, 1,1);
}
public int F(int n, int ret1, int ret2) {
    if (n == 0)
        return ret1;
    return F(n - 1, ret2, ret1 + ret2);      //尾递归，保存上一次信息 
}