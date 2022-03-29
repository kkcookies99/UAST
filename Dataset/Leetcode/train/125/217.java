     public boolean XXX(String s) {
        // 全部转换为大写
        s = s.toUpperCase();
        // 双指针移动
        int i = 0, j = s.length() - 1;
        while (i < j) {
            // 是否需要跳过本次循环
            boolean flag = false;
            // 如果头指针不是字母或者数字，移动头指针
            if (isOk(s.charAt(i))) {
                i++;
                flag = true;
            }
            // 如果尾指针值不是字母或者数字，移动尾指针
            if (isOk(s.charAt(j))) {
                j--;
                flag = true;

            }
            if (flag)
                continue;
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }

        }
        return true;
    }

    public boolean isOk(char c) {
        // c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' ? false : true; 无需判断是否为小写字母，因为已经全部转换/成大写了
        return c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' ? false : true;
    }

