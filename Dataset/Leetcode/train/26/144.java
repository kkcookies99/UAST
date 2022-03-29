
    public int RemoveDuplicates(int[] nums)
    {
        if (!nums.Any()) return 0;
        int per = 0;
        for(int i = 1;i < nums.Length; i++)
        {
            if (nums[per] != nums[i])
                nums[++per] = nums[i];
        }
        return per + 1;
    }

