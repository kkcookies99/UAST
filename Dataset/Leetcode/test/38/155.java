class Solution {

    static {
        pre();
    }
    
    private static List<String> list = new ArrayList<>(30);

    public static void pre() {
        StringBuilder stringBuilder = new StringBuilder("1");
        list.add("1");
        for (int i = 1; i < 30; i++) {
            // 上一个字符
            String lastStr = stringBuilder.toString();
            stringBuilder.delete(0, stringBuilder.length());
            int count = 1;
            char lastC = lastStr.charAt(0);
            for (int j = 1; j < lastStr.length(); j++) {
                char c = lastStr.charAt(j);
                if (c != lastC) {
                    stringBuilder.append(count).append(lastC);
                    count = 1;
                    lastC = c;
                } else {
                    count++;
                }
            }
            stringBuilder.append(count).append(lastC);
            list.add(stringBuilder.toString());
        }
    }

    public String XXX(int n) {
        return list.get(n - 1);
    }
}
