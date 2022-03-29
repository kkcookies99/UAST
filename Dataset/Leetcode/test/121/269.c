 int XXX(int* prices, int pricesSize){
    int min_tmp = prices[0], max = 0, i;
    for(i = 1; i < pricesSize; i++)
    {
        min_tmp = prices[i] < min_tmp? prices[i] : min_tmp;

        if(prices[i] - min_tmp > max)
            max = prices[i] - min_tmp;
    }  
    return max;
}


