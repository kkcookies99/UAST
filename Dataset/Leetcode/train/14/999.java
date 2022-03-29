 public String XXX(String[] strs) {
        int[] min=minL(strs);
        String maxfore=strs[min[0]];//假设数组中最短字符串为最长前缀，以它为基准
     //纵向扫描
        for (int j=0;j<min[1];j++) {
            char c=maxfore.charAt(j);
            for (int i = 0; i < strs.length; i++) {
                if (c!=strs[i].charAt(j)){
                    return maxfore.substring(0,j);
                }
            }
        }
       return maxfore;
    }
//先找到字符串数组中最短长度的字符串
    public int[] minL(String[] strs) {
        //a[0]为最短字符串的下标,a[1]为最短字符串的长度
        int[] a={0,strs[0].length()};
        for (int i=1; i < strs.length; i++) {
            int length = strs[i].length();
            if (a[1]>=length){
                a[1]=length;
                a[0]=i;
            }
        }
        return a;
    }

