 public String XXX(String s, int numRows) {
    if (numRows == 1) {
        return s;
    }

    StringBuffer sb = new StringBuffer();
    // 层数
    int floorNum = 0;
    // 每层的下标位置
    int i = 0;
    // 对应原字符串的实际位置
    int n = 0;
    while (true) {
        if (floorNum == 0) {
            n = i * (2 * numRows - 2);
        } else if (floorNum == numRows - 1) {
            n = floorNum + i * (2 * numRows - 2);
        } else {
            if (i % 2 == 0) {
                n = floorNum + (i / 2) * (2 * numRows - 2);
            } else {
                n = numRows * 2 - floorNum - 2 + ((i - 1) / 2) * (2 * numRows - 2);
            }
        }

        // 已越界，跳到下一层
        if (n >= s.length()) {
            i = 0;
            floorNum++;
            if (floorNum > numRows - 1) {
                break;
            } else {
                continue;
            }
        }

        sb.append(s.charAt(n));
        i++;
    }

    return sb.toString();
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


