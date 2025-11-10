
public class Main {

    public static void main(String[] args) {
        // make test programs here
        SimpleDate d = new SimpleDate(1, 2, 2000);
        SimpleDate e = new SimpleDate(2, 3, 1999);
        SimpleDate f = new SimpleDate(2, 4, 2001);
        SimpleDate g = new SimpleDate(5, 6, 1999);
System.out.println(d.equals("heh"));
System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
System.out.println(d.equals(new SimpleDate(1, 2, 2000)));
        System.out.println(d.hashCode());
        System.out.println(e.hashCode());
        System.out.println(f.hashCode());
        System.out.println(g.hashCode());

    }
}
