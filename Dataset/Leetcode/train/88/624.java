 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int index1=0;
        int index2=0;
        int []temp=new int [m];
        System.arraycopy(nums1,0,temp,0,m);
        int index=0;
        while( index1<m && index2<n){
            if(nums2[index2]<temp[index1]){
                nums1[index++]=nums2[index2];
                index2++;
            }else{
                nums1[index++]=temp[index1++];
            }
        }
        while(index1<m) {
            nums1[index++]=temp[index1++];
        }
        while(index2<n) {
            nums1[index++]=nums2[index2++];
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


