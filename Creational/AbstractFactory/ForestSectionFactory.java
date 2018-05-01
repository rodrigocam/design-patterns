public class ForestSectionFactory extends SectionFactory{

  @Override
  public Animal createAnimal(){
    return new ForestAnimal();
  }

  @Override
  public Tree createTree(){
    return new ForestTree();
  }
}
