 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {     
        int index=digits.size()-1;
        digits[index]+=1;  
        while(index>=0){
            if(digits[index]==10){
                digits[index]=0;
                if(index!=0) digits[index-1]++;
                else digits.insert(digits.begin(),1);
            }
            index--;
        };
        return digits;
    }
};

