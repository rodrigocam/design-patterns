public class Main{

     public static void main(String []args){
        WestWorldLab myLab = new WestWorldLab();
        Host dollores = myLab.createHost("farm");
        Host maeve = myLab.createHost("brothel");

        dollores.toWelcome();
        maeve.toWelcome();
     }

}
