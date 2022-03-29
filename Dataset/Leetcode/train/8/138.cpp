class Solution {
public:
    int XXX(string s) {
        int n = s.size();

        if(n == 0) return 0;

        bool sign = true; //符号位+ -
        int cur = 0;
        string nums = "0";
        int res = 0;
        
        // 前导空格忽略掉
        while(s[cur] == ' ') ++cur;

        // 判定符号
        if(s[cur] == '-') {
            sign = false;
            ++cur;
        }
        else if(s[cur] == '+'){
            sign = true;
            ++cur;
        }

        // 读入数字
        while('0' <= s[cur] && s[cur] <= '9')
            nums = nums + s[cur++];
        
        //压根读入没有数字
        if(nums.size() == 0) return 0;

        // 去除前缀0
        cur = 0;
        while(nums[cur] == '0') ++cur;
        if(cur == nums.size()) return 0; // 完蛋，全是0
        nums = nums.substr(cur, nums.size()-cur);
        
        // 开始转换
        long long INT32_MAX_ADD_1 = static_cast<long long int>(INT32_MAX)+1;
        for(cur = 0; cur < nums.size(); ++cur){
            long long temp = static_cast<long long int>(res) * 10;
            
            // 是个正整数，且超过上限
            if(sign && temp > INT32_MAX) 
                return INT32_MAX;
            // 是个负整数，且低于下限
            else if(!sign && temp > INT32_MAX_ADD_1)
                return INT32_MIN; 

            temp += nums[cur] - '0';
            // 是个正整数，且超过上限
            if(sign && temp > INT32_MAX) 
                return INT32_MAX;
            // 是个负整数，且低于下限
            // 注意这里是>=，因为补码表示下，INT32的范围是[-2^31, 2^31-1]
            else if(!sign && temp >= INT32_MAX_ADD_1)
                return INT32_MIN; 

            res = static_cast<int>(temp);
        }
        
        return sign ? res : -res;
    }
};

