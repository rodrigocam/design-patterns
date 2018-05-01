public abstract class SectionFactory{

  public static SectionFactory getFactory(String factoryType){
    SectionFactory factory;
    switch(factoryType){
      case "desert": factory = new DesertSectionFactory();break;
      case "forest": factory = new ForestSectionFactory();break;
      default: factory = null;
    }
    return factory;
  }
  public abstract Animal createAnimal();
  public abstract Tree createTree();
}
