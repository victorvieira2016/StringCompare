//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StringCompare {
    public static void main(String[] args) {

        String s1 = new String("hello");
        String s2 = "good bye";
        String s3 = "Happy Birthday";
        String s4 = "happy birthday";

        if(s1.equals("hello"))
            System.out.println("s1 equals (hello)");
        else
            System.out.println("s1 not equals (hello)");

        if(s1 == "hello")
            System.out.println("s1 == (hello)");
        else
            System.out.println("s1 not == (hello)");

        if(s3.equalsIgnoreCase(s4))
            System.out.printf("%n%s equals %s, with case equalsIgnoreCase%n", s3, s4);
        else
            System.out.printf("%n%s equals %s%n", s3, s4);

        System.out.printf("%ns1.compareTo(s2) is %d", s1.compareTo(s2));
        System.out.printf("%ns2.compareTo(s1) is %d", s2.compareTo(s1));
        System.out.printf("%ns1.compareTo(s1) is %d", s1.compareTo(s1));
        System.out.printf("%ns3.compareTo(s4) is %d", s3.compareTo(s4));
        System.out.printf("%ns4.compareTo(s3) is %d%n", s4.compareTo(s3));

        if(s3.regionMatches(0, s4, 0, 5))
            System.out.printf("%nFirst 5 characters of s3 and s4 match");
        else
            System.out.printf("%nFirst 5 characters of s3 and s4 doesn't match");

        if(s3.regionMatches(true,0, s4, 0, 5))
            System.out.printf("%nFirst 5 characters of s3 and s4 match");
        else
            System.out.printf("%nFirst 5 characters of s3 and s4 doesn't match");


    }
}