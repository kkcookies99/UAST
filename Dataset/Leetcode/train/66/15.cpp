 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        vector<int> sum;
        digits[digits.size()-1] +=1; 
        for(int i = digits.size()-1; i >= 1;i--){
            if(digits[i] >= 10){
                digits[i-1] += digits[i]/10;
                digits[i] %= 10;

            }
            sum.push_back(digits[i]);
        }

        if(digits[0]>=10){
            sum.push_back(digits[0]%10);
            sum.push_back(digits[0]/10);
        }else{
             sum.push_back(digits[0]);
        }
       reverse(sum.begin(), sum.end());
       return sum;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


