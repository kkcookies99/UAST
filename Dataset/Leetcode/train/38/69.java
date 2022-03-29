    public String XXX(int n) {
        if (n == 1) return "1";

        String previous = XXX(n - 1);
        StringBuilder builder = new StringBuilder();
        char a = previous.charAt(0);

        int count = 1;
        for (int j = 1; j < previous.length(); j++) {
            char c = previous.charAt(j);
            if (c == a) {
                count++;
            } else {
                builder.append(count).append(a);
                a = c;
                count = 1;
            }
        }
        builder.append(count).append(a);

        return builder.toString();
    }