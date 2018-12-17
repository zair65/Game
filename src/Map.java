
public class Map {
private int newplayerlocationi; 
private int newplayerlocationj; 



 public Map(int playerlocationi,int playerlocationj){
	 int[] maplocationi= {0,1,2,3,4,5,6,7,8,9,10}; 
	 int[] maplocationj= {0,1,2,3,4,5,6,7,8,9,10};
	
	 for(int j=0;j<maplocationj.length;j++)   {
		         
		      for(int i=0;i<maplocationi.length;i++)  { 
		    	  
		    	  if((playerlocationi<0) || (playerlocationi>10) || (playerlocationj<0) || (playerlocationj>10)) { 
		    		  System.out.println("Error edge of Map!"); 
		    	  }
		      
		    	  else if((maplocationi[i]==playerlocationi) && (maplocationj[j]==playerlocationj)) { 
		    		        newplayerlocationi=maplocationi[i];
		    		        newplayerlocationj=maplocationj[j]*10;
		    	            int newplayerlocation = newplayerlocationi+newplayerlocationj; 
		    	  }
		    	 
		    	 
		    		 
		    	  }
		    		 
		      }
	 }
 }
