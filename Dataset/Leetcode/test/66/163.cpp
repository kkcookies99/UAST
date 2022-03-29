 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int i=digits.size()-1;
        digits[i]++;
        while(i>=0&&digits[i]==10){
            if(i==0){
                digits.insert(digits.begin(),1);
                digits[i+1]=0;
                return digits;
            }
            digits[i-1]++;
            digits[i]=0;
            i--;
        }
        return digits;
    }
};

