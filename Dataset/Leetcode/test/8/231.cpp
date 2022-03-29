class Solution {
public:
    int XXX(string str) {
        vector<long> nums;
        int mark = 1;
        for(int i = 0;i < str.length();i++){
            if(i == 0 && str[i] == ' '){
                i++;
                while(str[i] == ' '){
                    i++;
                }
                if(str[i] == '-'){
                    mark = -1;
                }
                else if(str[i] == '+'){
                    mark = 1;
                }else i--;
            }else if(i == 0 && str[i] == '-'){
                mark = -1;
            }else if(i == 0 && str[i] == '+'){
                mark = 1;
            }else if(str[i] >= 48 && str[i] <= 57){
                nums.push_back(str[i]-48);
                if(nums[0] == 0){
                    nums.pop_back();
                }
                if(nums.size() > 10) break;
            }else{
                break;
            }
        }
        long ans = 0;
        if(nums.size() <= 10){
            for(int i = nums.size()-1;i >= 0;i--){
                ans += nums[i]*pow(10,nums.size()-i-1);
            }
            ans *= mark;
            if(mark == 1 && ans > 2147483647){
                return 2147483647;
            }else if(mark == -1 && ans < -2147483648){
                return -2147483648;
            }
            return ans;
        }else{
            if(mark == 1) return 2147483647;
            else return -2147483648;
        }
        return ans;
    }
};

