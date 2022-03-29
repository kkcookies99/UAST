 class Solution {
public:
    int XXX(vector<int>& prices) {
        int min=prices[0];
        int ans=0;
        for(int i=1;i<prices.size();i++)
        {
            if(prices[i]<min) min=prices[i];
            if(prices[i]-min>ans) ans=prices[i]-min;
        }
        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


