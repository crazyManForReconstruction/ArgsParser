import java.text.ParseException;

public class Test{
	public static void main(String[] args){
		//ArgsParser example = new ArgsParser("d,c,s", "-2,-f,-good");
		//example.parse();
		
		/*
		String schema = "a,b,c,d,e";
		String[] args1 = {"-good", "-bad"};
		Args example = new Args(schema, args1);
		
		System.out.println("number Of args:" + example.cardinality());
		System.out.println("errorMessage" + example.errorMessage());
		System.out.println("usage" + example.usage());
		System.out.println("getBoolean: " + example.getBoolean('d'));
		*/
		
		//String schema = "a,b,c,d,e,f*";
		String schema = "a,f*,h,g*";
		String[] args1 = {"-good", "-bad", "-f", "face","-g","google"};
		Args example = null;
		try {
			example = new Args(schema, args1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
		
		System.out.println("number Of args:" + example.cardinality());
		//System.out.println("errorMessage" + example.errorMessage());
		System.out.println("usage" + example.usage());
		System.out.println("getBoolean: " + example.getBoolean('a'));
		System.out.println("getString: " + example.getString('f'));
		System.out.println("getString: " + example.getString('g'));
	}
}
