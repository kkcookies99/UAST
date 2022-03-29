 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int n = digits.size();
        reverse(digits.begin(),digits.end());
        int add=1;
        for(int i=0;i<n;i++){
            int sum = digits[i]+add;
            digits[i]=sum%10;
            add = sum/10;
        }
        if(add!=0){
            digits.push_back(add);
        }
        reverse(digits.begin(),digits.end());
        return digits;
    }
};

