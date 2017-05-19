
public abstract class SuporterBola {
    
    protected String asal;
    protected String warna;
	
    protected String getasal() {
        return this.asal;
        
    }
    
    protected String getwarna () {
        return this.warna;
        
    }
    public void setasal(String asal) {
      this.asal= asal;  
        
    }
    
    public void setwarna(String wrn) {
        this.warna=wrn;
    }
    
    protected abstract void Tmplasal();
    protected abstract void Tmplwarna();
    
	
}