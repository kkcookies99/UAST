 class Solution {
    public String XXX(int n) {
        String result = "1";

        if (n != 1) {
            for (int i = 1; i < n; i++) {
                int count = 0;
                char chari = result.charAt(0);
                String istr = "";

                for (int j = 0; j < result.length(); j++) {
                    char charj = result.charAt(j);
                    if (charj == chari) {
                        count++;
                    } else {
                        istr += count + String.valueOf(chari);
                        count = 1;
                        chari = charj;
                    }
                    if (j == result.length() - 1) {
                        istr += count + String.valueOf(chari);
                    }
                }

                result = istr;
            }
        }

        return result;
    }
}

