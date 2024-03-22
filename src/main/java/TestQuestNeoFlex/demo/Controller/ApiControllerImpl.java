package TestQuestNeoFlex.demo.Controller;

import TestQuestNeoFlex.demo.dto.AmountVacationPayDTO;
import TestQuestNeoFlex.demo.services.CalculateAmountVacationPay;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApiControllerImpl implements ApiController{
    private final CalculateAmountVacationPay calculateAmountVacationPay;
    @Override
    public AmountVacationPayDTO calculate(float salary, int vacationPay) {
        return calculateAmountVacationPay.getAmountVacationPay(salary, vacationPay);
    }
}
