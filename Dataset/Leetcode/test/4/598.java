 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int l = l1 + l2;
        int i = 0;
        int j = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();
        while(i < nums1.length || j < nums2.length){
            // 说明有两个中位数
            if(l%2 == 0){
                if(i+j == l/2 - 1){
                    // 当数组遍历完就不参加比较
                    if(i == nums1.length){
                        result.add(nums2[j]);
                    }else if(j == nums2.length){
                        result.add(nums1[i]);
                    }else{
                        // 将较小的结果放到结果数组中
                        result.add(nums1[i]<nums2[j]? nums1[i]:nums2[j]);
                    }
                }
                else if(i+j == l/2){
                    if(i == nums1.length){
                        result.add(nums2[j]);
                    }else if(j == nums2.length){
                        result.add(nums1[i]);
                    }else{
                        result.add(nums1[i]<nums2[j]? nums1[i]:nums2[j]);
                    }
                    break;
                }
            }else{
                // 说明只有一个中位数
                if(i+j == l/2 ){
                    if(i == nums1.length){
                        result.add(nums2[j]);
                    }else if(j == nums2.length){
                        result.add(nums1[i]);
                    }else{
                        result.add(nums1[i]<nums2[j]? nums1[i]:nums2[j]);
                    }
                    break;
                }
            }
            if(i < nums1.length && j < nums2.length){
                if(nums1[i] <= nums2[j]){
                    i += 1;
                }else{
                    j += 1;
                }
            }else if(i < nums1.length || j >= nums2.length){
                i += 1;
            }else if(i >= nums1.length || j < nums2.length){
                j += 1;
            }
        }
        if(result.size() == 1){
            return (float)result.get(0);
        }else{
            // 转为float 才能进行正常除法
            return ((float)result.get(0) + (float)result.get(1))/2;
        }

        
    }

}

