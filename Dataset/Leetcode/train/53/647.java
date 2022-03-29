  public int XXX(int[] nums) {
    int len = nums.length;
    int i = 0;
    int sum = 0;
    int max = Integer.MIN_VALUE;//负数的最小值
    for(i = 0;i < len ;++i)
    {
        sum += nums[i];//sum为第一位开始相加
        if(sum> max)//大于max，则将值赋给max
        {
            max = sum;
        }
        if(sum < 0)//如果sum小于等于0，说明给max没有意义，直接将sum置为0
        {
            sum  = 0;
        }
    }
    return max;
    
    }

