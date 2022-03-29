class Solution:
    def XXX(self, str):
        s = str.lstrip()
        if not s:
        	return 0
        result = ''
        a = s[0]
        if a == '-' or a == '+':
        	result += a
        	s = s.split(a)
        	for i in s[1]:
        		if ord(i) > 57 or ord(i) < 48:
        			break
        		else:
        			result += i
        	if result[1:].isdigit():
        		result = int(result)
        	else:
        		result = 0
        else:
        	result += s.split(" ")[0]
        	for i in result:
        		if ord(i) > 57 or ord(i) < 48:
        			result = result.split(i)[0]
        	if result.isdigit():
        		result = int(result)
        	else:
        		result = 0
        if result > 2**31 - 1:
        	return 2**31 - 1
        elif result < -2**31:
        	return -2**31
        return result

