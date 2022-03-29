public int XXX(int x) {
        int left = 0;
        int right = 46340;
        int middle = 0;
        while (left <= right) {
            middle = (right + left) / 2;
            int temp = middle * middle;
            if (temp == x) {
                return middle;
            }
            if (temp > x) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        if (middle * middle > x) {
            return middle - 1;
        }
        return middle;
    }

