 class Solution {
    public String XXX(String s) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                for (int k = i, l = j; k <= l; k++, l--) {
                    if (chars[k] != chars[l]) {
                        break;
                    }
                    if (k == l || (k + 1) == l) {
                        hm.put(i, j);
                    }
                }
            }
        }
        Set<Integer> set = hm.keySet();
//        for (Integer integer : set) {
//            System.out.println(integer + "-" + hm.get(integer));
//        }
        int max = 0;
        for (Integer integer : set) {
            if (max < (hm.get(integer) - integer)) {
                max = hm.get(integer) - integer;
            }
        }
        char[] ch = new char[max + 1];
        for (Integer integer : set) {
            if ((hm.get(integer) - integer) == max) {
                for (int i = integer, j = 0; i <= hm.get(integer); i++, j++) {
                    ch[j] = chars[i];
                }
                return new String(ch);
            }
        }
        return s.charAt(0) + "";
    }
}

