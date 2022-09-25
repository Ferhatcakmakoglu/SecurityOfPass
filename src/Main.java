
public class Main {

	public static void main(String[] args) {
		String pass = "FerHaYt65/*==?";
		String oldPass = pass;
		MySecWall msw = new MySecWall(pass);
		msw.setPass(pass);
		System.out.println("OLD PASS: " +oldPass);
		System.out.println(msw.toString());
	}

}
