     public int XXX(int[] height) {
        int max=0;
        int left=0;
        int right=height.length-1;
        while(left<right)
        {
            
            if(height[left]>height[right])
            {
                max=Math.max(max,height[right]*(right-left));//短板效应，所以应该时最低高度✖宽度。
                int temp=right;
                while(right>left&&height[right]<=height[temp]) right--; //寻找比当下更高的高度，因为如果低的话，装的水更少了。
            }
            else if(height[left]<height[right])
            {
                max=Math.max(max,height[left]*(right-left));
                int temp=left;
                while(right>left&&height[left]<=height[temp]) left++;                
            }
            else
            {
                max=Math.max(max,height[right]*(right-left));
                int templ=left;
                int tempr=right;
                while(right>left&&height[left]<=height[templ]) left++;
                while(right>left&&height[right]<=height[tempr]) right--;
            }
        }
        return max;
    }

