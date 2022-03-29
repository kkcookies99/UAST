public int XXX(int x) {
       if (x == 0) return 0;
        int zeroCount = 0, temp = x;
        while (temp / 10 > 0) {
            temp /= 10;
            zeroCount++;
        }
        int max = zeroCount % 2 == 1 ? 10 : 4;
        int min = zeroCount % 2 == 1 ? 3 : 1;
        zeroCount /= 2;
        for (int i = 0; i < zeroCount; i++) {
            max *= 10;
            min *= 10;
        }
        while (max - min > 1) {
            int a = (max - min) / 2 + min;
            if (x / a == a) return a;
            else if (x / a > a) min = a;
            else max = a;
        }
        return min;
    }

