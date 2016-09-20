
public class ElizaApp {
	public static void main(String[] args) {
		Eliza eliza = new Eliza();
		Thread session = new Session(eliza);
		Thread interupt = new Interrupt(eliza,session);
		session.start();
		interupt.start();
		//System.out.println(eliza.replace("I my me"));
	}
}
