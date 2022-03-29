 int XXX(int* prices, int pricesSize){
    int minPrice = prices[0], XXX = 0;
    for (int i = 0; i < pricesSize; ++i) {
        minPrice = fmin(minPrice, prices[i]);
        XXX = fmax(XXX, prices[i] - minPrice);
    }

    return XXX;
}

