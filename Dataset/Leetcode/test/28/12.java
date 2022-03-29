     public int XXX(String haystack, String needle) {
        if ("".equals(needle)) {
            return 0;
        }
        int i = 0;
        boolean flag = false;
        while (i < haystack.length()) {
            // 匹配到第一个相同的字符，且剩余长度大于 needle 的长度
            if (haystack.charAt(i) == needle.charAt(j) && haystack.length() - i + 1 > needle.length()) {
                String tmp = haystack.substring(i, i + needle.length());
                if (tmp.equals(needle)) {
                    flag = true;
                    break;
                }
            }
            i++;
        }
        return flag ? i : -1;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

