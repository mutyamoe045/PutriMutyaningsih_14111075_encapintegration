
public class Bonek extends SuporterBola  {
 
    private String mendukung ;
    private String team;
   
    public void setMendukung(String mendukung){
        this.mendukung=mendukung;
    }
    public void setTeam(String tm){
        this.team = tm;        
    }
    public String getMendukung(){
        return mendukung;
    }
    public String getTeam(){
        return team;
    }    

    
    @Override
    protected void Tmplasal() {
     super.setasal("Bandung dan Surabaya"); 
     System.out.println("Asal Suporter = " +super.getasal());
    }

    @Override
    protected void Tmplwarna() {
       super.setwarna("Biru dan Hijau"); 
     System.out.println("Warna khas supporter = " +super.getwarna());
    }
    public void Bersorak(String brs) {
		System.out.println(brs);
}
    public void Bersorak(String brs1, String brs2) {
		System.out.println(brs1 + brs2);
}

    
}
