 public int XXX(int[] nums) {
    //思路：遍历一遍，更换位置，需要记住可以插入元素的位置
    int res = 0;
    if(nums.length == 1) {
        res = 1;
    }
    //元素数目大于1的数组
    for(int i=res+1; i<nums.length; i++) {
        int next = nums[i];
        //因为是有序的，此时必定之前不存在该元素
        if(next > nums[res]) {
            res++;
            if(res < i) {
                //需要交换数据
                nums[i] = nums[res];
                nums[res] = next; 
            }
        } else if(next < nums[i-1]) {
            //寻找0到i-1个元素中是否存在该元素
            for(int j=0; j<i-1; j++) {
                int min = 0;
                int max = 0;
                if(nums[j] == next) {
                    break;
                } else if(nums[j] < next) {
                    max = j;
                } else {
                    min = j;
                }
                //需要将元素next插入到min与max之间
                //将next元素与其前面的元素依次交换
                //先将res+1位置的元素与next交换
                if(res+1 < i) {
                    nums[i] = nums[res+1];
                    nums[res+1] = next;
                }
                for(int k=res; k>=0; k--) {
                    if(k == max) {
                        int tem = nums[k+1];
                        nums[k+1] = nums[k];
                        nums[k] = tem; 
                    }
                }
                res++;
            }
        } 
    }

    return res+1;
}
