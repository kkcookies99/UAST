 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length == 0){
            return res;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> path = new ArrayList<>();
        for(Integer first: map.keySet()){
            path.add(first);
            map.put(first, map.get(first) - 1);
            for(Integer second: map.keySet()){
                if(second >= first && map.get(second) > 0){
                    path.add(second);
                    map.put(second, map.get(second) - 1);
                    if(-first - second >= second && map.getOrDefault(-first - second, 0) > 0){
                        path.add(-first - second);
                        res.add(new ArrayList<>(path));
                        path.remove(path.size() - 1);
                    }
                    map.put(second, map.get(second) + 1);
                    path.remove(path.size() - 1);
                }
            }
            map.put(first, map.get(first) + 1);
            path.clear();
        }
        return res;
    }
}

