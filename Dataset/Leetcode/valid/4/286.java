  public double XXX(int[] nums1, int[] nums2) {


        int z=nums1.length+nums2.length;
        int[] ints=new int[z];
        int a=0;
        int b=0;

        for(int x=0;x<z;x++){
            if(a==nums1.length){
                ints[x]=nums2[b];
                b++;
                continue;
            }
            if(b==nums2.length||nums1[a]<=nums2[b]){
                ints[x]=nums1[a];
                a++;
                continue;
            }
            if(nums2[b]<nums1[a]) {
                ints[x]=nums2[b];
                b++;

            }
        }
        return z%2==0? ((double) (ints[z/2]+ints[z/2-1]))/2:ints[z/2] ;
    }


