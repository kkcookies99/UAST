public int XXX(int x) {
    String s = String.valueOf(x);
    // 判断是否为负数
    boolean isNegative = false;
    if(s.charAt(0) == '-') {
        isNegative = true;
        s = s.substring(1);
    }
    // 数字反转
    s = new StringBuilder(s).XXX().toString();
    s = isNegative ? "-" + s : s;
    int result = 0;
    try {
        // 数字转换
        result = Integer.parseInt(s);
    } catch (Exception e) {

    }
    return result;
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

