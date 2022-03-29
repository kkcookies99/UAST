 int XXX(int* prices, int pricesSize){
    int minPrices = prices[0];
    int max_Profit = 0;
    for(int i=1;i<pricesSize;i++){
        minPrices = minPrices<prices[i]?minPrices:prices[i];
        max_Profit = max_Profit>prices[i]-minPrices?max_Profit:prices[i]-minPrices;
    }
    return max_Profit;
}

