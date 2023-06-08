import com.airport.Aircraft;
import com.airport.Airport;
import com.airport.Flight;
import com.airport.Terminal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.airport.Flight.Type.DEPARTURE;

public class Main {
    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        //TODO используя библиотеку Airport и Stream API, найдите самолеты вылетающие в ближайшие два часа
        List<Flight> planes = new ArrayList<>();
        List<Terminal> terminals = airport.getTerminals();
//        List<Integer> flights = terminals.forEach(Terminal::getFlights -> flights.add(123));

        return planes;
    }
}