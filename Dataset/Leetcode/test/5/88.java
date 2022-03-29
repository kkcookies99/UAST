 public String XXX(String s) {
            if (s == null || s.length() == 0)
                return "";
            int maxLen = 0;
            String maxStr = "";
            for (int i = 0; i < s.length(); i++)
                for (int j = i; j < s.length(); j++)
                    if (inspect(s, i, j) && j - i + 1 > maxLen) {
                        maxLen = j - i + 1;
                        maxStr = s.substring(i, j + 1);
                    }
            return maxStr;
        }
        
       private boolean inspect(String s, int l, int r) {
            if (r - l == 0)
                return true;
            while (l < r)
                if (s.charAt(l++) != s.charAt(r--))
                    return false;

            return true;
        }


