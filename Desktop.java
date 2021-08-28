package Assign.week3;

public class Desktop implements software,hardware {

	@Override
	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("HardwareResources : " );
	}

	@Override
	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("SoftwareResources : " );
	}
	public static void main(String args[]) {
		Desktop  a = new Desktop ();
	      a.hardwareResources();
	      a.softwareResources();
	   }
}
