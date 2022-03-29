class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x<=1:
            return x

        prev_x=1.0
        while True:
            curr_x=prev_x-(prev_x**2-x)/(2*prev_x)
            if abs(curr_x-prev_x)<1e-5:
                break
            prev_x=curr_x

        return int(curr_x)

