 int XXX(int* prices, int pricesSize){
    int i,temp=0,result=0;
    for(i=1;i<pricesSize;++i)
    {
        temp+=prices[i]-prices[i-1];
        if(temp<0)
        {
            temp=0;
        }
        if(temp>result)
            result=temp;
    }
    return result;
}

