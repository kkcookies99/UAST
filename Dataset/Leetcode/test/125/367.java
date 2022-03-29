 class Solution {
    public boolean XXX(String s) {
        char[] arr = s.toCharArray();
        // 对撞指针
        int l = 0, r = s.length() - 1;
        while (l < r) {
            while (numCharCheck(arr, l)) {
                l++;
                // 如果全是非数字字母，直接返回false
                if (l == r + 1) {
                    return true;
                }
            }
            while (numCharCheck(arr, r)) {
                r--;
            }
            if (arr[l] != arr[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    /**
     * 检查是否是数字或者大小写字母
     * 同时将大写字母转换成小写字母
     * @param idx 索引
     * @return 是数字或者大小写字母返回false
     */
    private boolean numCharCheck(char[] arr, int idx) {
        // 是数字
        if (arr[idx] >= 48 && arr[idx] <= 57) {
            return false;
        }
        // 是大写字母
        if (arr[idx] >= 65 && arr[idx] <= 90) {
            // 转换成小写字母
            arr[idx] += 32;
            return false;
        }
        // 是小写字母
        if (arr[idx] >= 97 && arr[idx] <= 122) {
            return false;
        }
        return true;
    }
}

