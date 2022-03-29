 public List<List<Integer>> XXX(int[] nums) {
    List<List<Integer>> results = new ArrayList<>();
    results.add(new ArrayList<>());
    for(int i = 0; i < nums.length; i++) {
        List<List<Integer>> plusNumbers = new ArrayList<>();
        for(List<Integer> result : results) {
            List<Integer> newNumber = new ArrayList<>(result);
            newNumber.add(nums[i]);
            plusNumbers.add(newNumber);
        }
        results.addAll(plusNumbers);
    }
    return results;
}
