public class WestWorldLab extends Lab{

    @Override
    public Host createHost(String hostType){
        if(hostType.equals("farm")){
            super.host = new FarmHost();
            return super.host;
        }else if(hostType.equals("brothel")){
            super.host = new BrothelHost();
            return super.host;
        }
        return null;
    }
}
