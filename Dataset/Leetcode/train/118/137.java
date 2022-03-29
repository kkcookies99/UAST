 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        // 行数为 1 ，直接返回[[1]]
        if (numRows == 1) {
            ArrayList inner = new ArrayList();
            inner.add(1);
            result.add(inner);
            return result;
        }
        // 主体算法
        generator(numRows, 1, 0, result);
        return result;
    }

    private void generator(int numRows, int count, int r, List<List<Integer>> result) {
        // 退出条件
        if (count > numRows || numRows <= 0) {
            return;
        }
        // 创建当前行（观察可知杨辉三角每行的元素是回文数，所以用定长数组方便后半部分赋值）
        Integer[] row = new Integer[count];
        if (count - 1 == 0) {
            row[0] = 1;
        } else {
            // 求中间索引位置
            int mid = r / 2;
            // 初始化当前值所对应的上一行的左值
            int lv = 0;
            // 初始化当前值所对应的上一行的右值
            int rv = 0;

            for (int i = 0; i <= mid; i++) {
                if (i - 1 >= 0) {
                    lv = result.get(count - 2).get(i - 1);
                    rv = i > count - 1 ? 1 : result.get(count - 2).get(i);
                    row[i] = lv + rv;
                    // 因为是回文数所以右侧直接赋值即可
                    row[r - i] = row[i];
                } else {
                    row[i] = 1;
                    row[r - i] = row[i];
                }
            }
        }
        result.add(Arrays.asList(row));
        // 递归计算下一行数据
        generator(numRows, count + 1, count, result);
    }
}

