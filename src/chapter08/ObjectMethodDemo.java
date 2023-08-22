package chapter08;

public class ObjectMethodDemo {
    public static void main(String[] args) {
        Mouse mouse = new Mouse("삼성");
        System.out.println(mouse.name);
        System.out.println(mouse);

        Keyboard keyboard = new Keyboard("삼성");
        System.out.println(keyboard.name);
        System.out.println(keyboard);
    }
}

class  Mouse{

    String name;

    public Mouse(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "제조사가 " +name+ "인 마우스 입니다.";
    }
}
class Keyboard{
    String name;
    public Keyboard(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "제조사가 " +name+" 인 키보드 입니다.";
    }
}
