package week3.day1;

public class Automation extends MultipleLanguage implements Language,TestTool {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation at=new Automation();
		at.ruby();
		at.Phyton();
		at.Selenium();
		at.Java();

	}

	@Override
	public void ruby() {
		System.out.println("Ruby implemented as a part of Autoamtion class");
		
	}

	@Override
	public void Java() {
		System.out.println("Java implemented as a part of Autoamtion class");
		
	}

	@Override
	public void Selenium() {
		System.out.println("Selenium implemented as a part of Autoamtion class");
		
	}

}
