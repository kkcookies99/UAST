 public static double XXX(int[] nums1, int[] nums2) {
        int newArrLen=nums1.length+nums2.length;
        int[] newArr=new int[newArrLen/2+1];
        int i=0,j=0,k=0;
        while(i<nums1.length||j<nums2.length){
            int num1=i<nums1.length?nums1[i]:Integer.MAX_VALUE;
            int num2=j<nums2.length?nums2[j]:Integer.MAX_VALUE;
            if(num1<=num2){
                newArr[k]=num1;
                i++;
            }else{
                newArr[k]=num2;
                j++;
            }
            k++;
            if(k>newArrLen/2){
                break;
            }
        }
        if(newArrLen%2==1){
            return newArr[newArrLen/2];
        }else{
            int midIndex=newArrLen/2;
            return (double)(newArr[midIndex-1]+newArr[midIndex])/2;
        }
    }

