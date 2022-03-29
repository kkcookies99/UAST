 public boolean XXX(int x) {
        String xStr = String.valueOf(x);
        int mid = xStr.length() / 2;
        for (int i = 0, j = xStr.length() - 1; i <= mid && j > i; i++, j--) {
            if (xStr.charAt(i) != xStr.charAt(j)) {
                return false;
            }
        }
        return true;


        // if (x < 0) {
        //     return false;
        // }
        // String xStr = String.valueOf(x);
        // return xStr.equals(new StringBuilder(xStr).reverse().toString());

        // List<Integer> list = new ArrayList<Integer>();
        // while (x > 0) {
        //     list.add(x % 10);
        //     x /= 10;
        // }
        // Integer[] arr = list.toArray(new Integer[list.size()]);
        // int mid = arr.length / 2;
        // for (int i = 0, j = arr.length - 1; i <= mid && j > i; i++, j--) {
        //     if (!arr[i].equals(arr[j])) {
        //         return false;
        //     }
        // }
        // return true;
    }

