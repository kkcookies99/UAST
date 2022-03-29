    public void XXX(int[] nums) {
        //冒泡排序
        for(int i = 0;i < nums.length - 1;i++) {
            for(int j = 0;j < nums.length - 1 - i;j++) {
                if(nums[j] > nums[j+1]) {
                    swap(nums,j,j+1);
                }
            }
        }
    }
    public void swap(int[] arr,int i,int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    //快速排序
    quickSort(nums,0,nums.length -1);
}
public void swap(int[] arr,int i,int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
public void quickSort(int[] arr,int left,int right) {
    //一个或没有元素
    if(left >= right) {
        return;
    }
    int index = partion(arr,left,right);
    quickSort(arr,left,index -1);
    quickSort(arr,index + 1,right);
}
public int partion(int[] arr,int left,int right) {
    int baseValue = arr[right];
    int i = left;
    int j = right;
    while(i < j) {
        while(i < j && arr[i] <= baseValue) {
            i++;
        }
        while(i < j && arr[j] >= baseValue) {
            j--;
        }
        swap(arr,i,j);
    }
    //i == j i > j
    swap(arr,i,right);
    return i;

}

