    public int RemoveDuplicates1(int[] nums)
    {
        if (!nums.Any()) return 0;
        int per = 0;
        int nxt = 1;
        while(nxt < nums.Length)
        {
            if (nums[per] != nums[nxt])
                nums[++per] = nums[nxt];
            nxt++;
        }
        return per + 1;
    }
