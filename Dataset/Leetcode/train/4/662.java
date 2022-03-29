 public double XXX(int[] nums1, int[] nums2) {
        
        int n1Index=0;
        int n2Index=0;
        int sortIndex=0;
        double centerNumber=-1;
        int[] sort=null;
        if(nums2.length!=0 && nums1.length!=0 ){   
            sort=new int[nums1.length+nums2.length];
            for(int i=0;i<nums1.length+nums2.length;i++){
                if(nums1[n1Index]<=nums2[n2Index]){
                    sort[sortIndex]=nums1[n1Index];
                    n1Index++;
                    sortIndex++;
                }else{
                    sort[sortIndex]=nums2[n2Index];
                    n2Index++;
                    sortIndex++;
                }
                if (n1Index==nums1.length){
                    System.arraycopy(nums2,n2Index,sort,i+1,sort.length-i-1);
                    break;
                }else if(n2Index==nums2.length){
                    System.arraycopy(nums1,n1Index,sort,i+1,sort.length-i-1);
                    break;
                }
            }
            if(sort.length%2==0){
                centerNumber=(double)(sort[sort.length/2]+sort[sort.length/2-1])/2;
            }else{
                centerNumber=(double)sort[(sort.length-1)/2];
            }
        }else if(nums1.length==0 ){
            sort=nums2;
            if(sort.length%2==0){
                centerNumber=(double)(sort[sort.length/2]+sort[sort.length/2-1])/2;
            }else{
                centerNumber=(double)sort[(sort.length-1)/2];
            }
            
        }else if(nums2.length==0){
            sort=nums1;
            if(sort.length%2==0){
                centerNumber=(double)(sort[sort.length/2]+sort[sort.length/2-1])/2;
            }else{
                centerNumber=(double)sort[(sort.length-1)/2];
            }
        }
        return centerNumber;
        
    }

