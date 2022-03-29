 public int singleNumber(int[] nums) {
      //全体同或，相同为一；同或的写法就是异或再异或1, ^ ^1
        int result=1;
      for(int num:nums){
         result^=num^1;
      }
    return result;
    }

