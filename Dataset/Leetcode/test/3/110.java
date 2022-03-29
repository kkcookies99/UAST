 class Solution {
    public int XXX(String s) {
        int nums[] = new int[128];
        for(int i=0;i<128;i++)
            nums[i] = -1;
        //l是第一个非重复元素的下标。
        //cur是当前计数器的值
        int l=0,max=0,curLen=0,sLen = s.length();
        for(int i=0;i<sLen;i++) {
            int index = s.charAt(i);
            if(nums[index]<l) {
                nums[index] = i;
                curLen++;
            } else {
                max = curLen>max? curLen:max;
                curLen -= nums[index]-l;
                l = nums[index]+1;
                nums[index] = i;
            }
        }
        return curLen>max? curLen:max;
    }
}

