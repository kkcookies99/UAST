class Solution {
    public int XXX(int x) {

        String str = String.valueOf(x);
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        String s = String.valueOf(arr);
        if (s.contains("-")){
            String replace = s.replace("-", "");
            //System.out.println(replace);
            double d = Double.parseDouble(replace);
            //System.out.println(i);
            d = d-2*d;
            if (d>Integer.MAX_VALUE||d<Integer.MIN_VALUE){
                return 0;
            }
            int i = (int)d;

            return i;
//            return d;
        }else {
            double d = Double.parseDouble(s);
            //int i = Integer.parseInt(s);
            if (d>Integer.MAX_VALUE||d<Integer.MIN_VALUE){
                return 0;
            }
            int i = (int)d;
            return i;
//            return d;
        }
    }
}

