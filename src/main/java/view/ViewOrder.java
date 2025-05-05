package view;

import controller.CarController;
import controller.OrderController;
import entity.Car;
import entity.Order;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ViewOrder
    {
        private OrderController orderController;

        public ViewOrder(OrderController orderController)
            {
                this.orderController = orderController;
            }

        public void start()
            {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                Scanner scanner = new Scanner(System.in);
                while (true)
                    {
                        String choice;
                        System.out.println("Выберите пункт:");
                        System.out.println("1.Добавить заказ");
                        System.out.println("2.Смотреть список заказов");
                        System.out.println("3.Изменить заказ");
                        System.out.println("4.Удалить заказ");

                        choice = scanner.nextLine();

                        switch (choice)
                            {
                                case "1":
                                    System.out.println("выбрали добавить");
                                    System.out.println("Введите имя пользователя создателя заказа");
                                    String userName = scanner.next();

                                    System.out.println("Введите id автомобиля в заказе");
                                    int idCar = Integer.parseInt(scanner.next());

                                    System.out.println("Введите время");
                                    LocalDate date = LocalDate.parse(scanner.next(), dtf);

                                    System.out.println("Введите Количество");
                                    String status = scanner.next();



                                    Order order = new Order(userName, idCar, date,status);
                                    orderController.save(order);
                                    break;


                                case "2":
                                    System.out.println("выбрали просмотр");
                                    orderController.findAll().forEach(System.out::println);
                                    break;

                                case "3":
                                    System.out.println("выбрали обновить");
                                    System.out.println("Введите ID");
                                    int id = Integer.parseInt(scanner.next());
                                    System.out.println("Введите имя пользователя создателя заказа");
                                     userName = scanner.next();

                                    System.out.println("Введите id автомобиля в заказе");
                                     idCar = Integer.parseInt(scanner.next());

                                    System.out.println("Введите время");
                                     date = LocalDate.parse(scanner.next(), dtf);

                                    System.out.println("Введите Количество");
                                     status = scanner.next();


                                    order = new Order(id, userName, idCar, date, status);
                                    orderController.update(id, order);
                                    break;

                                case "4":
                                    System.out.println("удаление");
                                    System.out.println("Выберите, какой заказ удалить по ID");
                                    id = Integer.parseInt(scanner.next());
                                    orderController.deleteById(id);
                                    break;


                            }

                    }
            }
    }
