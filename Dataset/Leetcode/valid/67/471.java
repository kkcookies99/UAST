class Solution {
    public String XXX(String a, String b) {
        // 将a设为较大一方
        if (a.length() < b.length()) {
            String flag = a;
            a = b;
            b = flag;
        }
        StringBuilder sbOne = new StringBuilder();
        for (int i = 0; i < a.length() - b.length(); i++) {
            sbOne.append(0);
        }
        // 将短b前补足0
        sbOne.append(b);
        b = sbOne.toString();
        StringBuilder sb = new StringBuilder();
        Integer berResult = 0;
        for (int i = a.length()-1; i >=0; i--) {
            Integer result = berResult + a.charAt(i) + b.charAt(i) - 96;
            berResult = result / 2;
            sb.append(result % 2);
        }
        if (berResult != 0) {
            sb.append(berResult);
        }
        return sb.reverse().toString();
    }
}

