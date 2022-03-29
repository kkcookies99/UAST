 class Solution {
    public int XXX(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        int index = 0;//是haystack上的序号
        int[] next = getNext(needle);
        int j = 0;//j位于needle上从0开始比对
        while(index < haystack.length()){
            if(j == -1 || haystack.charAt(index) == needle.charAt(j)){
                j++;
                index++;
                if(j == needle.length()){//说明已经匹配到了
                    return index - j;
                }
            }else{
                j = next[j];
            }
        }
        return -1;
    }

    public int[] getNext(String s){
        int[] next = new int[s.length()];
        next[0] = -1;//next为前一个字符串的最长公共前后缀
        int index = 0;//从0开始
        int j = -1;
        while(index < s.length() - 1){//因为next[s.length() - 1]只需比对s.length - 2，所以使小于s.length() - 1
            if(j == -1 || s.charAt(index) == s.charAt(j)){
                j++;//当j为-1时，说明一个都没有相等或者处于起始位置，next[1] = 0,next[index] = 0;
                //当满足s.charAt(index) == s.charAt(j)，index后移，j后移，j赋值给next[index]
                index++;
                next[index] = j;
            }else{
                j = next[j];//不相等回退到前一个字符串最长的前缀部分的后一个位置
            }
        }
        return next;
    }
}

