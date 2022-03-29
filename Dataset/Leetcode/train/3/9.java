 class Solution {
    public int XXX(String s) {
        StringBuilder sb = new StringBuilder();
        LinkedHashSet<String> list = new LinkedHashSet<>();
        int j = -1;
        for (int i = 0; i < s.length(); i++) {
            String str = sb.toString();
            String sign = s.substring(i, i + 1);
            if (str.indexOf(sign) == -1) {
                sb.append(sign);
            } else {
                sb.replace(0, sb.length(), "");
                i = ++j;
            }
            list.add(sb.toString());
        }
        // list.removeIf(str -> !StringUtils.hasLength(str));
        // System.out.println("字符串《" + s + "》的无重复字符的子串:");
        // list.forEach(s1 -> System.out.print(s1 + ","));
        int longest = 0;
        for (String str : list
        ) {
            longest = str.length() > longest ? str.length() : longest;
        }
        // System.out.print("\n最长的子串长度为" + longest + ":\t");
        // for (String str : list
        // ) {
        //     if (longest == str.length())
        //         System.out.print(str + "|" + str.length() + "\t");
        // }
        return longest;
    }
}

