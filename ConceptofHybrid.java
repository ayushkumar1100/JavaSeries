class AquaticAnimal
{
  void LiveWater()
  {
      System.out.println("Lives in Water");
  }
}
class Fish extends AquaticAnimal
{
  void SurviveinWater()
  {
      System.out.println("Fish Survive in Water only");
  }
}
class Eat extends Fish
{
  void Eating()
  {
      System.out.println("People eat fish");
  }
}
class Feed extends Fish
{
  void Feeding()
  {
      System.out.println("People feeds fish");
  }
}
class Swim extends Fish
{
  void Swimming()
  {
      System.out.println("fish can Swimming");
  }
}

class ConceptofHybrid
{
    public static void main(String[] args)
    {
        Swim obj1 = new Swim();
        obj1.Swimming();
        obj1.SurviveinWater();
        obj1.LiveWater();

        Feed obj2 = new Feed();
        obj2.Feeding();
        obj2.SurviveinWater();
        obj2.LiveWater();

        Eat obj3 = new Eat();
        obj3.Eating();
        obj3.SurviveinWater();
        obj3.LiveWater();
           
    }
}