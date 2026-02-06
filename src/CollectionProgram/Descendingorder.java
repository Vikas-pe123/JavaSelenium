package CollectionProgram;
import java.util.TreeSet;
public class Descendingorder {
public static void main(String[] args) {
TreeSet<String> ts = new TreeSet<String>(new MyCom());
ts.add("Pune");
ts.add("Mumbai");
ts.add("Chennai");
ts.add("Delhi");
ts.add("Pune");
ts.add("Chennai");
	System.out.println(ts);
	}
}
