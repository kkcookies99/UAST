 class Solution {
    public List<String> XXX(int n) {
        ArrayList<String> list = new ArrayList<>();
        process("", n, n, list);
        return list;
    }

    /**
     * @param s 需要添加的字符串
     * @param num1 剩余的"("个数
     * @param num2 剩余的")"个数
     * @param list 容器
     */
    public void process(String s, int num1, int num2, ArrayList<String> list) {
        if (num1 > num2) return;
        if (num1 == 0 && num2 == 0) {
            list.add(s);
        }
        if (num1 > 0) {
            process(s + "(", num1 - 1, num2, list);
        }
        if (num2 > 0) {
            process(s + ")", num1, num2 - 1, list);
        }
    }
}

