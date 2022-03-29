  public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0) {
            return res;
        }
        List<Integer> path = new ArrayList<>();
        dfs(nums,path, res);
        return res;
    }

    /**
     * 方法一：
     * @param nums
     * @param path
     * @param res
     */
    private void dfs(int[] nums,List<Integer> path, List<List<Integer>> res) {
        // 由于是全排列问题，集合中数组的元素就代表此时搜索的深度
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        // 由于是全排列问题，每个元素都要选择，只是顺序位置不一样而已，所有i每次都从0开始
        for (int i = 0; i < nums.length; i++) {
            // 由于每次都是从0位置开始选择，但是不能每次选择同一个数
            // 之前已经加入的数，则就不能再次加入了，也可以使用一个 used[]辅助数组来判断是否使用过
            if (path.contains(nums[i])) {
                continue;
            }
            // 路径中没有这个数，则加入列表中，递归
            path.add(nums[i]);
            dfs(nums, path, res);
            path.remove(path.size() - 1);
        }
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


