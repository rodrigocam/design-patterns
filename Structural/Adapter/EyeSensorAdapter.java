public class EyeSensorAdapter extends EyeSensor{
  private NewEyeSensor newEyeSensor;

  public EyeSensorAdapter(){
    this.newEyeSensor = new NewEyeSensor();
  }

  @Override
  public void blink(int blinkTimes){
    for(int i=0; i<blinkTimes; i++){
      newEyeSensor.blink();
    }
  }
}
