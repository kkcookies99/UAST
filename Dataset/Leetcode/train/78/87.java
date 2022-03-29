class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        // 结果集
        List<List<Integer>> result = new ArrayList<>();

        // 第一个子集 空集合
        result.add(new ArrayList<>());
        
        ListIterator<List<Integer>> iterator;
        
        for(int num : nums) {
            // 获得迭代器
            iterator = result.listIterator();
            while(iterator.hasNext()) {
                List<Integer> temp = new ArrayList<>(iterator.next());
                temp.add(num);
                iterator.add(temp);
            }           
        }
        
        return result;
    }
}

