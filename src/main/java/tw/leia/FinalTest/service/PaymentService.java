package tw.leia.FinalTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tw.leia.FinalTest.dto.orders.MerchantByUserDto;
import tw.leia.FinalTest.model.Pay;
import tw.leia.FinalTest.model.Payment;
import tw.leia.FinalTest.repository.PaymentRepository;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;


    public List<String> findAllPayments(Long userId) {
       List<String> paymentList = paymentRepository.findMerchantNoByUsersUserId(userId);
        return paymentList;
    }
}
