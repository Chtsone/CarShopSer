
import java.util.HashMap;
import java.util.Scanner;

public class Main
    {

        public static void main(String[] args)
            {

                HashMap<Integer,Car> carList = new HashMap<>();
                Car test = new Car("golf","k3","Green",3,75000);
                Car test2 = new Car("golf","k3","Green",3,75000);

                carList.put(test.getId(),test);
                Scanner scanner = new Scanner(System.in);
                while (true){
                    String choice;
                    System.out.println("Выберите пунк:");
                    System.out.println("1.Добавить");
                    System.out.println("2.Смотреть");
                    System.out.println("3.Изменить");
                    System.out.println("4.Удалить");

                    choice = scanner.nextLine();

                    switch (choice)
                        {
                            case "1":
                                System.out.println("выбрали добавить");
                                System.out.println("Введите Марку");
                                String brand = scanner.next();

                                System.out.println("Введите Модель");
                                String model = scanner.next();

                                System.out.println("Введите Цвет");
                                String color = scanner.next();

                                System.out.println("Введите Количество");
                                int quantity = Integer.parseInt(scanner.next());

                                System.out.println("Введите Цену");
                                double price = Double.parseDouble(scanner.next());


                                Car car = new Car(brand, model, color, quantity, price);
                                carList.put(car.getId(),car);
                                break;


                                case "2":
                                    System.out.println("выбрали просмотр");
                                    carList.entrySet().stream().forEach(entry -> System.out.println(entry.getValue().toString()));
                                    break;

                                case "3":
                                System.out.println("изменения");
                                break;
                        }

                }
            }
    }
