class Solution(object):
    def XXX(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        twodigit_sums=[0,1,2,3]
        outs=['0','1','0','1']
        extra_adds=[0,0,1,1]
        sumtoout=dict(zip(twodigit_sums, outs))
        sumtoextra_add=dict(zip(twodigit_sums, extra_adds))
        extra_add = 0
        """
        补0
        """
        if len(a)>len(b):
            b = '0'*(len(a)-len(b)) + b
        else:
            a = '0'*(len(b)-len(a)) + a
        output_digits=''
        if a==b=='0':
            output_digits+='0'
            return output_digits
        checkpoint = len(a)-1
        while checkpoint >=0:
            output_digit = sumtoout[extra_add + int(a[checkpoint]) + int(b[checkpoint])]
            extra_add = sumtoextra_add[extra_add + int(a[checkpoint]) + int(b[checkpoint])]
            output_digits += output_digit
            checkpoint -= 1
        if extra_add == 1:
           output_digits += str(extra_add)
        output_digits = output_digits[::-1]
        if output_digits[0] == '0':
            output_digits = output_digits[1::]
        return output_digits

