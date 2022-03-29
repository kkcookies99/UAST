 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        
        def findK(nums1,nums2,k):
            if(len(nums1)==0): return None
            if(len(nums2)==0): return nums1[k-1]

            len2 = len(nums2)
            low = max(0,k-len2-1)
            high = min(k-1,len(nums1)-1)
            while(low<=high):
                middle = (high+low)//2
                n2_left = k-(middle+1)
                n1_index = middle
                n2_index = n2_left - 1
                if(n2_index>=0 and nums1[n1_index]<nums2[n2_index]):
                    low = middle + 1
                elif((n2_index+1)<len(nums2) and nums1[n1_index]>nums2[n2_index+1]):
                    high = middle - 1
                else: return nums1[middle]
            return None
        
        def findK_warpper(nums1,nums2,k):
            res = findK(nums1,nums2,k)
            return res if res is not None else findK(nums2,nums1,k)
        
        n1_len,n2_len = len(nums1),len(nums2)

        if((n1_len+n2_len)%2):
            k = 1 + (n1_len+n2_len)//2
            return findK_warpper(nums1,nums2,k)
        else:
            k1 = (n1_len+n2_len)//2
            k2 = k1 + 1
            return (findK_warpper(nums1,nums2,k1)+findK_warpper(nums1,nums2,k2))/2
        

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


