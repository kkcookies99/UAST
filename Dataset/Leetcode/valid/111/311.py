class Solution(object):
	def XXX(self, root):
		if not root:
			return 0
		r = [root]
		count = 1
		while True:
			tmp_r = []
			for n in r:
				if not n.left and not n.right:
					return count
				if n.left:
					tmp_r.append(n.left)
				if n.right:
					tmp_r.append(n.right)
			count += 1
			r = tmp_r

