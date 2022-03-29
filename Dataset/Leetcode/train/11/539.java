 public int XXX(int[] height) {
        int n = height.length;
        if(n<1){
            return 0;
        }
        int i=0,j=n-1;
        int max=0;
        while(i<j){
            max=Math.max(max,(j-i)*Math.min(height[i],height[j]));     // 求面积
            if(height[i]<=height[j]) {
                int x=1;
                while(i+x<=j && height[i]>=height[i+x]){        // 判断只有大于当前值才选择该下标，小于直接跳过，继续增加或减少下标
                    x++;
                }
                i=i+x;
            }else{
                int x=1;
                while(j-x>=i && height[j]>=height[j-x]){        // 同理，小于直接跳过
                    x++;
                }
                j=j-x;
            }
        }
        return max;
    }

