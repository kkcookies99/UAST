int XXX(int n){
if (1 == n)
        return 1;
    if (2 == n)
        return 2;
    int a = 1;
    int b = 2;
    int num = 0;
    for (int i = 3; i <= n; i++)
    {
        num = a + b;
        a = b;
        b = num;
    }
    return num;
}

