package open_closed_principle;

public class Main {
    public static void main(String[] args) {

    }
}

class AreaCalculator {
    private void squareArea(Double width, Double height) {
        System.out.println(height * width);
    }

    private void circleArea(Double radius) {
        System.out.println(radius * radius * 3.14);
    }
}


