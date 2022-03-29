 public String XXX(String s, int numRows) {
        if (s == null || s.length() < 2 || numRows < 2) return s;
        StringBuilder[] builders = new StringBuilder[numRows];

        int index = 0;//索引到使用哪个builder
        int ctrl = -1;
        for (char c : s.toCharArray()) {
            if (builders[index] == null) builders[index] = new StringBuilder();
            builders[index].append(c);
            if (index == numRows - 1 || index == 0) ctrl = 0 - ctrl;
            index = index + ctrl;
        }

        for (int i = 1; i < numRows; i++) builders[0].append(builders[i] == null ? "" : builders[i]);
        return builders[0].toString();
    }


