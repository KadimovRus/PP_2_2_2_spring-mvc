package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/cars")
public class CarController {

    private CarDao carDao;

    @Autowired
    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping
    public String getListCar(HttpServletRequest request, Model model) {
        int count = 0;
        try {
            count = Integer.parseInt(request.getParameter("count"));
        } catch (Exception e) {

        }
        model.addAttribute("cars", carDao.getListCar(count));

        return "cars/list";
    }

}
