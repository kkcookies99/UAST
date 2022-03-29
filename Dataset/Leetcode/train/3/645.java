 class Solution {
    public int XXX(String s) {
        List<Character> list = new LinkedList<>();
        int max=0, p;//max保存当前最长字串的长度 p保存 待插入元素在list中的位置
        for (int i = 0; i <s.length() ; i++) {
            char c=s.charAt(i);
            if((p=list.indexOf(c))!=-1){//待插入元素 已存在
                max = Math.max(list.size(),max);//从当前子串长度 和 之前 子串长度 中 找出 较大的一个
                for (int j = 0; j <=p; j++) list.remove(0);//移除p前面所有的元素(包括p)
            }
            list.add(c);
        }
        return Math.max(max,list.size());
    }

}

