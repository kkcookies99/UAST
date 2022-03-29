 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
       List<Integer> list = new ArrayList<Integer>();
        for (int num : nums) {
            list.add(num);
        }
        return doPermute(list);
    }
    private List<List<Integer>> doPermute(List<Integer> list) {
        //用于存储结果
        List<List<Integer>> result = new ArrayList<>();
        //特殊情况处理
        if (list.size() < 2) {
            result.add(list);
            return result;
        }
        //递归终点, 两个元素时交换位置即可
        if (list.size() == 2) {
            result.add(list);
            result.add(reverseList(list));
            return result;
        }
        //遍历list集合,依次让每一个元素都能在第一个位置
        for (int i = 0; i < list.size(); i++) {
            Integer first = list.get(i);
            //除了当前元素以外的集合,因为当前元素提取到第一个位置,对集合其他元素再进行重排列
            List<Integer> nextList = nextList(i, list);
            List<List<Integer>> tmp = doPermute(nextList);
            //将第一个元素和其他元素重排列结果挨个拼接成新的集合
            result.addAll(jointList(first, tmp));
        }
        return result;
    }

    //在list集合中获取index为i以外的元素
    private List<Integer> nextList(int i, List<Integer> list) {
        List<Integer> res = new ArrayList<>(list);
        res.remove(i);
        return res;
    }

   //将集合的顺序反过来
    private List<Integer> reverseList(List<Integer> list) {
        List<Integer> res = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0 ; i--) {
            res.add(list.get(i));
        }
        return res;
    }
    
    //将first放到list的第一个位置
    private List<List<Integer>> jointList(Integer first, List<List<Integer>> list) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            List tmp = new ArrayList();
            tmp.add(first);
            tmp.addAll(list.get(i));
            res.add(tmp);
        }
        return res;
    }
}

