int XXX(int n){
    if (n == 1)
        return 1;
    if (n == 2)
        return 2;
    int pre1 = 1, pre2 = 2, count, i;
    for (i = 3; i <= n; i++)
    {
        count = pre1 + pre2;
        pre1 = pre2;
        pre2 = count;
    }
    return count;
}

