 class Solution {
    public int XXX(String s) {
        if ("".equals(s)) {
            return 0;
        }
        // 遍历数组 将数组中的每一个值都当作是key 存入hashmap中
        // 如果存在相同的key那么 记录map长度 并跳出当前循环
        // 最后hashmap最长的就是 最常无重复字串
        char[] cStr = s.toCharArray();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < cStr.length; i++) {
            Map<Character,Integer> map = new HashMap<>();
            for (int j = i; j < cStr.length; j++) {
                if(!map.containsKey(cStr[j])){
                    map.put(cStr[j],1);
                }else {
                    list.add(map.size());
                    break;
                }
            }
            list.add(map.size());
        }
        return list.stream().max(Comparator.naturalOrder()).get();
    }
}

