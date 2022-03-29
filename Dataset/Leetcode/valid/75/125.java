public void XXX(int[] nums) {
        //记录已经放过0的位置
        int begin =0;
        //记录已经放过2的位置
        int end =nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            //下标大于end的都是2,排序已经完成
            if (i>end) {
				break;
			}
            if (nums[i]==0) {
                nums[i]=nums[begin];
                nums[begin]=0;
                begin++;
            }
            if (nums[i]==2) {
                nums[i]=nums[end];
                nums[end]=2;
                end--;
                //换过来的数字也需要排序,所以下标倒退一个
                i--;
            }
            
        }
    }

