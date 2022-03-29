 class Solution:
    def XXX(self, num: int) -> str:
        serial_list = [[["CM"],["D"],["C"],["CD"],["C"]],[["XC"],["L"],["X"],["XL"],["X"]],[["IX"],["V"],["I"],["IV"],["I"]]]

        num_list = [int(x) for x in list("{0:04d}".format(num))]
        # print(num_list)
        output = []

        if num_list[0] > 0:
            output += ["M"]*num_list[0]
        for i in range(1, 4):
            if num_list[i] == 9:
                output += serial_list[i-1][0]
            elif num_list[i] >= 5:
                output += serial_list[i-1][1]
                output += serial_list[i-1][2]*(num_list[i]-5)
            elif num_list[i] == 4:
                output += serial_list[i-1][3]
            else:
                output += serial_list[i-1][4]*num_list[i]

        return "".join(output)

