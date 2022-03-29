int XXX(int x) 
{
    //7th
    int p = 10, temp;
    long long signed ans = 0;
    while (x != 0)
    {
        temp = x % p;
        ans = ans * 10 + temp;
        if (ans < signed(0x80000000) || ans > 0x7FFFFFFF)
            return 0;
        else
            x /= p;
    }
    return ans;
}

