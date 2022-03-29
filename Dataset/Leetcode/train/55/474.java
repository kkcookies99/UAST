 class Solution {
    public boolean XXX(int[] nums) {
        if ( nums.length < 0 ){
            return false;
        }
        //假设我们要到末尾,那么我们需要找到前面能到末尾的数
        int[] tmp = new int[nums.length];
        tmp[0] = 1;
        for ( int i = 0; i < nums.length; i++){
          if ( tmp[i] !=0 ){
              for ( int j = 1 ; j <= nums[i]; j++){
                if ( i + j >=nums.length){
                    tmp[nums.length - 1]++;
                }else{
                    tmp[i + j ]++;
                }
              }
          }
        }   
        return tmp[nums.length-1] != 0;    
    }
}

