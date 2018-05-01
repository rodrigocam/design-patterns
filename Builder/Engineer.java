public class Engineer{
  private HostBuilder hostBuilder;

  public Engineer(HostBuilder hostBuilder){
    this.hostBuilder = hostBuilder;
  }

  public void constructHost(){
    hostBuilder.buildHead();
    hostBuilder.buildTorso();
    hostBuilder.buildArms();
    hostBuilder.buildLegs();
  }
}
