    public double XXX(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int newSize = len1 + len2;
        if(newSize == 0){
            return 0;
        }
        int x=0,y=0;
        int mid1 = newSize % 2 == 0 ? newSize / 2  : newSize/2 + 1;
        int mid2 = newSize / 2 + 1;
        double z1 = 0,z2 = 0;
        for (int count=1;count <= mid2;count++){
            //当num1[x]达到边界，或 num2[y] 较小时。从nums2[y]获取
            if(x > len1-1 || (y<len2 && nums1[x] > nums2[y])){
                if(count == mid1){
                    z1 = nums2[y];
                }
                if(count == mid2){
                    z2 = nums2[y];
                }
                y++;
            //从nums2[x]获取
            }else{
                if(count == mid1){
                    z1 = nums1[x];
                }
                if(count == mid2){
                    z2 = nums1[x];
                }
                x++;
            }
        }
        return (z1+z2)/2;
    }

