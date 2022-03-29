 class Solution(object):
    def XXX(self, head, n):
        end = head
        def FindNthEnd( head_now, may_end, icount):
            if not may_end.next and icount >= n:
                return True, head_now
            elif not may_end.next:
                return False, head_now
            elif icount >= n:
                return FindNthEnd( head_now.next, may_end.next, icount)
            else:
                return FindNthEnd( head_now, may_end.next, icount + 1)
        judge, second = FindNthEnd( head, end, 0)
        if judge:
            second.next = second.next.next
            return head
        else:
            return head.next

