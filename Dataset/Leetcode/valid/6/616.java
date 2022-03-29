  public String XXX(String s, int numRows) {
         if (s.length() < 3|| numRows == 1) {
            return s;
        }
              StringBuffer str = new StringBuffer();
        //单个组的char字符数
        int teamSize = 2 * numRows - 2;
        int length = s.length();
        //组数量
        int teamNumber = length % teamSize == 0 ? length / teamSize : length / teamSize + 1;
          for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < teamNumber; j++) {
                if (i + j * teamSize < s.length()) {
                    str.append(s.charAt(i + j * teamSize));
                    if (i > 0 && i < numRows - 1 && (j + 1) * teamSize - i < s.length()) {
                        str.append(s.charAt(j * teamSize + teamSize - i));
                    }
                }
            }
        }
        return str.toString();
    }

