public class Main {
    public static void main(String[] args) {
        Husky h = new Husky("blue");
        h.setName("Marty");
        System.out.println(h);
        System.out.println(h.getInfo());

        Pug p = new Pug("grey","Corny");
        System.out.println(p);
        System.out.println(p.getInfo());
    }
}