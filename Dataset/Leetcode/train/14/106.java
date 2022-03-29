 public String XXX(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String str = strs[i];
            if (prefix.length() < str.length()) {
                if (str.startsWith(prefix)) {
                    continue;
                }
            } else {
                if (prefix.startsWith(str)) {
                    prefix = str;
                    continue;
                }
                String temp = prefix;
                prefix = str;
                str = temp;
            }

            int subLength = prefix.length();
            while (subLength > 0) {
                if (str.startsWith(prefix.substring(0, subLength))) {
                    prefix = prefix.substring(0, subLength);
                    break;
                }
                subLength--;
            }
            if (subLength == 0 && !str.startsWith(prefix)) return "";

        }
        return prefix;
    }

