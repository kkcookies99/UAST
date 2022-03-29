class Solution {

  private final List<List<Integer>> ans = new ArrayList<>();
  private int[] hash = null;
  private int len;

  public List<List<Integer>> XXX(int[] nums) {
    len = nums.length;
    hash = Arrays.copyOf(nums, len);
    List<Integer> integers = Arrays.stream(nums).boxed().collect(Collectors.toList());
    helper(0, integers);
    return ans;
  }

  private void helper(int step, List<Integer> integers) {
    if (step == len) {
      ans.add(new ArrayList<>(integers));
      return;
    }
    for (int i = 0; i < hash.length; i++) {
      if (hash[i] >= -10 && hash[i] <= 10) {
        integers.set(step, hash[i]);
        hash[i] += 21;
        helper(step + 1, integers);
        hash[i] -= 21;
      }
    }
  }
}

