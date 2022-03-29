 class Solution {
    public String XXX(String[] strs) {
        ArrayList<Integer> al = new ArrayList<>();
        char[] c1 = strs[0].toCharArray();
        if (strs.length == 1){
            return strs[0];
        }
        for (int j = 1; j < strs.length; j++) {
            int len2 = 0;
            char[] cn = strs[j].toCharArray();
            int lenmin = c1.length > cn.length ? cn.length : c1.length;
            for (int i = 0; i < lenmin; i++) {
                if (c1[i] != cn[i]) {
                    len2 = i;
                    break;
                }
                else {
                    len2= i+1;
                }
            }
            al.add(len2);
        }
        System.out.println(al);
        int min = 0;
        try {
            min = Collections.min(al);
        } catch (Exception e) {
            return "";
        }
        return strs[0].substring(0,min);
    }
}



