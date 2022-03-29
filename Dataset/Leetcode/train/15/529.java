 public List<List<Integer>> XXX(int[] nums) {
    Arrays.sort(nums);
    LinkedList<Integer> linkedList = new LinkedList<>();
    HashSet set = new HashSet();
    for (int num : nums) {
        linkedList.add(num);
    }
    int length = nums.length;
    for (int i = 0; i < length; i++) {
        int num = linkedList.get(0);
        linkedList.remove(0);

        for (int j = 0;j <linkedList.size() ; j++) {
            for (int k = j+1; k <linkedList.size(); k++) {
                if (num+linkedList.get(k)+linkedList.get(j)==0){
                    ArrayList<Integer> integers = new ArrayList<>();
                    integers.add(num);
                    integers.add(linkedList.get(j));
                    integers.add(linkedList.get(k));

                    set.add(integers);
                }
            }

        }
    }
    List<List<Integer>> lists = new ArrayList<List<Integer>>(set);
    return lists;
}

