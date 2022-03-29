 class Solution {
    public int XXX(String haystack, String needle) {
        if(null==needle   || needle.length()==0)    return 0;
        if(null==haystack || haystack.length()==0)  return -1;
        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
        to: for (int i = 0; i <h.length-n.length+1; i++) { //要避免里层for的h索引越界
            for (int j = 0; j <n.length ; j++) {           //从h[i]开始，依次比较h和n的每个字符
                if (h[i+j]!=n[j])
                continue to;                               //只要发现不同，就停止比较，跳到h[i+1]
            }
            return i;                                      //h[i]后面的字符和n全部相同才会返回i
        }
        return -1;                                         //h[i]比较结束没有相同的，返回-1；
    }
}

