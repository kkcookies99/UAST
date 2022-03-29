 class Solution {
    public String XXX(int num) {
        if (num < 1 || num > 3999) {
            return null;
        }

        int ths = num / 1000;
        int rmThs = num % 1000;

        int hths = rmThs / 500;
        int rmHths = rmThs % 500;

        int hds = rmHths / 100;
        int rmHds = rmHths % 100;

        int hhds = rmHds / 50;
        int rmHhds = rmHds % 50;

        int dcs = rmHhds / 10;
        int rmDcs = rmHhds % 10;

        int fifs = rmDcs / 5;
        int rmFifs = rmDcs % 5;

        StringBuilder buider = new StringBuilder();

        positionString(ths, 0, num, 'M', '\0', '\0', buider);
        positionString(hds, hths, rmHths, 'C', 'D', 'M', buider);
        positionString(dcs, hhds, rmHhds, 'X', 'L', 'C', buider);
        positionString(rmFifs, fifs, rmFifs, 'I', 'V', 'X', buider);

        return buider.toString();
    }

    private void positionString(int cd, int ph, int rph, char nc, char phc, char pc, StringBuilder buider) {
        if (ph > 0 && cd == 4) {
            buider.append(nc);
            buider.append(pc);
        } else {
            if (ph > 0) {
                buider.append(phc);
            }

            if (rph == 0) {
                return;
            }

            if (cd == 4) {
                buider.append(nc);
                buider.append(phc);
            } else {
                for (int i = 0; i < cd; i++) {
                    buider.append(nc);
                }
            }
        }
    }
}

