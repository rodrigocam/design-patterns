public class Main{

     public static void main(String []args){
        HostBuilder femaleHostBuilder = new FemaleHostBuilder();
        HostBuilder maleHostBuilder = new MaleHostBuilder();

        Engineer femaleHostEngineer = new Engineer(femaleHostBuilder);
        Engineer maleHostengineer = new Engineer(maleHostBuilder);

        femaleHostEngineer.constructHost();
        maleHostengineer.constructHost();
     }

}
