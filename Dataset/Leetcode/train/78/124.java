class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        LinkedList<List<Integer>> list = new LinkedList<>();
        if (nums.length == 0) {
            return list;
        }
        
        // 遇到一个数就把所有子集加上该数组成新的子集，遍历完毕即是所有子集
        list.add(new ArrayList<Integer>());
        List<Integer> temp, newTemp;
        ListIterator<List<Integer>> it;
        for (int i : nums) {
            // 遍历当前结果
            it = list.listIterator();
            while (it.hasNext()) {
                temp = it.next();
                // 在此基础之上添加一个元素
                newTemp = new LinkedList<>(temp);
                newTemp.add(i);
                it.add(newTemp);
            }
        }
        
        return list;
    }
}

