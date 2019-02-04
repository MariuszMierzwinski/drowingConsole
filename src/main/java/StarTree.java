

public class StarTree {
    private String strtree;
    private boolean tabtree[][] = new boolean[7][7];

    public StarTree(String str) {
        this.strtree = str;
        switch (strtree) {
            case "left":
                treeLeft();
                break;
            case "right":
                treeRight();
                break;
            case "leftDown":
                treeLeftDown();
                break;
            case "rightDown":
                treeRighttDown();
                break;
            case "diagonalright":
                diagonalRight();
                break;
            case "diagonalleft":
                diagonalLeft();
                break;
            case "cros":
                cros();
                break;
            case "centralTree":
                centralTree();
                break;
        }
    }

    private void centralTree() {
        int x = 0, y = 0;
        for (int i = 0; i < tabtree.length; i++) {
            x = i;
            for (int j = 0; j < tabtree.length; j++) {

                if ((j >=  tabtree.length/2-i)&&(j <=  tabtree.length/2+i)) {
                    tabtree[i][j] = true;
                } else tabtree[i][j] = false;
            }
        }



    }

    private void cros() {
        int x = 0, y = 0;
        for (int i = 0; i < tabtree.length; i++) {
            x = i;
            for (int j = 0; j < tabtree.length; j++) {

                if ((i ==  tabtree.length-1 - j) || (i == j)) {
                    tabtree[i][j] = true;
                } else tabtree[i][j] = false;
            }
        }
    }

    private void diagonalLeft() {
        int x = 0, y = 0;
        for (int i = 0; i <  tabtree.length; i++) {
            x = i;
            for (int j = 0; j <  tabtree.length; j++) {

                if (i ==  tabtree.length-1 - j) {
                    tabtree[i][j] = true;
                } else tabtree[i][j] = false;
            }
        }
    }


    private void diagonalRight() {
        int x = 0, y = 0;
        for (int i = 0; i <  tabtree.length; i++) {
            x = i;
            for (int j = 0; j <  tabtree.length; j++) {

                if (i == j) {
                    tabtree[i][j] = true;
                } else tabtree[i][j] = false;
            }
        }

    }

    public void treeLeft() {
        int x = 0, y = 0;
        for (int i = 0; i <  tabtree.length; i++) {
            x = i;
            for (int j = 0; j <  tabtree.length; j++) {

                if (i >= j) {
                    tabtree[i][j] = true;
                } else tabtree[i][j] = false;
            }
        }

    }

    public void treeRight() {
        int x = 0, y = 0;
        for (int i = 0; i <  tabtree.length; i++) {
            x = i;
            for (int j = 0; j <  tabtree.length; j++) {

                if (j >=  tabtree.length-1 - i) {
                    tabtree[i][j] = true;
                } else tabtree[i][j] = false;
            }
        }

    }

    public void treeLeftDown() {
        int x = 0, y = 0;
        for (int i = 0; i <  tabtree.length; i++) {
            x = i;
            for (int j = 0; j <  tabtree.length; j++) {

                if ( tabtree.length-1 - j >= i) {
                    tabtree[i][j] = true;
                } else tabtree[i][j] = false;
            }
        }

    }

    public void treeRighttDown() {
        int x = 0, y = 0;
        for (int i = 0; i <  tabtree.length; i++) {
            x = i;
            for (int j = 0; j <  tabtree.length; j++) {

                if ( tabtree.length-1- j >=  tabtree.length-1 - i) {
                    tabtree[i][j] = true;
                } else tabtree[i][j] = false;
            }
        }

    }


    public void draw() {

        for (int i = 0; i < tabtree.length; i++) {
            for (int j = 0; j < tabtree.length; j++) {
                if (tabtree[i][j]) {
                    System.out.print("*");
                } else System.out.print(" ");

            }
            System.out.println();
        }
    }
}


