public class Main{

     public static void main(String []args){
        Host femaleHost = new FemaleHost("Dollores");
        Host maleHost = new MaleHost();

        Host femaleClone = femaleHost.clone();
        Host maleClone = maleHost.clone();

        System.out.println("Original: " + femaleHost.name);
        System.out.println("Clone: " + femaleClone.name);
     }
}
