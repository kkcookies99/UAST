 public int[][] XXX(int[][] intervals) {
        //先对数组进行排序
		 sort(intervals);
		int len = intervals.length;
		int i=0,j=1;
		 while(j<len) {//重叠
			 if (intervals[i][1]>=intervals[j][0]) {
				intervals[i][1]=Math.max(intervals[i][1], intervals[j][1]);
		        
			}else {
				i++;
				intervals[i][0]=intervals[j][0];
				intervals[i][1]=intervals[j][1];
				
			}
			 j++;
		 }
		 int[][] nums = new int[i+1][2];
		 for(int k =0;k<nums.length;k++) {
			 nums[k][0]=intervals[k][0];
			 nums[k][1]=intervals[k][1];
		 }
		 
        
         return nums;
	    }
	 
	 public static void sort(int[][] hand){ 
		 Arrays.sort(hand, new Comparator<int[]>() { 
			    public int compare(int[] o1, int[] o2) { 
			    if (o1[0] == o2[0]) { 
			     return Integer.compare(o1[1], o2[1]); 
			    } else { 
			     return Integer.compare(o1[0], o2[0]); 
			    } 
			    } 
			}); 
		} 

