class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        bool bIn = false;
        int nSize = digits.size();
        if (nSize == 0){
            return digits;
        }

        digits[nSize-1]++;
        bIn = digits[nSize-1]/10;
        digits[nSize-1]%=10;
        
        for(int i = nSize-2;i>=0;i--){
            if (bIn){
                digits[i]++;
            }else{
                break;
            }
            bIn = digits[i]/10;
            digits[i]%=10;
        }

        if(bIn){
            digits.insert(digits.begin(),1);
        }
        return digits;
    }
};

