 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        digits[digits.size()-1]++;
        for(int i = digits.size() - 1;i >= 0;i--)
        {
            if(digits[i] == 10)
            {
                digits[i] = 0;
                if(i){
                    digits[i-1]++;
                }else{
                    digits.insert(digits.begin(),1);
                }
                
            }

