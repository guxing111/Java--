package danLink;

public class Demo {
    public static void main(String[] args) {
        Link link = new Link();
        link.add("100");
        link.add("200");
        link.add(111111111);
        link.add("abc");
        link.remove("abc");
        int size1 = link.size();
        System.out.println(size1);

    }
}
