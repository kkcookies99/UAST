 int XXX(int* prices, int pricesSize){
    int max=0;
    int p=0,q=1;
    while(q<pricesSize){
        if(prices[p]>prices[q]){
            p=q;
            q++;
        }else{
            max=fmax(prices[q]-prices[p],max);
            q++;
        }
    }
    return max;
}

