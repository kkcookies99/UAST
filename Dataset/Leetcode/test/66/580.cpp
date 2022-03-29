class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int last=digits.size()-1;

        if(digits[last]!=9){
            digits[last]+=1;
        }else{
            while(last>=1){
                if(digits[last-1]!=9){
                    digits[last-1]+=1;
                    digits[last]=0;
                    break;
                }else{
                    digits[last--]=0;
                }
            }

            if(last==0){
                digits[0]=1;
                digits.push_back(0);
            }
        }
        return digits;
    }
};

