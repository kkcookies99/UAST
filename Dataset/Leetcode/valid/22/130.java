     public List<String> XXX(int n) {
        List<String> ans = new ArrayList();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    /**
     * 解题思路：根据题意，我们需要找出满足()形式的组合，第一想法是遍历出所有情况，然后再一个个验证，也就是有2^2n种可能
     *
     * 但是明显这样效率太低，我们可以想想哪些才是符合条件的，比如第一个肯定得是'('，第二个可以是）,也可以是'('
     *
     * 如果第二个是）,那么第三个只能是'(',因为"())"明显错误
     *
     * 所以我们可以总结出，当'('和')'出现次数相同时，下一个只能是(,当'('多于')'时，下一个可以是'(',也可以是')'
     *
     * 因此我们在写递归的时候，就把这两个条件加进去就可以
     */
    public void backtrack(List<String> ans, String cur, int open, int close, int max){
        //当拼接的字符串为最大值的两倍时，说明拼接完成
        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }
        //只要拼接‘（’的数量小于最大值，就继续拼接‘（’
        if (open < max) {
            backtrack(ans, cur+"(", open+1, close, max);
        }
        //只要‘）’的数量小于‘（’的数量，就继续拼接‘）’
        if (close < open) {
            backtrack(ans, cur+")", open, close+1, max);
        }
    }

