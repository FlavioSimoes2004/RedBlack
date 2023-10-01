class Node<t extends Comparable<t>>{
    String cor;
    Node<t> left, right, parent;
    t info;

    Node(t info, String cor, Node<t> parent){
        this.info = info;
        this.cor = cor;
        this.parent = parent;
        this.left = this.right = null;
    }

    Node(t info, String cor, Node<t> parent, Node<t> left, Node<t> right){
        this.info = info;
        this.cor = cor;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }

    public void setInfo(t info){
        this.info = info;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setParent(Node<t> parent){
        this.parent = parent;
    }

    public void setLeft(Node<t> left){
        this.left = left;
    }

    public void setRight(Node<t> right){
        this.right = right;
    }

    public t getInfo(){
        return info;
    }

    public String getCor(){
        return cor;
    }

    public Node<t> getParent(){
        return parent;
    }

    public Node<t> getLeft(){
        return left;
    }

    public Node<t> getRight(){
        return right;
    }

    public String toString(){
        String str = info.toString() + " ";
        if(getCor() == "preto")
        {
            str += "p";
        }
        else
        {
            str += "v";
        }
        return str;
    }
}