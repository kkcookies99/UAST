 public int XXX(int[] height) {
        int max = 0;
        int temp = 0;
        int left = 0;       //双指针
        int right = height.length-1;

        for(int i=0; i < height.length; i++){   //最左最右 移动到中间
            
            if(height[left] < height[right]){   //如果左边短 
                temp = height[left] * (right-left);
                left++;     //移动左边 （保留高的边
            }
            else{       //如果右边短
                temp = height[right] * (right-left);
                right--;    //移动右边 （保留高的边
            }

            if(temp > max) //纪录最大值
                max = temp;  
        }
        return max;
    }

