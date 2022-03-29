 public int XXX(int[] height) {
       if (height.length == 0) {
            return 0;
        }
        return XXX(height, 0, height.length - 1);
    }

    //[i,j]能盛雨水的最大值
    private int XXX(int[] height, int i, int j) {
        //基本情形 递归出口
        if (j - i == 1) {
            return Math.min(height[i], height[j]); //*1省去了
        }
        //当前的面积 较小边的高*长度
        int curArea = Math.min(height[i],height[j])*(j-i);
        //XXX(i, j)=max(curArea，XXX(i, j - 1),XXX(i + 1, j))
        //if(height[i] > height[j])
        // XXX(i + 1, j)  < curArea (官方推导)
        //XXX(i, j)=max(curArea，XXX(i, j - 1)) 减去一个分支
        //反过来可以减去另一个分支
        if (height[i] > height[j]) {
            return Math.max(curArea, XXX(height,i, j - 1));
        }else {
            return Math.max(curArea, XXX(height,i + 1, j));
        }
    }

