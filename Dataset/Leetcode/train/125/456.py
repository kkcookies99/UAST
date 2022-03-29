 class Solution:
    def XXX(self, s: str) -> bool:
        arr =[i.lower() for i in s if i.isalpha() or i.isdigit()]
        if len(arr)%2==0:
            left = (len(arr)-1)//2
            right = (len(arr))//2
        else:
            left = right = (len(arr))//2
        while left>-1 and right<len(arr) and arr[left] ==arr[right]:
            left-=1
            right+=1
        if left==-1 and right==len(arr):return True
        else:return False

