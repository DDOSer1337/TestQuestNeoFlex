package TestQuestNeoFlex.demo.services;

import TestQuestNeoFlex.demo.dto.AmountVacationPayDTO;

public interface CalculateAmountVacationPay {
    AmountVacationPayDTO getAmountVacationPay(float salary, int vacationPay);

}
