 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int index1=0;
        int index2=0;
        int length=nums1.length+nums2.length;
        int Index=length/2;
        double num=findAtIndex(nums1,nums2,Index);
        if(length%2==1){
            return num;
        }
        else{
            double num1=findAtIndex(nums1,nums2,Index-1);
            return (num+num1)/2;
        }

    }

    private double findAtIndex(int[] nums1,int[] nums2,int index){
        int index1=0;
        int index2=0;
        double result=0;
        Boolean bool=false;
        while(index1<nums1.length&&index2<nums2.length){
            if(index1+index2==index){
                result=Math.min(nums1[index1],nums2[index2]);
                bool=true;
            }
            if(nums1[index1]<nums2[index2]){
                index1++;
            }else{
                index2++;
            }
            if(index1+index2>index){
                break;
            }
        }
        if(!bool){
        if(index1>=nums1.length){
            result=nums2[index-index1];
        }
        if(index2>=nums2.length){
            result=nums1[index-index2];
        }
        }
        return result;
    }
}

