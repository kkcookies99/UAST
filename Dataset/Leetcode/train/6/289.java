  public String XXX(String s, int numRows) {
        if (s.length() == 1 || numRows == 1) {
            return s;
        }
        int flag = -1;
        int k = 1;
        List<StringBuilder> reList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            reList.add(new StringBuilder());
        }
        for (int i = 0; i < s.length(); i++) {
            if (flag == 0) {
                k = 1;
            } else if (flag == numRows - 1) {
                k = -1;
            }
            flag += k;
            reList.get(flag).append(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (StringBuilder stringBuilder : reList) {
            sb.append(stringBuilder);
        }
        return sb.toString();
    }

