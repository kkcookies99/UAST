    public String XXX(int n) {
        if (n == 1) {
            return "1";
        }
        String res = XXX(n - 1);
        return assemble(res);
    }
    
    private String assemble(String res) {
        char[] arr = res.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < arr.length) {
            int cnt = 0;
            int j = i;
            int base = arr[i];
            while (j < arr.length) {
                if (arr[j] == base) {
                    cnt++;
                } else {
                    i = j;
                    break;
                }
                i++;
                j++;
            }
            sb.append(cnt);
            sb.append(arr[j - 1]);
        }

        return sb.toString();
    }

