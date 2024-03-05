import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Выберите фигуру для подсчета:\n1. Квадрат\n2. Треугольник");
            int choice = scanner.nextInt();

            Shape shape;
            switch (choice) {
                case 1:
                    System.out.println("Введите длину стороны квадрата:");
                    double side = scanner.nextDouble();
                    shape = new Square(side);
                    break;
                case 2:
                    System.out.println("Введите основание, стороны и высоту треугольника:");
                    double a = scanner.nextDouble();
                    double b = scanner.nextDouble();
                    double c = scanner.nextDouble();
                    double h = scanner.nextDouble();
                    shape = new Triangle(a, b, c, h);
                    break;
                default:
                    System.out.println("Некорректный выбор");
                    continue;
            }

            System.out.println("Площадь: " + shape.S());
            System.out.println("Периметр: " + shape.P());
        }
    }
}