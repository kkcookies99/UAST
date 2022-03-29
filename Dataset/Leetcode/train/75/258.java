class Solution {
    public void XXX(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        Map<Integer, List<Integer>> collect = list
                .stream()
                .collect(Collectors.groupingBy(x -> (int) x));
        int index = 0;
        for (int num : collect.keySet()) {
            int size = collect.get(num).size();
            while (size != 0) {
                nums[index++] = num;
                size--;
            }
        }
    }
}

