package cs187.asn02;

/**
 * The Visit class represents a visited web page. We are
 * only simulating this so we generate a new unique value
 * for each Visit object we construct. 
 */
public class Visit {

	private static int sitenum = 0;
	
	private final int site;
	
	public Visit() {
		site = sitenum++;
	}
	
	public int getSite() {
		return site;
	}
	
	public String toString() {
		return "website[" + site + "]";
	}
	
}
