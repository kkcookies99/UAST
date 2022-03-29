 class Solution:
    def XXX(self, n: int) -> str:
        word = "11"
        res = ["1", "11"]
        while len(res) < n:
            key = 1
            resWord = ""
            for i in range(1, len(word)):
                if word[i] == word[i - 1]:
                    key += 1
                else:
                    resWord += str(key)
                    resWord += word[i - 1]
                    key = 1
            resWord += str(key)
            resWord += word[- 1]
            res.append(resWord)
            word = resWord
        return res[n - 1]

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


