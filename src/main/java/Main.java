public class Main {
    public static void main(String[] args) {
        StarTree starTree =new StarTree("left");
        StarTree starTree2 =new StarTree("right");
        StarTree starTree3 =new StarTree("leftDown");
        StarTree starTree4 =new StarTree("rightDown");
        StarTree starTree5 =new StarTree("diagonalright");
        StarTree starTree6 =new StarTree("diagonalleft");
        StarTree starTree7 =new StarTree("cros");
        StarTree starTree8 =new StarTree("centralTree");
        StarTree starTree9 =new StarTree("O");
        starTree.draw();
        starTree2.draw();
        starTree3.draw();
        starTree4.draw();
        starTree5.draw();
        starTree6.draw();
        starTree7.draw();
        starTree8.draw();
        starTree9.draw();
    }
}
