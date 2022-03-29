 class Solution {
    public int XXX(int m, int n) {
        
        if(m == 1 || n == 1){
            return 1;
        }
        
        int[] array = new int[n];
        //初始化边界
        for(int i=0; i<n; i++){
            array[i] = 1;
        }
        //使用array[j-1] 和 array[j](上一行的状态) 更新本行中j位置路径数
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){  
                array[j] = array[j] + array[j-1];
            }
        }
        return array[array.length - 1];
    }
}

