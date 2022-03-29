class Solution {
    public double XXX(int[] nums1, int[] nums2) {

int len = nums1.length+nums2.length;
        int mid = len/2;
        int index1 = 0;
        int index2 = 0;
        int index = 0;
        double result = 0;
        if(len%2!=0)mid+=1 ;

        
        while(index < mid){
        	
        	if(index1 < nums1.length && index2 < nums2.length){
        		if(nums1[index1] < nums2[index2]){
            		result = nums1[index1];
                    index1++;
            	}else{
            		result = nums2[index2];
                	index2++;
            	}
        	}else if(index1 < nums1.length){
        		result = nums1[index1];
                index1++;
        	}else{
        		result = nums2[index2];
            	index2++;
        	}
        	
        	index++;
        }
        if(len%2==0){
        	if(index1 < nums1.length && index2 < nums2.length){
        		if(nums1[index1] < nums2[index2]){
            		result = 1.0*(result + nums1[index1])/2;
            	}else{
            		result = 1.0*(result + nums2[index2])/2;
            	}
        	}else if(index1 < nums1.length){
        		result = 1.0*(result + nums1[index1])/2;
        	}else{
        		result = 1.0*(result + nums2[index2])/2;
        	}
        }
       
      
       
        return result;
    }
}

