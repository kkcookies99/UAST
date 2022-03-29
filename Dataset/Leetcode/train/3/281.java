     public int XXX(String s) {
        int[] last = new int[128];
        
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res = Math.max(res, i - last[s.charAt(i)]);
            last[s.charAt(i)] = i;
        }

        return res;
    }

