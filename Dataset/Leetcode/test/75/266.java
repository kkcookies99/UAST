class Solution {
    public void XXX(int[] nums) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++)
        {
            if (list.size() == 0)
            {
                list.add(nums[i]);
            }
            else
            {
                int k = list.size() - 1;
                
                while (k >= 0)
                {
                    int max = list.get(k);

                    if (nums[i] > max)
                    {
                        break;
                    }
                    else
                    {
                        k--;
                    }
                }

                list.add(k+1 ,nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = list.get(i);
        }
    }
}

