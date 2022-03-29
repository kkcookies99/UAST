class Solution {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();
    public List<List<Integer>> XXX(int[] nums) {
        backtracking(nums, list);
        return res;
    }

         private void backtracking(int[] nums, LinkedList<Integer> list) {
             if(list.size() == nums.length) {
                 res.add(new LinkedList<>(list));
                 return;
             }
             for (int num : nums) {
                 if(list.contains(num)) continue;
                list.addLast(num);
                backtracking(nums, list);
                list.removeLast();
             }
         }
     }

