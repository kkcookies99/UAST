 int XXX(int* prices, int pricesSize){
    int temp = 0;
    int max = 0;
    for(int i = 1; i < pricesSize; i++)
    {
        temp += prices[i] - prices[i - 1];
        temp = (temp < 0) ? 0 : temp;
        max = (temp > max) ? temp : max;
    }
    return max;
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


