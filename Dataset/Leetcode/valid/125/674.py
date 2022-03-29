 class Solution(object):
    def XXX(self, s):
        l=len(s)
        i=0
        j=l-i-1
        i_add=0
        j_add=0
        while i<j:
            if i_add==0:
                if s[i] in 'abcdefghijklmnopqrstuvwxyz0123456789':
                    s_left=s[i]
                    i=i+1
                    i_add=1
                elif s[i] in 'ABCDEFGHIJKLMNOPQRSTUVWXYZ':
                    s_left= s[i].lower()
                    i=i+1
                    i_add=1
                else:
                    i=i+1
                    continue
                
            if j_add==0:
                if s[j] in 'abcdefghijklmnopqrstuvwxyz0123456789':
                    s_right=s[j]
                    j=j-1
                    j_add=1
                elif s[j] in 'ABCDEFGHIJKLMNOPQRSTUVWXYZ':
                    s_right=s[j].lower()
                    j=j-1
                    j_add=1
                else:
                    j=j-1
                    continue
            if s_left!=s_right:
                return False
            else:
                i_add=0
                j_add=0
        return True

