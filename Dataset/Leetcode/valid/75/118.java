class Solution {
    public void XXX(int[] nums) {
        int redPosition, whitePosition, bluePosition;
        redPosition = whitePosition = bluePosition = 0;
        for(int temp = 0;temp<nums.length;temp++){
            switch (nums[temp]){
                case 0:
                    nums[bluePosition++] = 2;
                    nums[whitePosition++] = 1;
                    nums[redPosition++] = 0;
                    break;
                case 1:
                    nums[bluePosition++] = 2;
                    nums[whitePosition++] = 1;
                    break;
                case 2:
                    nums[bluePosition++] = 2;
                    break;
            }
        }
    }
}