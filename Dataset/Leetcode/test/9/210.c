bool XXX(int x){
    bool ret=false;
    long sum=0;
    int n=x;
    if(x<0||(x!=0&&x%10==0)){
        return ret;
    }
    while(x!=0)
    {
        
        sum=sum*10+x%10;
        x/=10;
    }
    if(sum==n)
    {
        ret = true;
    }
    return ret;
}

