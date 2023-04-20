import org.example.provider.*;
import org.example.service.CurrencyConverter;



module org.example.provider {
    requires org.example.service;
    opens org.example.provider;
    provides CurrencyConverter with DollarToSekConverter, SekToDollarConverter;
}
