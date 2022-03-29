 class Solution {
    public int XXX(String s) {
        char[] chars = s.toCharArray();
        int max = 0;
        LinkedList<Character> linkedList = new LinkedList();
        for (int i = 0; i < chars.length; i ++) {
            //判断是否有重复元素
            if(linkedList.contains(chars[i])) {
                //移除元素
                this.remove(linkedList, chars[i]);
            }
            linkedList.addLast(chars[i]);

            //比较最大长度
            if(linkedList.size() > max) {
                max = linkedList.size();
            }
        }
        return max; 
    }

    //删除从开始到指定元素
    public void remove(LinkedList<Character> linkedList, char i) {
        Character remove = linkedList.removeFirst();
        if(!remove.equals(i)) {
            remove(linkedList, i);
        }
    }
}

