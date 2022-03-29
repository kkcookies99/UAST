 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int left1 = 0,right1 = nums1.length-1;
        int left2 = 0,right2 = nums2.length-1;
        while(left1<=right1&&left2<=right2){
            if(left1==right1&&left2==right2){
                return (nums1[left1]+nums2[left2])/2.0;
            }
            if(nums1[left1]<nums2[left2]) left1++;
            else left2++;
            if(left1>right1){
                right2--; break;
            }
            if(left2>right2){
                right1--; break;
            }
            if(nums1[right1]>nums2[right2]) right1--;
            else right2--;
        }
        while(left1<right1){
            if(right1-left1==1) return (nums1[left1]+nums1[right1])/2.0;
            left1++;right1--;
        }
        while(left2<right2){
            if(right2-left2==1) return (nums2[left2]+nums2[right2])/2.0;
            left2++;right2--;
        }
        if(left1==right1) return 1.0*nums1[left1];
        else return 1.0*nums2[left2];
    }
}

