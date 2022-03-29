 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        for(int i=nums1.length-1;i>=0;i--){
            stack1.push(nums1[i]);
        }
        for(int i=nums2.length-1;i>=0;i--){
            stack2.push(nums2[i]);
        }
        int[] nums3 = new int[nums1.length + nums2.length];
        int j=-1;
        while(!(stack1.empty() && stack2.empty())){
            j++;
            if(stack1.empty()){
                nums3[j] = stack2.pop();
                continue;
            }
            if(stack2.empty()){
                nums3[j] = stack1.pop();
                continue;
            }
            if(stack1.peek() < stack2.peek()){
                nums3[j] = stack1.pop();
            }else{
                nums3[j] = stack2.pop();
            }
        }
        if(nums3.length == 1){
            return nums3[0];
        }
        float half = nums3.length/2.0F;
        int index = nums3.length/2;
        if(half > index){
            return nums3[index];
        }
        return  (nums3[index-1] + nums3[index])/2.0F;

    }
}```

