class Solution(object):
    def XXX(self, root):
        def height(x):
            if x==None:return (True,0)
            lbool,lh = height(x.left)
            rbool,rh = height(x.right)
            return (lbool and rbool and abs(lh-rh)<=1,1+max(lh,rh))
        return height(root)[0]

