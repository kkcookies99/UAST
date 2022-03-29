  public String XXX(String s) {
        int[] arr = new int[2];
        char[] chars = s.toCharArray();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int high = i, low = i;
            while (high < n - 1 && chars[i] == chars[high + 1]) {
                high++;
            }
            i = high;
            while (low - 1 >= 0 && high + 1 < n && chars[low - 1] == chars[high + 1]) {
                high++;
                low--;
            }
            if (high - low > arr[1] - arr[0]) {
                arr[0] = low;
                arr[1] = high;
            }
        }
        return s.substring(arr[0], arr[1] + 1);
    }

