
public class Viking {
        public static void main (String[] args) {
        Bonek bk = new Bonek();
        
        bk.setMendukung("Berdiri dan Bersorak");
        System.out.println("Mendukung Team = " +bk.getMendukung());
        bk.setTeam("PERSIB & PERSEBAYA");
        System.out.println("Team kebanggaan = " +bk.getTeam());
        bk.Tmplasal();
        bk.Tmplwarna();
        bk.setMendukung("Bersorak = Persib till i die \n Bondo nekat");
		System.out.println(bk.getMendukung());
    }

    
}
