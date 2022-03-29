 public int XXX(int x) {
        // 正负标识
        int flag = 1;
        if (x < 0) {
            flag = -1;
        }
        // 取绝对值
        x = x * flag;

        // 反转
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        // 反转后 int 溢出返回 0
        return (int)res != res ? 0 : (int)res * flag;
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


