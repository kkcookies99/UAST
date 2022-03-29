class Solution {
    public String XXX(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        int count = 1;
        while (count < n){
            sb = nextString(sb);
            count ++;
        }
        return sb.toString();
    }

    private StringBuilder nextString(StringBuilder sb){
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (int i = 0; i < sb.length(); i++) {
            count++;
            if (i == sb.length() - 1 || sb.charAt(i) != sb.charAt(i + 1)) {
                stringBuilder.append(count);
                stringBuilder.append(sb.charAt(i));
                count = 0;
            }
        }
        return stringBuilder;
    }
}

