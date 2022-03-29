int XXX(char * str)
{
    long result = 0;
    sscanf(str, "%ld", &result);
    if (result < -2147483648)
        return -2147483648;
    else if (result > 2147483647)
        return 2147483647;
    return result;
}

