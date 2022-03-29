 class Solution {
    public int XXX(String haystack, String needle) {
      int a = haystack.length();
        int b = needle.length();
        if(b==0) return 0;
        if(b>a) return -1;
        char target = needle.charAt(0);
        char[] haychars = haystack.toCharArray();
        for (int i =0;i<=a-b;i++){
            if (haychars[i] == target){
                if (haystack.substring(i,i+b).equals(needle)) return i;
            }
        }
        return -1;
    }
}

