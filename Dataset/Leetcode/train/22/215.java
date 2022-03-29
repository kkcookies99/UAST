 class Solution {
    public List<String> XXX(int n) {
        // 回溯法
        // 在遍历所有组合的过程中，可以利用以下信息：
        // (1) 在构建序列的过程中，如果左括号数量小于右括号，一定不合理，不用在这个分支上做遍历
        // 
        List<String> res = new ArrayList<String>();        
        this.backtrack(res, 0, 0, n, new StringBuilder(""));
        return res;
    }

    public void backtrack(List<String> res, int lt_num, int rt_num, int n, StringBuilder permutated) {
        if (n == lt_num && n == rt_num) {
            res.add(permutated.toString());
            return;
        }
        if (rt_num > lt_num) {
            return;
        }

        if (n != lt_num) {
            lt_num++;
            permutated.append('(');
            this.backtrack(res, lt_num, rt_num, n, permutated);
            permutated.deleteCharAt(lt_num + rt_num -1);
            lt_num--;
        }
        if (n != rt_num) {
            rt_num++;
            permutated.append(')');
            this.backtrack(res, lt_num, rt_num, n, permutated);
            permutated.deleteCharAt(lt_num + rt_num -1);
            rt_num--;
        }
    }

}

