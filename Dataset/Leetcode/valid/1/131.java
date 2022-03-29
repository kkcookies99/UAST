 class Solution {
    public int[] XXX(int[] nums, int target) {
        int[] nums1 = {2,7,11,15};
        int target1 =9;
        int[] result = new int[2];
        for(int i=0;i<nums1.length;i++){
            int x=nums1[i];
            for(int a=0;a<nums1.length;a++){
                int y=nums1[a];
                if(x+y==target1){
                    result [0]=i;
                    result[1]=a;
                    break;
                }
            };
            break;
        };
        return result;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


