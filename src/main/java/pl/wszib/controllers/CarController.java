package pl.wszib.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.wszib.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

  /*  @GetMapping("/list")
    public List<Car> getList(){
        List<Car> carList = generateList();
        return carList;
    }
*/

    @GetMapping("car/list")
    public String getList(Model model){
        List<Car> list = generateList();
        model.addAttribute("list", list);

        return "viewTemplate";
    }

    @GetMapping("car/single/{index}")
    public String getOne(Model model, @PathVariable int index){
        List<Car> list = generateList();
        Car car = list.get(index);
        model.addAttribute(car);

        return "viewOneTemplate";
    }

    @GetMapping("links")
    public String links(Model model){
        return "linksTemplate";
    }


    private List<Car> generateList(){
        List<Car> list = new ArrayList<>();

        Car car1 = new Car();
        car1.setMarka("VW");
        car1.setModel("T");
        car1.setCena(45660.);
        car1.setPrzebieg(567000L);
        car1.setRocznik("1994");
        list.add(car1);

        Car car2 = new Car();
        car2.setMarka("VW");
        car2.setModel("T");
        car2.setCena(45660.);
        car2.setPrzebieg(567000L);
        car2.setRocznik("1994");
        list.add(car2);

        Car car3 = new Car();
        car3.setMarka("VW");
        car3.setModel("T");
        car3.setCena(45660.);
        car3.setPrzebieg(567000L);
        car3.setRocznik("1994");
        list.add(car3);

        Car car4 = new Car();
        car4.setMarka("VW");
        car4.setModel("T");
        car4.setCena(45660.);
        car4.setPrzebieg(567000L);
        car4.setRocznik("1994");
        list.add(car4);

        Car car5 = new Car();
        car5.setMarka("VW");
        car5.setModel("T");
        car5.setCena(45660.);
        car5.setPrzebieg(567000L);
        car5.setRocznik("1994");
        list.add(car5);

        Car car6 = new Car();
        car6.setMarka("VW");
        car6.setModel("T");
        car6.setCena(45660.);
        car6.setPrzebieg(567000L);
        car6.setRocznik("1994");
        list.add(car6);

        Car car7 = new Car();
        car7.setMarka("VW");
        car7.setModel("T");
        car7.setCena(45660.);
        car7.setPrzebieg(567000L);
        car7.setRocznik("1994");
        list.add(car7);

        Car car8 = new Car();
        car8.setMarka("VW");
        car8.setModel("T");
        car8.setCena(45660.);
        car8.setPrzebieg(567000L);
        car8.setRocznik("1994");
        list.add(car8);

        return list;
    }

    @GetMapping("car/form")
    public String addCar(Model model){
        model.addAttribute("car",new Car());

        return "formAddTemplate";
    }

    @PostMapping("car/form")
    public String saveCar(Car car, Model model){

        List<Car> carList = generateList();
        carList.add(car);
    return "formSuccess";
    }

}
