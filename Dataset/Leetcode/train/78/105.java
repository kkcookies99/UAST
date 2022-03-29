 public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        resultList.add(list);
        for (int item : nums) {
            int size = resultList.size();
            for (int i = 0; i < size; i++) {
                List<Integer> itemList = new ArrayList<>(resultList.get(i));
                itemList.add(item);
                resultList.add(itemList);
            }
        }
        return resultList;
    }

