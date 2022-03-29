     public boolean XXX(String s) {

        if (null == s || s.length() < 2) {
            return true;
        }

        int left = 0;
        int right = s.length() - 1;

        char[] chars = s.toCharArray();

        while (left < right) {
            if (!Character.isLetterOrDigit(chars[left])) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(chars[right])) {
                right--;
                continue;
            }

            if (Character.toLowerCase(chars[left]) != Character.toLowerCase(chars[right])) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

