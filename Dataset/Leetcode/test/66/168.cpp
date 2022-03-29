 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int a=1;//代表进位
        for(int i=digits.size()-1;i>=0;i--){
            int t=digits[i]+a;
            digits[i]=t%10;
            a=t/10;
            if(!a) break;
        }
        if(a) digits.insert(digits.begin(),a);
        return digits;
    }
};```

