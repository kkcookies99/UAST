  public double XXX(int[] nums1, int[] nums2) {
         int length = nums1.length + nums2.length ;
        int[] arr = new int[length] ;
        int i ;
        for ( i = 0 ; i<nums1.length ; i++) {
            arr[i] = nums1[i] ;
        }
        for (int j = 0 ; j<nums2.length ; j++){
            arr[i++] = nums2[j] ;
        }
        Arrays.sort(arr);
        if (arr.length%2 ==0){
            return (arr[arr.length/2]+arr[arr.length/2 - 1])/2.0 ;
        }
        else 
            return arr[arr.length/2] ;   
    }

