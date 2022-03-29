int XXX(int x){

    int res;
    if(x == 0)
        return 0;

    for(int i = 1; i < x; i++)
    {
        if(x/i < i)
        {
            return i - 1;
        }
    }

    return 1;
}

