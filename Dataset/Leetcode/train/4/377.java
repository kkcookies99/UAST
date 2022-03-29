 public class Solution {
    public static double XXX(int[] nums1, int[] nums2) {
        int i1 = 0,i2 = 0 , e1 = nums1.length,e2 = nums2.length ;
        int is_double = ( e1 + e2 ) % 2 ;
        int mid_num = (int)((e1 + e2 + 1) / 2) ;
        int cnt = 0 ;
        double return_num = 0.0;
        while( i1 < e1 || i2 < e2 )
        {
            int i = 0 ;
            if( i1 >= e1 )
            {
                i = 2;
                i2 ++ ;
            }
            else if( i2 >= e2)
            {
                i = 1 ;
                i1 ++ ;
            }
            else if( nums1[i1] < nums2[i2])
            {
                i = 1 ;
                i1 ++;
            }
            else{
                i = 2 ;
                i2 ++;
            }
            cnt ++ ;
            if( is_double == 0  )
            {
                if( cnt == mid_num) {
//                    System.out.println(i == 1 ? nums1[i1 - 1] : nums2[i2 - 1]);
                    return_num = i == 1 ? nums1[i1 - 1] : nums2[i2 - 1];
                }
                else if(cnt == mid_num+1){
//                    System.out.println(i == 1 ? nums1[i1 - 1] : nums2[i2 - 1]);
                    return_num = return_num + (i == 1 ? nums1[i1 - 1] : nums2[i2 - 1]);
                    return_num = return_num /2.0;
                    break;
                }
            }
            else{
                if(cnt == mid_num){
                    return_num = i == 1 ? nums1[i1-1] : nums2[i2 -1 ];
                }
            }
        }
        return return_num ;
    }
}

