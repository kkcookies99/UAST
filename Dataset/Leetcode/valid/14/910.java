 public String XXX(String[] strs) {
    String pre = strs[0];
    int end = strs[0].length();
    for (int i = 1; i < strs.length; i++) {
        while(!strs[i].startsWith(pre)) {
            end = end - 1;
            pre = pre.substring(0, end);
        }
    }
    return pre;
}
