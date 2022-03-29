 class Solution {
    public List<String> XXX(int n) {

        // 结果集
        List<String> results = new ArrayList<>();

        int chars =  2 * n;
        
        build(0, chars, n, "", 0, results);
        build(1, chars, n, "", 0, results);

        return results;
    }

    // cur = 1 , 当前为  ）
    // cur = 0 , 当前为 （
    public void build(int cur, int chars, int n, String curStr, int stackNum, List<String> results) {

        if(chars == 0 || curStr == null) {
            curStr = null;
            return;
        }

        // 无可用的(,退出
        if(cur == 1 && stackNum == 0) {
            curStr = null;
            return;
        } else if(cur == 1 && stackNum > 0) { // 有可用的（，配对
            curStr = curStr + ")";
            stackNum--;
            if(--n == 0 ) {
                results.add(curStr);
                curStr = null;
                return;
            }
        } else if(cur == 0 && stackNum < n) { // (数目未超限，入栈，等待配对
            curStr = curStr + "(";
            stackNum++;
        } else {
            curStr = null;
            return;
        }

        if(chars-- > 0) {
            build(0, chars, n, curStr, stackNum, results);
            build(1, chars, n, curStr, stackNum, results);
        }
        return;
    }
}

