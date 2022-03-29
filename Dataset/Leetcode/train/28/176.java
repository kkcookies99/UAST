 class Solution {
    public int XXX(String haystack, String needle) {
        char[] ori = haystack.toCharArray(),
               match = needle.toCharArray();
        int len1 = ori.length,len2 = match.length;
        if(len2 == 0) return 0;
        int[] ne = new int[len2];
        for(int i = 0,j = 1;j < len2;j++){
            while(i != 0 && match[i] != match[j]) i = ne[i - 1];
            if(match[i] == match[j]) ++i;
            ne[j] = i;
        }
        for(int i = 0,j = 0;j < len1;j++){
            while(i != 0 && match[i] != ori[j]) i = ne[i - 1];
            if(match[i] == ori[j]) ++i;
            if(i == len2)
                return j - i + 1;
        }
        return -1;
    }
}

