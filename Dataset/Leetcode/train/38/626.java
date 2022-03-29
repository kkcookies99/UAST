 class Solution {
    public String XXX(int n) {
        if (n == 1){
            return "1";
        }
        String[] str = new String[n + 1];
        str[1] = "1";
        for (int i = 2; i <= n; i++) {
            str[i] = describe(str[i-1]);
        }
        return str[n];
    }

    private String describe(String input){
        // 用双指针的方式分割组
        int left = 0;
        int right = 0;
        int len = input.length();
        StringBuilder sb = new StringBuilder();
        while (left < len){
            int count = 0;
            char current = input.charAt(left);
            while (right < len && current == input.charAt(right)){
                count++;
                right++;
            }
            sb.append(count);
            sb.append(current);
            left = right;
        }
        return sb.toString();
    }
}

