 public int XXX(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int start=-1;
        int  length=nums.length;
        for (int i = 0; i < nums.length;i++ ) {
            if(start==-1){
                start=0;
            }else{
                if(nums[start]==nums[i]){
                    nums[i]=Integer.MIN_VALUE;
                    length--;
                }else{
                    start=i;
                }
            }
        }

        for (int i = 0, j=i+1; i < length ;i++,j++ ) {
            if(nums[i]==Integer.MIN_VALUE){
                while(nums[j]==Integer.MIN_VALUE){
                    j++;
                }
                    nums[i]=nums[j];
                    nums[j]=Integer.MIN_VALUE;
            }

        }


        return length;
    }

