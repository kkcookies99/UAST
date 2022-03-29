 public int XXX(int x) {
        int temp = 1; // 正负数
        if (x < 0){
            x = Math.abs(x);
            temp = -1;
        }
        char[] arr = String.valueOf(x).toCharArray();
        if (arr.length == 1){
            return x;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = arr.length - 1; i >= 0; i --){
            sb.append(arr[i]);
        }
        while (sb.toString().startsWith("0")){
            sb.delete(0, 1);
        };
        return temp * Integer.parseInt(sb.toString());
    }

