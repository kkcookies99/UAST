 class Solution {
public:
    int XXX(int x) {
        const int MAX_INT = 2147483647;
        const int MIN_INT = -2147483648;
        /* 用于验证临界值的数组 */
        int MAX_INT_LIST[] = {2,1,4,7,4,8,3,6,4,7};
        bool is_negative = x < 0;
        /* 如果x为负数，则反转后临界值数组最后一位应对应负数的临界数组 */
        if (is_negative) {
            MAX_INT_LIST[9]++;
        }
        /* 如果x为MIN_INT,转为正数会溢出 */
        if (is_negative && x != MIN_INT) x *= -1;
        /* 如果为MIN_INT，那反转后的结果也为0，直接返回 */
        if (x == -2147483648) return 0;
        bool delete_zero = false;
        int ans = 0;
        vector<int> nums;
        while(x != 0) {
            int n = x % 10;
            if (n > 0 && !delete_zero) delete_zero = true;
            if (delete_zero) nums.push_back(n);
            x /= 10;
        }
        /* 反转数组元素长度大于10则溢出，返回0 */
        if (nums.size() > 10) return 0;
        /* 如果反转后位数为10，则验证每一位是否超出临界值，若超出则直接返回0 */
        if (nums.size() == 10) {
            for (int i = 0; i < 10; i++) {
                if (nums[i] == MAX_INT_LIST[i]) continue;
                if (nums[i] < MAX_INT_LIST[i]) break;
                return 0;
            }
        }
        for (int i = 0; i < nums.size(); i++) {
            ans += nums[i] * pow(10, nums.size() - i - 1);
        }
        return is_negative ? ans * -1 : ans;
    }
};

