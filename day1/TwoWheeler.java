package week1.day1;

public class TwoWheeler {
	
	public int noOfWheels=2;
	public short noOfMirrors =2;
	public long chassisNumber=342343l;
	public boolean isPunctured=false;
	public String bikeName="23473AH";
	public double runningKMc=374782.85;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler tw= new TwoWheeler();
		System.out.println(tw.noOfWheels+" is the Number of Wheels in the bike");
		System.out.println(tw.noOfMirrors+" is the Number of Mirrors in the bike");
		System.out.println(tw.chassisNumber+" is the Chassis Number of the bike");
		System.out.println(tw.isPunctured+" If the bike is punctured");
		System.out.println(tw.bikeName+" is the Number of Wheels in the bike");
		System.out.println(tw.runningKMc+"is the kilometer run in the bike");
	}

}
