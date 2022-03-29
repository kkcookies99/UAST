class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int n=digits.size();
        int carry=1,i=n-1;
        while(carry&&i>=0){
            digits[i]++;
            if(digits[i]==10){
                digits[i]=0;
                i--;
            }else{
                carry=0;
            }
        }
        if(carry==1){
            digits.insert(digits.begin(),1);
        }
        return digits;
    }
};

