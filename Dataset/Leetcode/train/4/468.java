 class Solution {
    public double XXX(int[] num1, int[] num2) {
        if(num1 == null && num2 == null){
            return 0.0;
        }
        int[] num = new int[num1.length + num2.length];
        int i = 0;
        int j = 0;
        while(i < num1.length && j < num2.length){
            num[i+j] = num1[i] < num2[j]? num1[i++] : num2[j++];
        }
        while(i < num1.length)
            num[i+j] = num1[i++];
        while(j < num2.length)
            num[i+j] = num2[j++];
        int len = num.length;
        if((len&1) == 1){
            return (double)num[len/2];
        } else {
            return (double)(num[len/2]+num[len/2 - 1])/2;
            }
    }
}
code block

