         public String XXX(String[] strs) {
            if (strs.length == 0) {
                return "";
            }
            if (strs.length == 1) return strs[0];
            String result = strs[0];
            for (int i = 1; i < strs.length; i++) {
                if("".equals(result)) return "";
                if (i == strs.length - 1 && strs[i].startsWith(result)) {
                    return result;
                }
                if (!strs[i].startsWith(result)) {
                    result = result.substring(0, result.length() - 1);
                    i--;
                }
            }
            return result;
        }

