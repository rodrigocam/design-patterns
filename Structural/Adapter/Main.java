public class Main{

     public static void main(String []args){
        /* current code
----------------------------------------------
        EyeSensor eyeSensor = new EyeSensor();
        eyeSensor.blink(3);
---------------------------------------------
        */

        /* new code after the new eye sensor implementation and an adapter */
        EyeSensorAdapter eyeSensor = new EyeSensorAdapter();
        eyeSensor.blink(3);
     }

}
