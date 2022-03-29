     public boolean XXX(String s) {
         if (s == null || s.length() == 0) return true;
        s = s.toUpperCase().replaceAll("[^a-z|A-Z|0-9]", "");
        char[] array = s.toCharArray();
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            if (array[start] != array[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
code block

