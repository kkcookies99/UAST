     public List<List<Integer>> XXX(int numRows) {
        // 初始化基础杨辉三角 边长为2
        List<Integer> one = new ArrayList<>() {{
            add(1);
        }};
        List<Integer> two = new ArrayList<>() {{
            add(1);
            add(1);
        }};

        if (numRows == 0) {
            return new ArrayList<>();
        } else if (numRows == 1) {
            return new ArrayList<>() {{
                add(one);
            }};
        } else if (numRows == 2){
            return new ArrayList<>() {{
                add(one);
                add(two);
            }};
        } else {
            // 如果边长大于3
            List<List<Integer>> ans = new ArrayList<>() {{
                add(one);
                add(two);
            }};
            // 计算每一层
            for (int i = 2; i < numRows; i++) {
                // 首位1
                List<Integer> tmp = new ArrayList<>() {{
                    add(1);
                }};
                for (int j = 1; j < i; j++) {
                    tmp.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
                }
                // 尾部1
                tmp.add(1);
                // 放入容器 完成这一层
                ans.add(tmp);
            }
            return ans;
        }
    }

