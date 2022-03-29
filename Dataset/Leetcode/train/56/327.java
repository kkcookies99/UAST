     public int[][] XXX(int[][] intervals) {
        //如果只有一个区间 直接返回
        if(intervals.length==1)return intervals;
        //按左边界排序 快速
        quickSort(intervals,0,intervals.length-1,new int[intervals.length][]);
        //定义两个临时变量 用来保存当前的左边界和右边界
        int min = intervals[0][0];
        int max = intervals[0][1];
        //定义一个list来保存结果  因为我们不知道有多少个区间
        List<int[]> list = new ArrayList<>();
        for(int i=1;i<intervals.length;i++){//[[1,3],[2,6],[8,10],[15,18]]
            if(max>=intervals[i][0]){
                max = Math.max(max,intervals[i][1]);
            }else{
                list.add(new int[]{min,max});
                min = intervals[i][0];
                max = intervals[i][1];
            }
            if(i==intervals.length-1){//这里要注意  因为前面这么判断是不会将最后一个区间加进去的
                list.add(new int[]{min,max});
            }
        }
        int[][] result = new int[list.size()][];
        int index = 0;
        for(int[] ar:list){
            result[index++] = ar;
        }
        return result;
    }

    public void quickSort(int[][] arr,int low,int high,int[][] temp){
        if(low<high){
            int index = getIndex(arr,low,high,temp);
            quickSort(arr,low,index-1,temp);
            quickSort(arr,index+1,high,temp);
        }
    }

    public int getIndex(int[][] arr,int low,int high,int[][] temp){
        int midValue = arr[low][0];
        int midValue2 = arr[low][1];
        while(low<high){
            while(low<high&&arr[high][0]>=midValue){
                high--;
            }
            arr[low][0] = arr[high][0];
            arr[low][1] = arr[high][1];
            while(low<high&&arr[low][0]<=midValue){
                low++;
            }
            arr[high][0] = arr[low][0];
            arr[high][1] = arr[low][1];
        }
        arr[low][0] = midValue;
        arr[low][1] = midValue2;
        return low;
    }

