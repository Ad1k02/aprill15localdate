import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Date;

public class Main {

    /*Прочитать теорию.
1. Объявить LocalDate 28.09.2009 15:45:15
2.Найти какой это день недели.
3. Найти какой это по счету день в году
4.Найти номер недели в месяце
5.Найти день недели

6.Вывести номер месяца года*/
    static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    public static void main(String[] args){;

    //Date LocalDate = new Date(2009,9, 28,15, 45, 15); // 28 september 2009, 15:45:15
    LocalDate date = LocalDate.of(2009, 9, 28);
    String dayofweek = date.getDayOfWeek().toString();
    int dayofYear = date.getDayOfYear();
    int monthofYear = date.getMonthValue();
    int weekofmonth = date.get(WeekFields.ISO.weekOfMonth());
    System.out.println(" Date of Year  = " + date.format(FORMATTER));
    System.out.println(" Num of week   = " + dayofweek);
    System.out.println(" Day of Year   = " + dayofYear);
    System.out.println(" Week of Month = " + weekofmonth);
    System.out.println(" Month of Year = " + monthofYear);


     }
}
