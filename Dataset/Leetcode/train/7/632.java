     public int XXX(int x) {
        int XXXNums = 0;
        while (x != 0) {
            if (XXXNums > (Integer.MAX_VALUE/10) || XXXNums <(-(Integer.MAX_VALUE+1)/10)) {
                return 0;
            }
            XXXNums *= 10;
            XXXNums = XXXNums + (x % 10);
            x = x / 10;
        }
        return XXXNums;
    }

