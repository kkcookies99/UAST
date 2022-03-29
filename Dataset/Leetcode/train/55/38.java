  public boolean XXX(int[] nums) {

    // 记录每次能跳到最远的距离(下标)，判断下次是否能在进行跳跃
    int maxDistance = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (maxDistance < i) {
        break;
      }
      maxDistance = Math.max(i + nums[i], maxDistance);
      if (maxDistance >= nums.length - 1) {
        return true;
      }
    }
    return maxDistance >= nums.length - 1;
  }```

