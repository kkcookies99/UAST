class Solution:
    def XXX(self, x: int) -> int:
        head,tail = 0,x + 1
        for i in range(50):
            mid = (head + tail) // 2
            if mid**2 <= x:head = mid
            else: tail = mid
            if (tail - head) == 1:break
        return head

