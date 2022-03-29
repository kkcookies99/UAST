     public int XXX(String haystack, String needle) {
        if(needle == null || needle.length() == 0) return 0;
        int n1 = haystack.length();
        int n2 = needle.length();
        int[] next = new int[n2];
        getNext(next,needle);
        int i = 0, j = 0;
        while (i < n1) {
            if(j == -1 || haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }
            else j = next[j];
            if(j == n2) return i-n2;
        }
        return -1;
    }
    public void getNext(int [] next, String t){
        //找到每个字符的前一个匹配位置
        int k = -1;
        int j = 0;
        next[0] = -1;
        while (j < t.length()-1) {
            if(k == -1 || t.charAt(k) == t.charAt(j)) {
                k++;
                j++;
                next[j] = k;
            }
            else k = next[k];
        }
        getNextVal(next,t);
    }

    private void getNextVal(int[] next, String t) {
        for (int i = 2; i < next.length; i++) {
            if(t.charAt(i) == t.charAt(next[i])) next[i] = next[next[i]];
        }
    }

