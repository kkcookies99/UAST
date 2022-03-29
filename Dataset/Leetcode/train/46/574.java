 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> intsList = new ArrayList<>();
        for (int num : nums) list.add(num);
        dfs(list.size(), list, intsList, 0);
        return intsList;
    }

    private void dfs(int size, List<Integer> list, List<List<Integer>> intsList, int first) {
        if (first == size) {
            intsList.add(new ArrayList<>(list));
            return;
        }
        for (int i = first; i < size; i++) {
            swap(list, i, first);
            dfs(size, list, intsList, first + 1);
            swap(list, i, first);
        }

    }

    private void swap(List<Integer> list, int i, int first) {
        int temp = list.get(i);
        list.set(i, list.get(first));
        list.set(first, temp);
    }

}

/**标记数组法**/
    public List<List<Integer>> XXX(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        List<List<Integer>> intsList = new ArrayList<>();
        boolean[] isVisited = new boolean[nums.length];
        dfs(list, intsList,nums,isVisited);
        return intsList;
    }

    private void dfs(LinkedList<Integer> list,
 List<List<Integer>>  intsList,int[] nums,boolean[] isVisited) {
        if (list.size() == nums.length) {
            intsList.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                list.offer(nums[i]);
                dfs(list, intsList,nums,isVisited);
                list.pollLast();
                isVisited[i] = false;
            }
        }
    }

