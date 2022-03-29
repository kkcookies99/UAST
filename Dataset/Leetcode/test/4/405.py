 def XXX(self, nums1: List[int], nums2: List[int]) -> float:
    aa=[]
    aa.extend(nums1)
    aa.extend(nums2)
    aa.sort()
    len_aa=len(aa)
    if len_aa % 2 == 0:
        i=int(len_aa/2-1)
        middle=float((aa[i]+aa[i+1])/2)
    else:
        i=int((len_aa-1)/2)
        middle=float(aa[i])
    return middle

