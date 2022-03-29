public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> rsp = new ArrayList<>();
        if (nums == null) {
            return rsp;
        }
        dfsSub(rsp, new ArrayList<Integer>(), nums);
        return rsp;
    }
    
    private void dfsSub(List<List<Integer>> res, List<Integer> temp, int[] nums) {
        res.add(new ArrayList<>(temp));
        if (temp.size() < nums.length) {
            for (int i : nums) {
                if (temp.size() == 0 || (!temp.contains(i) && temp.get(temp.size() - 1) < i)) {
                    temp.add(i);
                    dfsSub(res, temp, nums);
                    temp.remove(temp.size() - 1);
                }
            }
        }
    }

