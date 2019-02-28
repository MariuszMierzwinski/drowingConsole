package treee;

import java.util.LinkedList;

public class TreeMain {
    public static void main(String[] args) {
        LinkedList<Node> wezly=new LinkedList<>();
        Node korzen=new Node(null,"KOrzeń");

        wezly.add(korzen);
        Node B=new Node(korzen,"B");
        Node C=new Node(korzen,"C");
        Node D=new Node(korzen,"D");
        korzen.setChildren(B);
        korzen.setChildren(C);
        korzen.setChildren(D);
        wezly.add(B);
        wezly.add(C);
        wezly.add(D);
        Node E=new Node(B,"E");
        Node F=new Node(B,"F");
        Node G=new Node(B,"G");
        Node H=new Node(D,"H");
        B.setChildren(E);
        B.setChildren(F);
        B.setChildren(G);
        D.setChildren(H);
        wezly.add(E);
        wezly.add(F);
        wezly.add(G);
        wezly.add(H);


        Tree treePierwsze=new Tree(wezly);
        treePierwsze.getTree().stream().forEach(s->s.printNode());
       // .forEach(System.out::println);

    }
}
