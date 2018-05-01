public abstract class Host implements Cloneable{
  public String name;
  
  public Host clone(){
    Object clone = null;
    try{
      clone = super.clone();
    }catch(CloneNotSupportedException e){
      e.printStackTrace();
    }
    return (Host) clone;
  }
}
