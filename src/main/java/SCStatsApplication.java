import java.util.ArrayList;
import java.util.EnumSet;

public class SCStatsApplication {
    public static void main(String[] args)
    {
        ArrayList<Constants.Ship> enumValues = new ArrayList<Constants.Ship>(EnumSet.allOf(Constants.Ship.class));
        RequestPayload request = new RequestPayload();
        for(Constants.Ship ship : enumValues)
        {
            try
            {
                request.run(ship);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
