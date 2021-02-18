import java.util.ArrayList;
import java.util.Objects;

public class Pet_Store {
    public static void main(String[] args) {
        Test.test();
    }

    public interface Pet {
        String getName();

        int getYear();
    }

    public static class Test {
        public static void test() {
            Dog dog = new Pet_Store().new Dog("Petter", 3);
            Cat cat = new Pet_Store().new Cat("Tom", 2);
            Store petStore = new Pet_Store().new Store();
            petStore.addPet(dog);
            petStore.addPet(cat);
            petStore.showMSG();
            System.out.println("====================搜索猫的名称信息:\n输入Tom,输出:\n");
            petStore.showMSG(petStore.Search("Tom"));
            System.out.println("=======================\n删除狗子信息后的商店:\n");
            petStore.deletePet(dog);
            petStore.showMSG();
        }
    }

    public class Store {
        ArrayList<Pet> Pets = new ArrayList<Pet>();

        void addPet(Pet pet) {
            Pets.add(pet);
        }

        void deletePet(Pet pet) {
            Pets.remove(pet);
        }

        void showMSG() {
            for (Pet p : Pets) {
                System.out.println(p);
            }
        }

        void showMSG(ArrayList<Pet> temp) {
            for (Pet p : temp) {
                System.out.println(p);
            }
        }

        ArrayList<Pet> Search(String name) {
            ArrayList<Pet> ans = new ArrayList<Pet>();
            for (Pet pet : Pets)
                if (pet.getName().equals(name))
                    ans.add(pet);
            return ans;
        }
    }

    class Dog implements Pet {
        protected String name;
        protected int year;

        Dog(String name, int year) {
            this.name = name;
            this.year = year;
        }

        @Override
        public String toString() {
            return "狗子:{" +
                    "name='" + name + '\'' +
                    ", year=" + year +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Dog dog = (Dog) o;
            return year == dog.year && Objects.equals(name, dog.name);
        }

        @Override
        public int getYear() {
            return year;
        }

        @Override
        public String getName() {
            return name;
        }

    }

    class Cat extends Dog implements Pet {
        Cat(String name, int year) {
            super(name, year);
        }

        @Override
        public String toString() {
            return "喵星人:{" +
                    "name='" + name + '\'' +
                    ", year=" + year +
                    '}';
        }
    }
}