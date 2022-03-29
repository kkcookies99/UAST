 public int singleNumber(int[] nums) {

    int eor = 0;

    for(int cur:nums){

        eor ^= cur;

    }

    return eor;

}

