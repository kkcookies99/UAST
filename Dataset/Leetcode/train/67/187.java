 class Solution {
    public String XXX(String a, String b) {
        String max = a.length() >= b.length() ? a : b;
        String min = a.length() >= b.length() ? b : a;

        Character[] maxChars = new Character[max.length()];
        Character[] minChars = new Character[min.length()];
        for (int i = 0; i < max.length(); i++) {
            maxChars[i] = max.charAt(max.length() - i -1);
        }
        for (int i = 0; i < min.length(); i++) {
            minChars[i] = min.charAt(min.length() - i -1);
        }

        int idx = 0;
        int off = 0;
        String out = "";
        do {
            String minTemp = "0";
            String maxTemp = "0";
            if (idx < min.length()) minTemp = minChars[idx]+"";
            if (idx < max.length()) maxTemp = maxChars[idx]+"";
            int intTemp = Integer.parseInt(maxTemp) + Integer.parseInt(minTemp) + off;
            if (intTemp == 0) {
                out += "0";
                off = 0;
            } else if (intTemp == 1) {
                out += "1";
                off = 0;
            } else if (intTemp == 2) {
                out += "0";
                off = 1;
            } else if (intTemp == 3) {
                out += "1";
                off = 1;
            }
            idx++;
            if (idx == max.length()) {
                String outStr = "";
                for (int i = 0; i < out.length(); i++) {
                    outStr += out.charAt(out.length() - i -1)+"";
                }
                if (off == 1) {
                    return 1+outStr;
                } else {
                    return outStr;
                }
            }
        } while (true);
    }
}

