
public class ObserverPatternDemo
{

	public static void main(String[] args)
	{
		Subject subject = new Subject();
		new BinaryObserver(subject);
		new OctalObserver(subject);
		
		System.out.println("Primo cambio di stato");
		subject.setState(15);
		System.out.println("Secondo cambio di stato");
		subject.setState(10);
	}

}
