 class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        return self.qs(nums,0,len(nums)-1)
    
    def swap(self,list,i,j):
        list[i],list[j] = list[j],list[i]
        
    def qs(self,list,left,right):
        if left < right:
            loc = self.find(list,left,right)
            self.qs(list,left,loc-1)
            self.qs(list,loc+1,right)
            
    def find(self,list,left,right):
        mid = left+(right-left)//2
        key = list[mid]
        list[mid]=list[right]
        list[right] = key
        i = left
        for j in range(left,right):
            if list[j] < key:
                self.swap(list,i,j)
                i+=1
        self.swap(list,right,i)
        return i

