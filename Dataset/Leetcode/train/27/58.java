  public int XXX(int[] nums, int val) {
                int L = 0;
                for( int i=0; i<nums.length;i++){
                    if( nums[i] != val ){
                        nums[L++] = nums[i];
                    }
                }

                return L;
    }

