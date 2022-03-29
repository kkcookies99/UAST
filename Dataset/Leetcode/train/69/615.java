public int XXX(int x) {
        if (x <= 0) return 0;
        int low = 1;
        int high = x;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x / mid == mid) return mid;
            else if (x / mid < mid) high = mid - 1;
            else low = mid + 1;
        }
        return high;
    }

