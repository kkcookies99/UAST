    public String XXX(String[] strs) {
        // 数组长度
        int len = strs.length;
        // 用于保存结果
        StringBuffer res = new StringBuffer();
        // 注意：=是赋值，==是判断
        if (strs == null || strs.length == 0) {
            return "";
        }
        // 给字符串数组的元素按照升序排序(包含数字的话，数字会排在前面)
        Arrays.sort(strs);
        int m = strs[0].length();
        int n = strs[len - 1].length();
        int num = Math.min(m, n);
        for (int i = 0; i < num; i++) {
            if (strs[0].charAt(i) == strs[len - 1].charAt(i)) {
                res.append(strs[0].charAt(i));
            } else
                break;

        }
        return res.toString();

    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

