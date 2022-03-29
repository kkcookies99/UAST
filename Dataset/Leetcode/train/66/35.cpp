 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        bool carry=false;
        for(int i=digits.size()-1;i>=0;i--) {
            if(i && i==digits.size()-1 && digits[i]+1==10) {
                digits[i]=0;
                carry=true;
            }
            else if((digits.size()==1 || (i==0 && carry)) && digits[i]+1==10) {
                digits[i]=0;
                digits.resize(digits.size()+1);
                for(int j=digits.size()-1;j>0;j--) digits[j]=digits[j-1];
                digits[0]=1;
            }
            else if(i!=digits.size()-1 && carry && digits[i]+1==10) {
                digits[i]=0;
                carry=true;
            }
            else {
                digits[i]+=1;
                break;
            }
        }
        return digits;
    }
};

