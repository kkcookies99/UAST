 class Solution {
    public String XXX(int num) {
        if(num==0){
            return "";
        }
        String s = "";
        while (num!=0) {
            int i = 0;
            while(i<arr.length){
                if(arr[i]>num){
                    break;
                }
                i++;
            }
            int temp = num/arr[i-1];
            for(int j=0;j<temp;j++){
                s+=arr1[i-1];
            }
            num = num%arr[i-1];
        }
        return s;
    }
    public static int[] arr =        new int[]{ 1,  4,   5,  9,  10, 40,  50, 90, 100, 400, 500,900, 1000};
    public static String[] arr1 = new String[]{"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
}

