 int XXX(int* prices, int pricesSize){
    int i,j=0;
    int max,tmp = 0;
    for(i = 0; i<pricesSize;i++)
        for(j = i+1;j<pricesSize;j++){
            tmp = prices[j] - prices[i];
            if(tmp>max) {
                max =tmp;
            }
        }
    return max;
}

