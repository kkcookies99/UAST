class Solution:
    def XXX(self, n):
    	if n <= 2:
    		return n
    	first, second = 1, 2
    	for i in range(3,n+1):
    		result = first + second
    		first, second = second, result
    	return result

