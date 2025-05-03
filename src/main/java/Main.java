
import entity.Car;
import service.CrudImpl;

import java.util.HashMap;
import java.util.Scanner;

public class Main
    {

        public static void main(String[] args)
            {
                CrudImpl crud = new CrudImpl();
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
                                crud.create(scanner,carList);
                                break;


                                case "2":
                                    crud.read(carList);
                                    break;

                                case "3":
                                    crud.update(scanner,carList);
                                    break;

                                case "4":
                                    crud.delete(scanner,carList);
                                    break;



                        }

                }
            }
    }
