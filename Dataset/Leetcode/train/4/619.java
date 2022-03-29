  public double XXX(int[] nums1, int[] nums2) {
        if(nums1.length+nums2.length==0)
            return 0;
        int a=0;
        int b=0;
        int[] array=new int[2];
        int mark=0;
        int len1=(nums1.length+nums2.length)/2+(nums1.length+nums2.length)%2;
        int len2=len1 + ((nums1.length+nums2.length)%2==0?1:0);
        while(a+b<len2){
            if(a>=nums1.length||(b<nums2.length&&nums1[a]>nums2[b])){
                b++;
                if(a+b==len1||a+b==len2)
                    array[mark++]=nums2[b-1];
            }
            else{
                a++;
                if(a+b==len1||a+b==len2)
                    array[mark++]=nums1[a-1];
            }
        }
        double res=0;
        for(int i=0;i<mark;i++){
            res+=array[i];
        }
        return res/mark;
    }

