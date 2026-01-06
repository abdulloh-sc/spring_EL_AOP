package uz.pdp;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ToString
@PropertySource("classpath:application.properties")
public class User {
    @Value("#{'John'.toLowerCase()}")
    private String firstName;

    @Value("#{'Doe'.toUpperCase()}")
    private String lastName;

    @Value("#{'johnbekkk'.toUpperCase()}")
    private String username;

    @Value("${user.company}")
    private String company;

    @Value("${user.experience:12}") // default qiymat // 12 app.properties faylda qiymat bo'lmasa
    private Integer experience;

    @Value("#{{1,2,3,4,5,6}}")
    private List<Integer> numbers;

    @Value("#{3 > 5 ? 'kotta' : 'kichik'}")
    private String ternaryExample;

//    # <- qandaydir amallar bajarish uchun ishlatiladi     @Value("#{'johnbekkk'.toUpperCase()}")
//    $ <- application.properties filedagi qiymatni oladi     @Value("${user.company}")
}
