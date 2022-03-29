     public String XXX(String s, int numRows) {
        if (s.length() == 1 || numRows == 1) {
            return s;
        }
        String[] strings = new String[numRows];

        for (int i = 0; i < numRows; i++) {
            strings[i] = "";
        }

        String str = "";
        for (int i = 0; i < s.length(); i++) {
            int row = i % (2 * numRows - 2);
            row = row < numRows ? row : 2 * (numRows - 1) - row;
            strings[row] += s.charAt(i) + "";
        }

        for (String string:strings) {
            str += string;
        }

        return str;
    }

