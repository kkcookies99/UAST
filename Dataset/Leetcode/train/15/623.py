 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        if len(nums) in [0,1,2]:
            return []
        nums = sorted(nums)
        out = []
        for m in range(1,len(nums)-1):#[-2,0,1,1,2]    #[[-2, 0, 2]]
            zero_flag = False
            if m<=len(nums)-3:
                if nums[m]==nums[m+1]:
                    continue
            l = 0
            r = len(nums)-1
            while True:
                if nums[m-1]==nums[m] and nums[m]!=0:
                    if l<m-1 and nums[l]==nums[l+1]:
                        l += 1
                        continue

                    if r>m and nums[r]==nums[r-1]:
                        r -= 1
                        continue

                    if nums[r]+nums[l]==-nums[m]:
                        out.append([nums[l],nums[m],nums[r]])
                        if l==m-1 and r==m:
                            break
                        elif l<m-1:
                            l += 1
                        elif r>m:
                                r -= 1
                    elif nums[r]+nums[l]>-nums[m] and r>m:
                        r -= 1                
                    elif  nums[r]+nums[l]<-nums[m] and l<m-1:
                        l += 1
                    if nums[r]+nums[l]==-nums[m]:
                        continue
                    if (nums[r]+nums[l]>-nums[m] and r==m) or(l==m-1 and r==m) or (nums[r]+nums[l]<-nums[m] and l==m-1):
                        break 
                        
                else:
                    if m-2>=0 and not zero_flag and nums[m-2]==0 and nums[m-1]==0 and nums[m]==0:
                        zero_flag = True
                        out.append([0,0,0])
#                     print(l,m,r)
#                     print(out)
                    if l<m-1 and nums[l]==nums[l+1]:
                        l += 1
                        continue

                    if r>m+1 and nums[r]==nums[r-1]:
                        r -= 1
                        continue

                    if nums[r]+nums[l]==-nums[m]:
                        if not zero_flag and nums[r]==0 and nums[l]==0 and nums[m]==0: 
                            out.append([nums[l],nums[m],nums[r]])
                        if not(nums[r]==0 and nums[l]==0 and nums[m]==0):
                            out.append([nums[l],nums[m],nums[r]])
                        if l==m-1 and r==m+1:
                            break
                        elif l<m-1:
                            l += 1
                        elif r>m+1:
                                r -= 1
                    elif nums[r]+nums[l]>-nums[m] and r>m+1:
                        r -= 1                
                    elif  nums[r]+nums[l]<-nums[m] and l<m-1:
                        l += 1
                    if nums[r]+nums[l]==-nums[m]:
                        continue
                    if (nums[r]+nums[l]>-nums[m] and r==m+1) or(l==m-1 and r==m+1) or (nums[r]+nums[l]<-nums[m] and l==m-1):
                        break
                   
        return out

