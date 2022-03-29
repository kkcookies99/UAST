 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int i,n=digits.size(),pre=0;
        for(i=n-1;i>=0;i--){
            int temp=digits[i]+1;
            digits[i]=temp%10;
            pre=temp/10;
            if(pre==0) break;
        }
        if(pre==1) digits.insert(digits.begin(),1);
        return digits;
    }
};

