 class Solution:
    def __init__(self):
        self.trie = {}
        self.end = '$'

    def trieInsert(self, word):
        node = self.trie
        for c in word:
            if c not in node:
                node[c] = {}
            node = node[c]
        node[self.end] = self.end

    def XXX(self, strs) -> str:
        ans = ''
        for w in strs:
            self.trieInsert(w)
        trie = self.trie
        while self.end not in trie.keys() and len(trie.keys()) == 1:
            key = next(iter(trie))
            ans += key
            trie = trie[key]
        return ans

