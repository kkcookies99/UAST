# Definition for singly-linked list.
# class ListNode
#     attr_accessor :val, :next
#     def initialize(val)
#         @val = val
#         @next = nil
#     end
# end
# @param {ListNode} l1
# @param {ListNode} l2
# @return {ListNode}

class ListNode
   def to_i(digit = 0)
      @val * 10**digit + (@next ? @next.to_i(digit + 1) : 0)
   end
   def self.parseInt(int)
       i = int % 10
       l = ListNode.new(i)
       ld = l
       n = int
       while (n /= 10) > 0
           i = n % 10
           ld.next = ListNode.new(i)
           ld = ld.next
       end
       l
   end
end

def add_two_numbers(l1, l2)
    ListNode.parseInt(l1.to_i + l2.to_i)
end

