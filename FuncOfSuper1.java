
public class FuncOfSuper1 {

	public static void main(String[] args) {
		Ignition obj = new Ignition();

	}

}
class execute{
	execute(){
		System.out.println("Its is executing");
	}
}
class Ignition extends execute{
	Ignition() {
	super();
	}
}