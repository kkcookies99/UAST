 class Solution:
    """
    first time:56min
    total time:76min
    time complexity:O(n)
    space complexity:O(n)
    idea:
    """
    def XXX(self, s: str) -> bool:
        newStr="".join(ch.lower() for ch in s if ch.isalnum())
        i,j=0,len(newStr)-1
        while i<j:
            if newStr[i]!=newStr[j]:
                return False
            i+=1
            j-=1
        return True

