public abstract class Lab{

    protected Host host;

    public abstract Host createHost(String hostType);

    public void repairHost(){
        System.out.println("Repairing host");
    }
}
