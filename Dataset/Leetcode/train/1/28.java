 class Solution {
    public int[] XXX(int[] nums, int target) {
        int i;
        int[] result = new int[2];
        int[][] data = new int[nums.length][2];
        for(i=0;i<nums.length;i++){
            data[i][0] = i;
            data[i][1] = nums[i];
        }
        int[][] sorted = sort(data);
        for(i = 0;i < nums.length;i++){
            result[0] = sorted[i][0];
            result[1] = search(sorted,target-sorted[i][1]);
            if(result[1] < 0 || result[1] == result[0]){
                continue;
            }else{
                return result;
            }
        }
        result[0] = -1;
        result[1] = -1;
        return result;
    }

    public int search(int[][] sorted, int target) {
        int inf = 0,sup = sorted.length - 1;
        int index = sorted.length / 2;
        while(inf <= sup){
            if(sorted[index][1] == target){
                return sorted[index][0];
            }else if(sorted[index][1] < target){
                inf = index + 1;
                index = inf + (sup - inf)/2;
            }else{
                sup = index - 1;
                index = inf + (sup - inf)/2;
            }
        }
        return -1;
    }

    public int[][] sort(int[][] data) {
        int[][] sorted = data.clone();
        quickSort(sorted,0,sorted.length-1);
        return sorted;
    }

    public void quickSort(int[][] data,int start,int end){
        int lp=start,rp=end,move = -1;
        int[] temp = new int[2];
        while(lp<rp){
            if(data[lp][1]>data[rp][1]){
                temp = data[lp];
                data[lp] = data[rp];
                data[rp] = temp;
                move *= -1;
            }
            if(move == 1){
                lp++;
            }else{
                rp--;
            }
        }
        if(lp - start > 1){
            quickSort(data,start,lp-1);
        }
        if(end - lp > 1){
            quickSort(data,lp+1,end);
        }
    }
}

