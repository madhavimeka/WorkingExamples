package Inheritanc;

public class SbiTrade extends Trade {
	int sbitradeid;
	String sbitradename;
	void getSbiTrade(int sbitradeid, String sbitradename ) {
		System.out.println("sbi Trade..."+ sbitradeid + " "+sbitradename);
		
	}
	public static void main (String [] args) {
		SbiTrade s = new SbiTrade();
		s.getSbiTrade(111, "sbi");
		s.getTradeDetails(222, "parent");
		HsbcTrade H = new HsbcTrade();
		H.getTradeDetails(1023, "hsbc");
		
	}
	

}
