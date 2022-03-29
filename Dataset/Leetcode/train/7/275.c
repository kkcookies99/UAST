int XXX(int x)
{
    long result = 0;
    int is_minus = x < 0 ? 1 : 0;
    long y = 0;
    y = is_minus ? y - x : x;
    for (long n = y % 10, i = 0; y > 0; y /= 10, n = y % 10, ++i)
    {
        result *= 10;
        result += n;
    }
    result = is_minus ? -result : result;
    if (result < -2147483648 || result > 2147483647)
        return 0;
    return result;
}

