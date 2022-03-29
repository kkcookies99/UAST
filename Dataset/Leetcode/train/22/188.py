 class Solution:
    def XXX(self, n: 'int') -> 'List[str]':
        par = '()'
        queue = {'()',}
        for i in range(n-1):
            q1 = set()
            for element in queue:
                for j in range(len(element)):
                    q1.add(element[0:j] + par + element[j:])
            queue = q1
        result = list(queue)
        return result

