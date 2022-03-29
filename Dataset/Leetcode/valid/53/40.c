#define MAX_LEN 100000
#define GET_MAX(a, b) ((a) >= (b) ? (a) : (b))

int XXX(int* nums, int numsSize)
{
    int dp[MAX_LEN] = {0};
    dp[0] = nums[0];
    int sum = nums[0];
    for (int i = 1; i < numsSize; i++) {
        dp[i] = GET_MAX(nums[i], nums[i] + dp[i - 1]);
        sum = GET_MAX(sum, dp[i]);
    }
    return sum;
}

