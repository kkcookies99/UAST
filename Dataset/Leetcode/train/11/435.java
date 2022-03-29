  public int XXX(int[] height) {
        int first=0;
        int last=height.length-1;
        int area=0;
        while(first<last){
            if(height[first]<height[last]){
                area=Math.max(area,height[first]*(last-first));
                first++;
            }else{
                area=Math.max(area,height[last]*(last-first));
                last--;
            }
        }
        return area;
    }

