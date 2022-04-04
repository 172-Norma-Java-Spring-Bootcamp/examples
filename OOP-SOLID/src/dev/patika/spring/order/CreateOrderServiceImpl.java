package dev.patika.spring.order;


public class CreateOrderServiceImpl implements CreateOrderService {

    CustomerBalanceChecker customerBalanceChecker = new NoCustomerBalanceChecker();


    @Override
    public void create() {
        // Siparişi kontrol et
        // Siparişin ürünlerini kontrol
        // Discount uygula
       /** Customer customer = new Customer();
        // T0 -> Müşterinin bakiyesi 100 TL'den büyük olmalı, değilse sipariş alamaz. ( PATRON )
        //V1
        if (customer.getBalance() <= 100) {
            throw new RuntimeException("Müşterinin bakiyesi 100'lten büyük olmnalı");
        }
        customerBalanceChecker.check(customer);
        // T1 ->  Müşterinin bakiyesi 0 bile olsa alınabilir ( CEO )
        //V2
        if (customer.getBalance() < 0) {
            throw new RuntimeException("Müşterinin bakiyesi 0'küçük olamaz";
        }
        // T2 -> Müşterinin bakiyesi negatif olsa bile sipariş alınabilir ( Last Ceo )

        //V3
        if (customer.getBalance() < 0) {
            throw new RuntimeException("Müşterinin bakiyesi 0'küçük olamaz")
        }**/


    }
}
