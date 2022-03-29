     public String XXX(String s, int numRows) {
        int m = s.length();
        if (m == 1 || numRows == 1 || m <= numRows){
            return s;
        }
        String res = "";

        for (int i = 0; i < numRows; i++) {
            int j = i;
            res += (""+s.charAt(j));
            int cs = (numRows - i - 1) * 2;
            int sum = (numRows - 1) * 2;
            while (true){
                if (i != numRows - 1){
                    if (j + cs >= m){
                        break;
                    }
                    j += cs;
                    res +=(""+s.charAt(j));
                }
                if (i == 0){
                    continue;
                }
                if (j + (sum - cs) >= m ){
                    break;
                }
                j += (sum - cs);
                res +=(""+s.charAt(j));

            }
        }

        return res;
    }

