 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int slowIndex = 0; // index为 慢指针
        for (int fastIndex = 0; fastIndex < nums.size(); fastIndex++) {  // i 为快指针
            if (val != nums[fastIndex]) { //将快指针对应的数值赋值给慢指针对应的数值
                nums[slowIndex++] = nums[fastIndex]; 注意这里是slowIndex++ 而不是slowIndex--
            }
        }
        return slowIndex;
    }
};

