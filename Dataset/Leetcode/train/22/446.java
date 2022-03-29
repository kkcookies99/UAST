 class Solution {
    public List<String> XXX(int n) {
        List<String> res = new ArrayList<>();
        dfs(n, new char[2*n], 0, 2 * n, res, 0, 0);
        return res;
    }

    // left : 左括号个数
    // right: 右括号个数
    // 用这个来减枝
    private void dfs(int n ,char[] currentStr, int currentHeight, int totalHeight, List<String> res, int left, int right) {
        // 减枝
        if (left > n || right > n) {
            return;
        }
        
        if (currentHeight >= totalHeight) {
            // 校验是否匹配
            int balance = 0;
            for (char ch: currentStr) {
                if (ch == '(') {
                    balance++;
                } else {
                    balance--;
                }

                if (balance < 0) {
                    break;
                }
            }

            if (balance == 0) {
                res.add(new String(currentStr));
            }

        } else {
            // 加入可行解
            currentStr[currentHeight] = '(';
            dfs(n, currentStr, currentHeight + 1, totalHeight, res, left + 1, right);
            currentStr[currentHeight] = ')'; // 回朔, 增加第二个可行解
            dfs(n, currentStr, currentHeight + 1, totalHeight, res, left, right + 1);
        }
    }
}


