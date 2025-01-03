package loop.sparta.week01.staticFolder;

public class CarMain {
    public static void main(String[] args) {

        // 클래스 필드 company 확인
        System.out.println(Car.company);
        // 클래스 필드 변경 및 확인
        Car.company = "Audi";
        System.out.println(Car.company + "\n");

        // 클래스 메서드 호출
        String companyName = Car.setCompany("Benz");
        System.out.println("companyName= " + companyName);

        System.out.println();
        // 참조형 변수 사용
        Car car = new Car();

        // company 멤버변수와 setCompany() 메서드는 static이기 때문에
        // 아래처럼 사용하는걸 추천하지 않음. 단지 이런 예시도 있다를 보여주는것 뿐.
        car.company = "Ferrari";
        System.out.println("권장사항 아님: " + car.company);

        String companyName2 = car.setCompany("Lamborghini");
        System.out.println("이것도 권장사항 아님: " + companyName2);




    } //main 종료
}
