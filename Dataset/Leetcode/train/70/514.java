class Solution {
    public int XXX(int n) {

        if (n == 0)
        {
            return 0;
        }
        else if (n == 1)
        {
            return 1;
        }
        else if (n == 2)
        {
            return 2;
        }
        else
        {
            int[] climbStairList = new int[n];
            climbStairList[0] = 1;
            climbStairList[1] = 2;

            for (int i = 2; i < n; i++)
            {
                climbStairList[i] = climbStairList[i - 1] + climbStairList[i - 2];
            }

            return climbStairList[n-1];
        }
    }
}

