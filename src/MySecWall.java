
public class MySecWall extends MethodOfSec{
	private String passw;
	
	public MySecWall(String pass) {
		this.passw = pass;
	}
	
	public void setPass(String pass) {
		String a ="";
		for(int j=0;j<pass.length();j++) {
			a += pass.charAt(j);
		}
		
		for(int i = 0;i<pass.length();i++) {
			char ch = method(a.charAt(i));
			a = a.replace(a.charAt(i), ch);
		}
		this.passw = a;
	}
		
	public String getPass() {
		return passw;
	}

	@Override
	public String toString() {
		return "NEW PASS: " +getPass();
	}
	
	
}
