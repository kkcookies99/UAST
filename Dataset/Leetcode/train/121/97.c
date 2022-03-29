 int XXX(int* prices, int pricesSize){
    int max=0,min,i;

    if(pricesSize<=1)
        return 0;
    min=prices[0];
    for(i=1;i<pricesSize;i++){
        if(prices[i]<min){
            min=prices[i];
        }else{
            max=prices[i]-min>max?prices[i]-min:max;
        }
    }
    return max;
}


