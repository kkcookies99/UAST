class Solution {
    public String XXX(String a, String b) {
        int minStr = 0;
        minStr = a.length() <= b.length() ? a.length():b.length();
        int maxStr = a.length() >= b.length() ? a.length():b.length();
        String flagStr = a.length() <= b.length() ? b : a;

        int[] arr = new int[flagStr.length()];
        for (int i = 0; i < flagStr.length(); i++) {
            System.out.println(flagStr.substring(i, i + 1));
            arr[i] = Integer.parseInt(flagStr.substring(i,i+1));
        }

        int count = 0;
        for (int i = 0; i < maxStr; i++) {
            if (i<minStr){
                if (Integer.parseInt(a.substring(a.length()-i-1,a.length()-i))+Integer.parseInt(b.substring(b.length()-i-1,b.length()-i))+count >1){
                    if (count == 1 && Integer.parseInt(a.substring(a.length()-i-1,a.length()-i))+Integer.parseInt(b.substring(b.length()-i-1,b.length()-i)) == 1){
                        arr[arr.length-i-1] = 0;
                    }else {
                        arr[arr.length-i-1] = 0 + count;
                    }
                    count = 1;
                }else{
                    arr[arr.length-i-1] = Integer.parseInt(a.substring(a.length()-i-1,a.length()-i))+Integer.parseInt(b.substring(b.length()-i-1,b.length()-i))+count;
                    count = 0;
                }
            }else{
                if (arr[arr.length-i-1]+count>1){
                    arr[arr.length-i-1] = 0;
                    count = 1;
                }else{
                    arr[arr.length-i-1]=arr[arr.length-i-1]+count;
                    count = 0;
                }
            }
        }

        String re = "";

        if (count != 0){
            int[] arrF = new int[arr.length+1];
            arrF[0] = count;
            for (int i = 1; i <= arr.length; i++) {
                arrF[i] = arr[i-1];
            }

            for (int i : arrF) {
                re += i;
            }
        }else{
            for (int i : arr) {
                re += i;
            }
        }
        return re;
    }
}

