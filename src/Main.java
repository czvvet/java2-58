
public class Main {

	public static void main(String[] args) {
		Greetable g1 = new EnglishGreeter();
		Greetable g2 = new JapaneseGreeter();
		Greetable g3 = new KoreanGreeter();
		
		g1.greet();
		g2.greet();
		g3.greet();
		

	}

}
