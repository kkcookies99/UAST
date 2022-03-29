    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        XXX(nums, 0, new ArrayList<>(), resultList);
        return resultList;
    }


    public void XXX(int[] nums, int index, List<Integer> result, List<List<Integer>> resultList) {
        if (index == nums.length) {
            resultList.add(new ArrayList<>(result));
            return;
        }

        // 不加
        XXX(nums, index + 1, result, resultList);

        // 加入
        result.add(nums[index]);
        XXX(nums, index + 1, result, resultList);
        result.remove(result.size() - 1);
    }

