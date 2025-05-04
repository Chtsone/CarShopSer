import entity.Car;
import org.junit.jupiter.api.*;
import service.CrudImpl;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;

public class MainTest
    {
        private final InputStream original = System.in;
        CrudImpl crud = new CrudImpl();
        static HashMap<Integer, Car> carList = new HashMap<>();





        @AfterEach
        void restorSystemIn()
            {
                System.setIn(original);
            }


        @BeforeAll
        static void setUp()
            {
                Car car = new Car("golf","k3","Green",3,75000);
                carList.put(car.getId(), car);
            }


        @Test
        void createTest()
            {
                String input = "Mazda\ncx5\nGreen\n5\n34\n";
                System.setIn(new ByteArrayInputStream(input.getBytes()));
                Scanner scanner = new Scanner(System.in);
                crud.create(scanner, carList);
                Assertions.assertEquals(carList.get(2).getBrand(),"Mazda");
                Assertions.assertEquals(carList.get(2).getModel(),"cx5");
                Assertions.assertEquals(carList.get(2).getColor(),"Green");
                Assertions.assertEquals(carList.get(2).getQuantity(),5);
                Assertions.assertEquals(carList.get(2).getPrice(),34);

            }
        @Test()
        void updateTest()
            {
                String input = "1\nцвет\nYellow";

                System.setIn(new ByteArrayInputStream(input.getBytes()));
                Scanner scanner = new Scanner(System.in);
                crud.update(scanner, carList);
                Assertions.assertEquals(carList.get(1).getBrand(),"golf");
                Assertions.assertEquals(carList.get(1).getModel(),"k3");
                Assertions.assertEquals(carList.get(1).getColor(),"Yellow");
                Assertions.assertEquals(carList.get(1).getQuantity(),3);
                Assertions.assertEquals(carList.get(1).getPrice(),75000);

            }
        @Test
        void deleteTest()
            {
                String input = "1";
                System.setIn(new ByteArrayInputStream(input.getBytes()));
                Scanner scanner = new Scanner(System.in);

                crud.delete(scanner, carList);
                Assertions.assertNull(carList.get(1));
            }
    }
