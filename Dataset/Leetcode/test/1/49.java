 class Solution {
    public int[] XXX(int[] nums, int target) {
        int i,j;
int a[] = null;
a = new int[2];
for(i = 0; i < nums.length-1;i++)
    for(j = i+1; j < nums.length;j++)
    {
        if(target == nums[i] + nums[j])
        {
            a[0]=i;
            a[1]=j;
        }

    }
        return a;
}
}

