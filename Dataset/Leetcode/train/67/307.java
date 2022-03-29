 public String XXX(String a, String b) {
    if (a == null || a.length() == 0) return b;
    if (b == null || b.length() == 0) return a;

    StringBuilder sb = new StringBuilder();
    int a_idx = a.length() - 1;
    int b_idx = b.length() - 1;
    int tag = 0;

    while (a_idx >= 0 || b_idx >= 0) {
        int x = a_idx >= 0 ? a.charAt(a_idx) - '0' : 0;
        int y = b_idx >= 0 ? b.charAt(b_idx) - '0' : 0;

        int sum = x + y + tag;
        tag = sum / 2;
        sb.append(sum % 2);

        if (a_idx >= 0) a_idx--;
        if (b_idx >= 0) b_idx--;
    }

    if (tag > 0) {
        sb.append(tag);
    }
    return sb.reverse().toString();
}

