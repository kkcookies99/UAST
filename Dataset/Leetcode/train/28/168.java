 class Solution {
    public int XXX(String haystack, String needle) {
        if (haystack == null || needle == null) return 0;

        char[] target = haystack.toCharArray();
        char[] index = needle.toCharArray();

        int i = 0;
        int j = 0;
        while (i < target.length && j < index.length){
            if (target[i] == index[j]){
                i++;
                j++;
            }else {
                i = i - j + 1;
                j = 0;
            }
        }

        if (j == index.length){
            return i - j;
        }else{
            return -1;
        }
    }
}

