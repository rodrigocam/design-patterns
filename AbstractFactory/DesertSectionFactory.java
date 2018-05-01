public class DesertSectionFactory extends SectionFactory{

  @Override
  public Animal createAnimal(){
    return new DesertAnimal();
  }

  @Override
  public Tree createTree(){
    return new DesertTree();
  }
}
