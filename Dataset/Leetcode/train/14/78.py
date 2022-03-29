     def XXX(self, strs):
        i,temp,new_word = 0,0,''
        while 1 :
            for i in range(len(strs)):
                if temp < min(len(strs[0]),len(strs[i])):
                    if strs[0][temp] == strs[i][temp]:
                        pass
                    else:
                        return new_word
                else:
                    return new_word

            new_word += strs[0][temp]
            temp+=1
        return new_word

