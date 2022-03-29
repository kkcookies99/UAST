public int[][] XXX(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
//        不排序，直接遍历列表
        for (int[] i : intervals) {
            for (int j = 0; j < res.size(); j++) {
//                将每一个结果集中的区间 re 与当前区间 i 进行比较，区间连续就合并 re 到当前区间 i
                int[] re = res.get(j);
//                三种相交的情况：
//                      i=[1,3],re=[2,4] 包括 i=[1,4],re=[2,3] 这种情况
//                      i=[2,4],re=[1,3]
//                      i=[2,3],re=[1,4]
                if (re[0] <= i[1] && re[0] >= i[0]) {
                    i[1] = re[1] > i[1] ? re[1] : i[1];
                } else if (re[1] <= i[1] && re[1] >= i[0]) {
                    i[0] = re[0];
                } else if (re[1] > i[1] && re[0] < i[0]) {
                    i = re;
                } else {
//                    当前区间与结果集不连续
                    continue;
                }
//                当前区间 i 与结果集区间 re 连续 -> 结果集的区间 re 已经被合并到当前区间 i ，从结果集中删除 re
                res.remove(re);
                j--;
            }
//            将当前区间添加到结果集
            res.add(i);
        }

        return res.toArray(new int[0][]);
    }

