import java.util.*;
import java.util.stream.Collectors;

class Name {
    private String first,last;
    Name(String f, String l) { first=f; last=l;}
    Name() {}
    @Override public String toString() { return first + " " + last; }
    public static int compareByLastName(Name n1, Name n2)
    {
        return n1.last.compareTo(n2.last);
    }
}
public class MethodRefTest {
//    public static void main(String[] args) {
//        Name n1 = new Name("Harry","Homeowner");
//        Name n2 = new Name("Paul","Painter");
//        Name n3 = new Name("Jane","Doe");
//        List<Name> nameList = Arrays.asList(n1,n2,n3);
//        nameList.sort(Name::compareByLastName);
//        nameList.forEach(System.out::println);
//
//    }

    public static void main(String[] args) {
        final List<String> list = Arrays.asList("1","2","3","4","5");
        final List<String> list2 = Arrays.asList("11","2","3","14","15");
        Set<String> set = list.stream().collect(Collectors.toSet());
        Set<String> set2 = list2.stream().collect(Collectors.toSet());
        set.addAll(set2);

        System.out.println(set);
    }
}