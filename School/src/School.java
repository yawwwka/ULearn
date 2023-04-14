import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

public class School {
    //напишите класс School
    private List<Human> school = new ArrayList<>();

    public String getPeoplesInSchool() {
        List<Human> inSchool = new ArrayList<>(school);
        inSchool = inSchool.stream()
                .filter(Human::isInSchool)
                .collect(java.util.stream.Collectors.toList());
        /* реализуйте метод получения учителей и учеников в школе
           в формате:

           В школе:
           Игорь Николаев Математика 20
           Иван Иванов 2010
         */
        String inSch = "";
        for (Human each : inSchool){
            inSch += each.toString() + "\n";
        }
        return "В школе: \n" + inSch;
    }

    public void add(Human human) {
        school.add(human);
        //добавление человека в школу
    }
}
