 class Solution {
    public List<String> XXX(int n) {
        char[] ch = new char[n * 2];
        List<String> result = new LinkedList<>();
        perm(ch, 0, 0, result);

        return result;
    }

    /**
     * 递归的思路，就是从左拼到右。每次拼一个位置，都把2种可能性拼好，再递归拼后面的。
     * 当然为了效率，不可能的组合就提前退出。
     *
     * 先定义一个char[]，l(eft)和r(ight)2个整数表示目前使用的括号数量。r括号是不能大于l的。
     *
     * 刚进入方法，l和r都是0。此时只能拼一个(，接着递归拼后面的时候，可能出现(和)，因此2种可能都递归一下。
     * 以此类推的递归下去。
     *
     * 递归退出的条件，就是l和r刚好用完。
     *
     * @param ch
     * @param l
     * @param r
     * @param result
     */
    private void perm(char[] ch, int l, int r, List<String> result) {
        if (l > ch.length / 2 || r > ch.length / 2) {
            return;
        }
        if (l + r >= ch.length) {
            result.add(new String(ch));
        } else {
            ch[l + r] = '(';
            perm(ch, l + 1, r, result);

            if (l > r) {
                ch[l + r] = ')';
                perm(ch, l, r + 1, result);
            }
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

