 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int index1 = 0;
        int index2 = 0;
        boolean out1 = false;
        boolean out2 = false;
        double medium = (nums1.length + nums2.length + 1) / 2.0;
        int time = 1;
        int[] s = new int[2];
        int tag = 0;

        while(true){
            if((double)time - medium >= 1) break;
            if(index1 >= nums1.length) out1 = true;
            if(index2 >= nums2.length) out2 = true;
            if((double)time - medium == 0.5) tag = 1;
            if(out1?false:(out2?true:nums1[index1] < nums2[index2])){
                s[tag] = nums1[index1];
                index1++;
            }
            else{
                s[tag] = nums2[index2];
                index2++;
            }
            time++;
            }
        return tag == 1?(s[0]+s[1])/2.0:(double)s[tag];
        }
    }

