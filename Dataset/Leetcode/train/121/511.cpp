 class Solution {
public:
    int XXX(vector<int>& prices) {
        
        int uMin = INT_MAX;
        int uMax = INT_MIN;
        if(prices.size() <= 1)
            return 0;
        for(int &price: prices){
            uMin = min(uMin, price);
            uMax = max(price-uMin, uMax);
        }
        return uMax;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


