
public class Interrupt extends Thread{
	Eliza eliza;
	Thread session;
	Interrupt(Eliza eliza, Thread session){
		this.eliza = eliza;
		this.session = session;
	}
	public void run(){
		while(session.isAlive()){
			try{
				Thread.sleep(5000);
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println(eliza.randomSet(eliza.hedgeSet));
		}
	}
}
