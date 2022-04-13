import java.util.GregorianCalendar;
import java.util.List;

public class Flight{
    private String flightNo;
    private GregorianCalendar departureTime;
    private GregorianCalendar arrivalTime;
    
    public Flight(String flightNo, GregorianCalendar departureTime, GregorianCalendar arrivalTime){
        this.flightNo = flightNo;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }
    public String getflightNo(){
        return flightNo;
    }
    public void setdepartureTime(GregorianCalendar departureTime){
        this.departureTime = departureTime;
    }
    public GregorianCalendar getdepartureTime(){
        return departureTime;
    }
    public void setarrivalTime(GregorianCalendar arrivalTime){
        this.arrivalTime = arrivalTime;
    }
    public GregorianCalendar getarrivalTime(){
        return arrivalTime;
    }
    public long getFlightTime(){
        return (long)(arrivalTime.getTimeInMillis() - departureTime.getTimeInMillis()) / 60000;
    }
}
class Itinerary{
    private List <Flight> flights;

    public Itinerary(List<Flight> flights){
        this.flights = flights;
    }
    public long getTotalTime(){
        return (flights.get(flights.size() - 1).getarrivalTime().getTimeInMillis() - flights.get(0).getdepartureTime().getTimeInMillis()) / 60000;
    }
    public long getTotalFlightTime(){
        long flightTime = 0;
        for (Flight F: flights){
            flightTime += F.getFlightTime();
        }
        return flightTime;
    }
}