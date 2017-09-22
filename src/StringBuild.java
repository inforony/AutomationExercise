
public class StringBuild {
	
	public StringBuild() {
		
	String input = "hope you are doing well";
    StringBuilder input1 = new StringBuilder();
    input1.append(input);
    input1 = input1.reverse();
    for(int i = 0; i<input1.length();i++) {
    	System.out.print(input1.charAt(i));
    }

}
}