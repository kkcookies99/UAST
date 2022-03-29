public String XXX(int n) {
    String newStr = "1";
    if (n == 1) {
        return newStr;
    }
    return this.itea(newStr, 2, n).toString();
}

public StringBuilder itea(String str ,int curCount , int maxCount) {
    String multiStr = "";
    StringBuilder newStr = new StringBuilder("");
    int start = 0,end = 0;
    while (end < str.length() + 1) {
        if (start == end) {
            end++;
            multiStr = String.valueOf(str.charAt(start));
        }
        if (end >= str.length()) {
            newStr.append ((end - start)).append(multiStr);
            end++;
            continue;
        }
        if (multiStr.equals(String.valueOf(str.charAt(end)))) {
            end++;
            continue;
        } else {
            newStr.append ((end - start)).append(multiStr);
            multiStr = String.valueOf(str.charAt(end));
            start = end;
            end++;
        }
    }
    curCount++;
    if (curCount <= maxCount) {
        newStr = this.itea(newStr.toString() , curCount ,maxCount);
    }
    return newStr;
}

