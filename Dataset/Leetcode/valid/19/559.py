 class Solution(object):
	def XXX(self, head, n):
		a = []
		node = head
		while node:
			a.append(node)
			node = node.next
		for i in xrange(0, n-1):
			a.pop()
		target = a.pop()
		if not a:
			return target.next
		prev = a.pop()
		prev.next = target.next
		return head

