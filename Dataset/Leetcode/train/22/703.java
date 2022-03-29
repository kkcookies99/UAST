 class Solution {
    public List<String> XXX(int n) {

        List<String> resultList = new ArrayList<>();
        if (n == 0) {
            return resultList;
        }

        Stack<String> stack = new Stack<>();
        dfs(stack, 0, 0, n, resultList);
        return resultList;
    }

    private void dfs(Stack<String> stack, int lefCnt, int rightCnt, int n, List<String> resultList) {
        if (stack.size() == n * 2) {
            resultList.add(String.join("", stack));
            stack.pop();
            return;
        }
        if (lefCnt < n) {
            stack.push("(");
            dfs(stack, lefCnt + 1, rightCnt, n, resultList);
        }
        if (rightCnt < n && lefCnt > rightCnt) {
            stack.push(")");
            dfs(stack, lefCnt, rightCnt + 1, n, resultList);
        }

        if (!stack.isEmpty()) {
            stack.pop();
        }
    }
}

