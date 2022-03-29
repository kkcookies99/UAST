 class Solution {
public:
    string XXX(int num) {
        vector<int> nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        vector<string> romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        string ret = "";
        int index = 0;
        while(num>0){
            while(num>0 && num >= nums[index] && index<nums.size()){
                ret += romans[index];
                num -= nums[index];
            }
            index++;
        }
        return ret;
    }
};

