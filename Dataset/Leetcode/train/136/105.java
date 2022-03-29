 public int singleNumber(int[] nums) {
       return Arrays.stream(nums).reduce(0, (left, right) -> left ^ right);
    }

