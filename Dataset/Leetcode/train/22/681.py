 class Solution:
    def XXX(self, n: int) -> List[str]:
        result=[]
        track=''
        def backtrack(track, left, right):
            if right == n:
                result.append(track)
                return 0
            if left<n:
                track += '('
                backtrack(track,left+1,right)
                track = track[0:-1]
            if left>right:
                track += ')'
                backtrack(track,left,right+1)
                track = track[0:-1]
        backtrack(track,0,0)
        return result

