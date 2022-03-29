 public int XXX(int m, int n) {
    dfs(0, 0, m - 1, n - 1);
    return result;
}

void dfs(int line, int column, int m, int n) {
    // 递归跳出
    if (line > m || column > n) {
        return;
    }
    if (line == m && column == n) {
        result++;
        return;
    }
    // 向下遍历
    dfs(line + 1, column, m, n);
    // 向右遍历
    dfs(line, column + 1, m, n);
}

