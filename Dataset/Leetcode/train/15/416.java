 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        ArrayList<ArrayList<Integer>> res = new ArrayList();
        HashMap<Integer, Integer> hashMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i] * (-1);
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                ArrayList<Integer> tempList = new ArrayList();
                int key = sum - nums[j];
                if (hashMap.containsKey(key)) {
                    if (hashMap.get(key) == i || hashMap.get(key) == j)
                        continue;
                    tempList.add(nums[i]);
                    tempList.add(key);
                    tempList.add(nums[j]);
                    //hashMap.put(nums[j], nums[j]);
                    res.add(tempList);
                }
            }
        }
        // 去除重复
        List<List<Integer>> ans = new ArrayList();
        for (int i = 0; i < res.size(); i++) {
            if (res.get(i) == null) continue;
            Collections.sort(res.get(i));
            if (ans.contains(res.get(i))) continue;
            ans.add(res.get(i));
            // System.out.println(res.get(i));
        }

        return ans;
    }
}

