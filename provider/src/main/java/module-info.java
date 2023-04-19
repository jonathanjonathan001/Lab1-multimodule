import org.example.provider.SpanishGreeting;
import org.example.provider.SwedishGreeting;
import org.example.provider.EnglishGreeting;
import org.example.provider.GermanGreeting;
import org.example.service.Greeting;


module org.example.provider {
    requires org.example.service;
    opens org.example.provider;
    provides Greeting with SwedishGreeting, EnglishGreeting, GermanGreeting, SpanishGreeting;

}
