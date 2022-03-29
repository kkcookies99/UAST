 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        for(int i=digits.size()-1;i>=0;i--){
            digits[i]+=1;
            if(digits[i]==10){
                digits[i]=0;
            }else{
                return digits;
            }//end if
        }//end for
        digits.insert(digits.begin(),1);
        return digits;
    }//end method
};

