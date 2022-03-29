 int XXX(int x){
    int ans=0;
    while(x!=0)
    {
        if ( (ans < INT_MIN/10 ) || (ans > INT_MAX/10 ) )
            return 0;
        else
        {
            ans *= 10;
            ans += x%10;
            x=x/10;     
        }
    }
    return ans;
}

