 class Solution {
    public int[] XXX(int[] z, int target) {
        int[] a = new int[2];
        for(int n=0; n<z.length; n++){
            int x = z[n];
            for(int i=n+1; i<z.length; i++){
                int h = x + z[i];
                if(target == h){
                    System.out.println("源数组中和为：[ " + target + " ] 的两个数为 :  " + z[n] + " + " + z[i]);
                    System.out.println("他们的数组下标分别为： " + n + "         " +  i);
                    a[0] = n;
                    a[1] = i;
                }
            }
        }
        return a;
    }
}

