public class Main{

     public static void main(String []args){
        SectionFactory desertSectionFactory = SectionFactory.getFactory("desert");
        SectionFactory forestSectionFactory = SectionFactory.getFactory("forest");

        Tree cactus = desertSectionFactory.createTree();
        Tree oak = forestSectionFactory.createTree();

        Animal rattlesnake = desertSectionFactory.createAnimal();
        Animal deer = forestSectionFactory.createAnimal();

        cactus.grow();
        oak.grow();

        rattlesnake.walk();
        deer.walk();
     }

}
