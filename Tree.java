public class Tree <t extends Comparable<t>>{
    private Node<t> root;

    Tree(){
        this.root = null;
    }

    private void checkBal(Node<t> x){
        Node<t> pai = x.getParent();
        if(pai != null)
        {
            Node<t> avo = pai.getParent();
            if(avo != null)
            {
                Node<t> tio = avo.getLeft();
                if(tio.equals(pai))
                {
                    tio = avo.getRight();
                }

                if(tio != null)
                {
                    if(pai.getCor().equals("vermelho") && tio.getCor().equals("vermelho"))
                    {
                        pai.setCor("preto");
                        tio.setCor("preto");
                        if(avo.equals(root) == false)
                        {
                            avo.setCor("vermelho");
                        }
                    }
                }
            }
        }
    }

    public void insert(t value){
        if(root == null)
        {
            root = new Node<>(value, "preto", null);
        }
        else
        {
            root = insert(root, value);
        }
    }

    private Node<t> insert(Node<t> x, t value){
        if(x == null)
        {
            x = new Node<>(value, "vermelho", null);
        }
        else if(value.compareTo(x.getInfo()) < 0)
        {
            x.setLeft(insert(x.getLeft(), value));
            if(x.getLeft().getParent() == null)
            {
                x.getLeft().setParent(x);
                checkBal(x);
            }
        }
        else
        {
            x.setRight(insert(x.getRight(), value));
            if(x.getRight().getParent() == null)
            {
                x.getRight().setParent(x);
                checkBal(x);
            }
        }
        return x;
    }

    public void remove(t value){
        if(root == null)
        {
            System.out.println("There is nothing to remove");
        }
        else
        {
            root = remove(root);
        }
    }

    private Node<t> remove(Node<t> x){
        if(x != null)
        {
            
        }
        return null;
    }
}