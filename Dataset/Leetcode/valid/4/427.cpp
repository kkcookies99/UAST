 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int len1 = nums1.size(), len2 = nums2.size();
        //保证第一个数组长度较小
        if(len1 > len2) return XXX(nums2,nums1);
        //以len1进行二分寻找划分线，相应调整len2的划分线
        //保证两个数组的划分线左边元素个数 与 右边元素个数相等，
        //或左边多一个(长度和为奇数时候)
        //要保证划分线左边元素均小于右边元素 如下
        // num1   a0 a1 ... ai_1 | ai ... an  -> i 可表示 ai左边元素个数
        // num2   b0 b1 ... bj_1 | bj ... bm  -> j 可表示 bj左边元素个数
        // 故存在i + j = (len1 + len2 + 1) / 2; +1是为了保证奇数的时候左边多一个
        // 因此 j = (len1 + len2 + 1) / 2 - i; 由于a长度小于b，故b不会存在越界情况
        //1 : 当 满足 max(ai_1,bj_1) <= min(ai,bj) 便是有效划分线
        //2 : 当 ai_1 > bj 与我们目标让ai_1 <= min(bj,ai) 不符合 
        //    需要让a划分线左移以减小ai_1,经过计算b划分线自然右移，bj增大
        //3 : 当 ai < bj_1 与我们的目标ai >= max(ai_1,bi_1) 不符合
        //    需要让a划分线右移以增大ai，经过计算b划分线自然左移，bj_1减小
        // 当找到满足元素时候，
        // 长度和为奇数，便是划分线左边最大值 max(ai_1,bj_1)
        // 长度和为偶数，便是划分线左边最大值 与右边最小值 之和除二(max(ai_1,bj_1)+min(ai,bi))/ 2
        //边界情况处理，划分线旁四个元素当左边超出边界，赋值无穷小，当右边超出，赋值无穷大

        //接下来便是需要对数组a中划分线进行二分，
        int total_left = (len1 + len2 + 1) >> 1;
        int left = 0;
        int right = len1;

        while(left < right){
            int i = left + right + 1>> 1; //+1可以保证i-1不下溢
            int j = total_left - i;
            if(nums1[i-1] > nums2[j])
                right = i - 1;
            else left = i;
        }

        int i = left;
        int j = total_left - i;
        int ai_1 = i > 0 ? nums1[i-1] : INT_MIN;
        int ai = i < len1 ? nums1[i] : INT_MAX;
        int bj_1 = j > 0 ? nums2[j-1] : INT_MIN;
        int bj = j < len2 ? nums2[j] : INT_MAX;

        if((len1 + len2) & 1)
            return max(ai_1,bj_1);
        else return (max(ai_1,bj_1) + min(ai,bj)) * 1.0 / 2;
    }
};

