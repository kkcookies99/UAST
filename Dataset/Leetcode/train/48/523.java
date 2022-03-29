 class Solution {
    public void XXX(int[][] matrix) {
        int n = matrix.length;
        int[] nums = new int[n-1];
        int t = 0;
        int cnt = n / 2, cntT = 0;
        int i = 0, j = 0, k = 0;
        boolean right = true, left = false, down = false, up = false;
        while(cntT != cnt){
            i = cntT;
            j = cntT;
            while(right){
                nums[k++] = matrix[i][j++];
                if(j == n - cntT - 1) {right = false; down = true; k = 0;}
            }
            while(down){
                t = matrix[i][j];
                matrix[i][j] = nums[k];
                nums[k] = t;
                i++;
                k++;
                if(i == n - cntT - 1) {down = false; left = true; k = 0;}
            }
            while(left){
                t = matrix[i][j];
                matrix[i][j] = nums[k];
                nums[k] = t;
                j--;
                k++;
                if(j == cntT) {left = false; up = true; k = 0;}
            }
            while(up){
                t = matrix[i][j];
                matrix[i][j] = nums[k];
                nums[k] = t;
                i--;
                k++;
                if(i == cntT) {up = false; right = true; k = 0;}
            }
            for(int ii = 0; ii < n - 2 * cntT - 1; ii++){
                matrix[i][j++] = nums[k++];
            }
            cntT++;            
            k = 0;
        }
    }
}

