package webService.RESTWS;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository {
   List<Alien> aliens;
   public AlienRepository() {
	   aliens= new ArrayList<>();
	   Alien a1=new Alien();
	     a1.setName("fatema");
	     a1.setPoints(60);
	     
	     Alien a2=new Alien();
	     a2.setName("farzana");
	     a2.setPoints(60);
	     aliens.add(a1);
	     aliens.add(a2);
   }
   public List<Alien> getAlien(){
	   return aliens;
   }
   public Alien getAlien(int points) {
	 
	   for(Alien a:aliens) {
		 if(a.getPoints()==points) 
			 return a;
	   }
	   return null;
   }
}
