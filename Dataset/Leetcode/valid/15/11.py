 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        arr = nums.copy()
        arr.sort()
        ans = []
        for i in range(len(arr)):
            if i>0 and arr[i] == arr[i-1]: continue
            left,right = i+1,len(arr)-1
            while left<right:
                if arr[i]+arr[left]+arr[right]>0: right-=1
                elif arr[i]+arr[left]+arr[right]<0: left+=1
                elif arr[i]+arr[left]+arr[right]==0:
                    ans.append([arr[i],arr[left],arr[right]])
                    while left<right and arr[left]==arr[left+1]:
                        left +=1
                    while left<right and arr[right]==arr[right-1]:
                        right-=1

                    left +=1
                    right -=1
        return ans

