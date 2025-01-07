package overriding.poly.ex2;

public class AnimalSoundMain {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        soundAnimal(dog);
        soundAnimal(cat);

    }

    // 동물이 추가되도 변하지 않는 코드
    public static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
