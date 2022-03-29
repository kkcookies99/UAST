 class Solution {
public:
    int XXX(vector<int>& prices) {
        int result=0;
        for(int i=0;i<prices.size();i++){
            if(i+1<prices.size()&&prices[i]>prices[i+1]){
                continue;
            }
            for(int k=i+1;k<prices.size();k++){
                int cur=prices[k]-prices[i];
                if(cur>result)
                    result=cur;
            }
        }
        return result;
    }
};



