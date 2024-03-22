package TestQuestNeoFlex.demo.Controller;

import TestQuestNeoFlex.demo.dto.AmountVacationPayDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${application.controllers.mapping}")
public interface ApiController {
    @GetMapping("/calculacte")
    AmountVacationPayDTO calculate(
            @RequestParam(value = "salary") float salary,
            @RequestParam(value = "vacationPay",  defaultValue = "20") int vacationPay);
}
