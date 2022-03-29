 class Solution {
    public boolean XXX(String s) {
       if ( s.length() % 2 != 0)
            return false;
        Deque<Character> left = new LinkedList<>();//栈结构(本质上是双端队列)
        char[] cache1  = {'[','{','('};
        char[] cache2  = {']','}',')'};

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            int index = find(temp, cache1);
            if (index != -1){
                left.push(cache2[index]);//将需要匹配的字符按顺序压入栈
            }else {
                if (left.isEmpty() || left.pop() != temp)//如果没有需要的字符，或者字符不匹配那么直接返回false
                    return false;
            }
        }     
        return left.isEmpty();//如果还剩余没有匹配的字符那么返回false,否则返回true

    }
    private int find(char des ,char[] chars){
        for(int i = 0 ; i < chars.length ; i++){
            if (des == chars[i])
                return i;
        }
        return -1;
    }
}

