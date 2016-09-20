
public class Session extends Thread{
	Eliza eliza;
	Session(Eliza eliza){
		this.eliza=eliza;
	}
	public void run(){
		eliza.start();
	}

}
