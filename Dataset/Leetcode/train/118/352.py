 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        
        ans = []
        last_layer = None
        for i in range(numRows):
            layer = [1 for x in range(i + 1)]

            if last_layer:
                for j in range(1, len(layer) - 1):
                    layer[j] = last_layer[j-1] + last_layer[j]

            last_layer = layer
            ans.append(layer)

        return ans

