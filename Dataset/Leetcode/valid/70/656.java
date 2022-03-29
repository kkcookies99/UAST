 public int XXX(int n) {
         if (n == 1){
            return 1;
        }else if (n == 2){
            return 2;
        }
        int[] max = new int[n];

        max[0] = 1;
        max[1] = 1;

        for (int i = 2; i < n; i++) {
             max[i] = max[i - 1] + max[i - 2];
        }

        int res = 0;
        for (int i = n - 2; i < max.length; i++) {
            res += max[i];
        }

        return res;
    }

