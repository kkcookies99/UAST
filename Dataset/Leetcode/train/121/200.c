 int XXX(int* prices, int pricesSize){
    int max = 0;
    for(int i = pricesSize - 1; i > 0; --i)
    {
        for(int j = i - 1; j >= 0 ; --j)
        {
            if((prices[i] - prices[j]) > max)
            {
                max = prices[i] - prices[j];
            }
        }
    }
    return max;
}

