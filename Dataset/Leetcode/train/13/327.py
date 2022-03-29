class Solution:
    def XXX(self, s: str) -> int:
        r_i_dic = {
            "I": 1,
            "V": 5,
            "X": 10,
            "L": 50,
            "C": 100,
            "D": 500,
            "M": 1000
            }
        tmp_lst = []
        count_tag = 0
        for k, v in enumerate(s):
            if count_tag + 1 < len(s):
                if r_i_dic[s[count_tag]] >= r_i_dic[s[count_tag+1]]:
                    tmp_lst.append(r_i_dic[s[count_tag]])
                    count_tag += 1
                else:
                    tmp_lst.append(r_i_dic[s[count_tag+1]]-r_i_dic[s[count_tag]])
                    count_tag += 2
            if count_tag == len(s)-1:
                tmp_lst.append(r_i_dic[s[count_tag]])
                break
        return sum(tmp_lst)

