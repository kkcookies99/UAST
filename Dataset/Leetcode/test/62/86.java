 public int XXX(int m, int n) {
        int[] steps = new int[n];
        for (int i = 0; i < n; i++) {
            steps[i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                steps[j] = steps[j - 1] + steps[j];
            }
        }

        return steps[n - 1];
    }

