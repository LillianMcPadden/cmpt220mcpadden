public class TestEdible {
    public static void main(String[] args) {
        Animal[] list = new Animal[5];
        list[0] = new Chicken();
        list[0].setWeight(4.5);
        list[1] = new Tiger();
        list[1].setWeight(46.6);
        list[2] = new Chicken();
        list[2].setWeight(1.5);
        list[3] = (Animal) (list[0].clone());
        list[3].setWeight(7.5);
        list[4] = (Animal) (list[1].clone());
        java.util.Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println("weight: " + list[i].getWeight());
        }
    }
}

abstract class Animal implements Cloneable, Comparable<Animal>{
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /** Return animal sound */
    public abstract String sound();

    @Override /** Override the protected clone method defined in 
    the Object class, and strengthen its accessibility */
    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException ex) {
            return null;
        }
    }

  @Override // Implement the compareTo method defined in Comparable
  public int compareTo(Animal o) {
    if (weight > o.weight)
      return 1;
    else if (weight < o.weight)
      return -1;
    else
        return 0;
    }  
}

class Chicken extends Animal implements Edible {
    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }

    @Override
    public String sound() {
        return "Chicken: cock-a-doodle-doo";
    }
}

class Tiger extends Animal {
    @Override
    public String sound() {
        return "Tiger: RROOAARR";
    }
}

abstract class Fruit implements Edible {
    // Data fields, constructors, and methods omitted here
}

class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Apple: Make apple cider";
    }
}

class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Orange: Make orange juice";
    }
}