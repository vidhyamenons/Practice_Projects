import java.util.ArrayList;
import java.util.stream.Stream;

public class JavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stream.of("Abhijith", "John", "Cathy", "Don", "Amjith").sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijith");
		names.add("John");
		names.add("Don");
		names.stream().filter(s->s.startsWith("D")).forEach(s->System.out.println(s));
		
		Stream.of(3,6,1,7,7,3,9,7,6,1).distinct().sorted().forEach(s->System.out.println(s));
				

	}

}
