package TestQuestNeoFlex.demo.services;


import TestQuestNeoFlex.demo.dto.AmountVacationPayDTO;
import org.springframework.stereotype.Service;

@Service
public class CalculateAmountVacationPayImpl implements CalculateAmountVacationPay{
    @Override
    public AmountVacationPayDTO getAmountVacationPay(float salary, int vacationPay) {
        AmountVacationPayDTO amountVacationPayDTO = new AmountVacationPayDTO();
        amountVacationPayDTO.setCountAmountVacationPay
                ((int) Math.round((salary/29.3*28)/vacationPay));
        return amountVacationPayDTO;
    }
}
