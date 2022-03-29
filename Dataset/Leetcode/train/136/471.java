 class Solution {

  public int singleNumber(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    PriorityQueue<Entry<Integer, Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(Entry::getValue));
    pq.addAll(map.entrySet());
    return pq.poll().getKey();
  }
}

