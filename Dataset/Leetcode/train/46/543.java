 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        if (nums == null || nums.length < 1) {
            return new ArrayList<>();
        }
        List<Integer> numsList = new ArrayList<>();
        for (int num : nums) {
            numsList.add(num);
        }
        List<List<Integer>> outerList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        traceback(numsList, outerList, list);
        return outerList;
    }

    public void traceback(List<Integer> numsList, List<List<Integer>> outerList, List<Integer> list) {

        if (numsList.size() < 1) {
            List<Integer> tempList = new ArrayList<>();
            tempList.addAll(list);
            outerList.add(tempList);
            return;
        }
        for (int i = 0; i < numsList.size(); i++) {
            int temp = numsList.get(0);
            numsList.set(0, numsList.get(i));
            numsList.set(i, temp);
            list.add(numsList.get(0));
            List<Integer> tempList = new ArrayList<>();
            tempList.addAll(numsList);
            tempList.remove(numsList.get(0));
            traceback(tempList, outerList, list);
            list.remove(numsList.get(0));
        }
    }
}

