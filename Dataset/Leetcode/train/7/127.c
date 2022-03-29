int XXX(int x) 
{
    //7th
    int p = 10, temp;
    int ans = 0;
    while (x != 0)
    {
        temp = x % p;
        if (ans > 0xCCCCCCC || (ans == 0xCCCCCCC && temp > 7))
            return 0;
        else if (ans < signed(0xF3333334) || (ans == signed(0xF3333334) && temp < -8))
            return 0;
        else 
        {
            ans = ans * 10 + temp;
            x /= p;
        }
    }
    return ans;
}

