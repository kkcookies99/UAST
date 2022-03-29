     public List<List<Integer>> XXX(int numRows) {
        //生成dp数组
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> re = new ArrayList<>();
        re.add(1);
        res.add(re);
        if (numRows == 1) {
            return res;
        }
        //计算
        for (int i = 2; i <= numRows; i++) {
            //注意，数字是从1开始，而数组获取值是从0开始。
            List<Integer> pre = res.get(i - 1 - 1);
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            //填充首位
            for (int j = 0; j < pre.size() - 1; j++) {
                cur.add(pre.get(j) + pre.get(j + 1));
            }
            cur.add(1);
            res.add(cur);
        }
        return res;
    }

