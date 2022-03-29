 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        digits[digits.size()-1]++;
        for(int i=digits.size()-1;i>=1;i--)
        {
            if(digits[i]==10){
                digits[i]=0;
                digits[i-1]++;
            }
        }
        if(digits[0]==10)
        {
            vector<int> a (digits.size()+1,0);
            a[0]=1;
            return a;
        }
        return digits;
    }
};

