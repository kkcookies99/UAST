 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int len=digits.size();
        int i=len-1;
        digits[i]+=1;
        while(digits[i]==10){
            digits[i]=0;
            i--;
            if(i<0){
                digits[0]=1;
                digits.push_back(0);
                break;
            }
            digits[i]+=1;
        }
        return digits;
    }
};

