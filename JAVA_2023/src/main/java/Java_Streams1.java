import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java_Streams1 {

	public static void main(String[] args) {

		String[] arr= {"Rahul","Ankit","Mahesh","Kavit","anamika","vaishnavee","hjkknsdl"};
		List<String> a= Arrays.asList(arr);
		
        a.stream().map(s->s.concat(" This element is concatinated")).forEach(s->System.out.println(s));
       Stream.of("1","2","3","4","5","6","7","8").filter(z->z.matches("1")).map(z->z.concat("Hello")).forEach(x->System.out.println(x));
        
        Stream.of(arr).forEach(x->System.out.print(x+" "));
        
        //Map function
        Stream.of("Henna", "Devang","Reena","URmila","Pooja","Priya").map(x->x.toUpperCase()).forEach(x->System.out.println(x+" "));

	}

}
  