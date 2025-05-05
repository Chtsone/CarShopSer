package view;

import controller.CarController;
import entity.Car;

import java.util.Scanner;

public class View
    {
        private CarController carController;

        public View(CarController carController)
            {
                this.carController = carController;
            }

        public void start()
            {

                Scanner scanner = new Scanner(System.in);
                while (true){
                    String choice;
                    System.out.println("Выберите пункт:");
                    System.out.println("1.Добавить машину");
                    System.out.println("2.Смотреть список машин");
                    System.out.println("3.Изменить машину");
                    System.out.println("4.Удалить машину");

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
                                carController.save(car);
                                break;


                            case "2":
                                System.out.println("выбрали просмотр");
                                carController.findAll().forEach(System.out::println);
                                break;

                            case "3":
                                System.out.println("выбрали обновить");
                                System.out.println("Введите ID");
                                int id = Integer.parseInt(scanner.next());
                                System.out.println("Введите Марку");
                                 brand = scanner.next();

                                System.out.println("Введите Модель");
                                 model = scanner.next();

                                System.out.println("Введите Цвет");
                                 color = scanner.next();

                                System.out.println("Введите Количество");
                                 quantity = Integer.parseInt(scanner.next());

                                System.out.println("Введите Цену");
                                 price = Double.parseDouble(scanner.next());


                                 car = new Car(id,brand, model, color, quantity, price);
                                carController.update(id,car);
                                break;

                            case "4":
                                System.out.println("удаление");
                                System.out.println("Выберите, какое авто удалить по ID");
                                id = Integer.parseInt(scanner.next());
                                carController.deleteById(id);
                                break;



                        }

                }
            }
    }
