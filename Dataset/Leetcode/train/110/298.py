class Solution(object):
	def XXX(self, root):
		dep, balanace = self.getDeepthAndBalance(root)
		return balanace

	def getDeepthAndBalance(self, root):
		if not root:
			return 0, True
		ldep, lbalance = self.getDeepthAndBalance(root.left)
		if not lbalance:
			return 0, False
		rdep, rbalance = self.getDeepthAndBalance(root.right)
		if not rbalance:
			return 0, False
		if ldep - rdep >= -1 and ldep - rdep <= 1:
			return max(ldep, rdep)+1, True
		return 0, False

