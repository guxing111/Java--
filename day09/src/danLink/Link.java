package danLink;

public class Link {
    Node header = null;
    int size = 0;
    public int size(){
        return size;
    }
    public void add(Object data){
        if (header == null){
            header = new Node(data,null);
        }else{
            Node currentLastNobe = findLast(header);
            currentLastNobe.next = new Node(data,null);
        }
        size++;
    }

    private Node findLast(Node nobe) {
        if (nobe.next == null){
            return nobe;
        }
        return findLast(nobe.next);
    }

  /*  public void remove(Object data){
        Nobe temp = header;
        boolean flag = false;
        while (true){
            if (temp.data == data){
                flag = true;
                break;
            }
            temp = header.next;
        }
        if (flag){
            temp.next = temp.next.next;

        }else{
            System.out.println("没有找到此节点");
        }
        size--;
    }*/
  public void remove(Object data) {
      Node temp = header;
      boolean flag = false;
      while (true) {
          if (temp.data == data) {
              flag = true;
              break;
          }
          temp = header.next;
      }
      if (flag) {
          temp.next = temp.next.next;
      }else {
          System.out.println("没有找到此节点");
      }
      size--;
  }
   /* public void modify(Object obj){

    }
    public int find(Object obj){
        return 1;
    }*/
   public void update(Object obj, Object newobj) {
       Node temp = header;
       boolean flag = false;
       while (true) {
           if (temp.data == obj) {
               flag = true;
               break;
           }
           temp = header.next;
       }
       if (flag) {
           temp.data = newobj;
       }else {
           System.out.println("没有找到此节点");
       }
   }
    //查
    public Object select(Object o) {
        Node temp = header;
        boolean flag = false;
        while (true) {
            if (temp.data == o) {
                flag = true;
                break;
            }
            temp = header.next;
        }
        if (flag) {
            System.out.println("你所查的数据为" + temp.data);
        }
        return size;
    }
}

