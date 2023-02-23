	public class Donations {
	    
	    int numIndividual;
	    double amtIndividual;
	    int numBusiness;
	    double amtBusiness;
	    int numOther;
	    double amtOther;

	    
	    public void processDonation(String cat,double donation){
	        
	        
	        
	        
	        if(cat.equals("individual")){
	            if(donation>0){
	                numIndividual++;
	                amtIndividual = amtIndividual + donation;
	            }
	            else{
	                numIndividual--;
	                amtIndividual = amtIndividual - donation;
	            }
	        }
	        else if(cat.equals("business")){
	            if(donation>0){
	                numBusiness++;
	                amtBusiness = amtBusiness + donation;
	            }
	            else{
	                numBusiness--;
	                amtBusiness = amtBusiness - donation;
	            }
	        }
	        else if(cat.equals("other")){
	            if(donation>0){
	                numOther++;
	                amtOther = amtOther + donation;
	            }
	            else{
	                numOther--;
	                amtOther = amtOther - donation;
	            }
	        }

	        
	        System.out.printf("%-13s \"donation amount\" %5.2f\n",cat,donation);

	    }

	    
	    public void getStatistics(){

	        
	        System.out.println();
	        System.out.println("Number of donations for individual :"+numIndividual);
	        System.out.println("Total donations for individual :"+amtIndividual);
	        System.out.println();
	        System.out.println("Number of donations for business :"+numBusiness);
	        System.out.println("Total donations for business :"+amtBusiness);
	        System.out.println();
	        System.out.println("Number of donations for other :"+numOther);
	        System.out.println("Total donations for other :"+amtOther);
	    }

	}