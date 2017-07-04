/**
 * Created by tylerlaskey on 7/3/17.
 */
public class Constants {
    public enum Ship
    {
        Dead_Avenger("AEGS_Avenger_Dead.json"),
        Avenger_stalker("AEGS_Avenger_Stalker.json"),
        Avenger_Titan("AEGS_Avenger_Titan.json"),
        Avenger_Renegade("AEGS_Avenger_Titan_Renegade.json"),
        Avenger_Warlock("AEGS_Avenger_Warlock.json");

        private final String name;
        Ship(String name){ this.name = name; }
        public String stringValue() { return name; }
    }

}
