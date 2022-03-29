public int XXX(int[] height) {
        int x=0;
        int y=height.length-1;
        int max=0;
        while(x<y){
            max=Math.max(Math.min(height[x],height[y])*(y-x),max);
            if(height[x]<height[y]) x++;
            else y--;
        }
        return max;
    }

