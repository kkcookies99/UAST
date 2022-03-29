 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> fir = new ArrayList<>();
        fir.add(1);
        list.add(fir);
        if (numRows == 1) return list;
        List<Integer> sec = new ArrayList<>();
        sec.add(1);
        sec.add(1);
        list.add(sec);
        if (numRows == 2) return list;

        for (int i = 3; i <= numRows; i++) {
            List<Integer> sub = new ArrayList<>();
            for (int k = 0; k < i; k++)
                sub.add(1);
            List<Integer> pre = list.get(i-2);
            int flag = 0;
            if (i % 2 == 0) flag = i / 2; // 偶数行
            else flag = i / 2 + 1; // 奇数行
            for (int j = 2; j <= flag; j++) {
                sub.set(j-1, pre.get(j-2) + pre.get(j-1));
                sub.set(i-j, pre.get(j-2) + pre.get(j-1));
            }
            list.add(sub);
        }
        return list;
    }
}

