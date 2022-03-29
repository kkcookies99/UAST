 class Solution {
    public int XXX(int[] nums, int target) {
        int index = 0 ;
        int end = nums.length-1;
        if (target<nums[index]){
            return 0;
        }else if (target > nums[end]){
            return nums.length;
        }

        while (index < end){
                if (target > nums[(index+end)/2]){
                    index = (index+end)/2+1;
                }else if (target < nums[(index+end)/2]){
                    end = (index+end)/2;
                }else if (target == nums[(index+end)/2]){
                    return (index+end)/2;
                }
            }
        int temp = (index + end )/2;
//        System.out.println(temp);

        return temp;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

