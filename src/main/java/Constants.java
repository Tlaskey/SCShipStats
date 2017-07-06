/**
 * Created by tylerlaskey on 7/3/17.
 */
public class Constants {
    public enum Ship
    {
        //AEGS
        Dead_Avenger("AEGS_Avenger_Dead.json"),
        Avenger_stalker("AEGS_Avenger_Stalker.json"),
        Avenger_Titan("AEGS_Avenger_Titan.json"),
        Avenger_Renegade("AEGS_Avenger_Titan_Renegade.json"),
        Avenger_Warlock("AEGS_Avenger_Warlock.json"),
        Gladius("AEGS_Gladius.json"),
        Gladius_Valiant("AEGS_Gladius_Valiant.json"),
        Idris("AEGS_Idris.json"),
        Javelin("AEGS_Javelin.json"),
        Redeemer("AEGS_Redeemer.json"),
        Retaliator("AEGS_Retaliator.json"),
        Sabre("AEGS_Sabre.json"),
        Vanguard("AEGS_Vanguard.json"),

        //ANVL
        Gladiator("ANVL_Gladiator.json"),
        Hornet_F7A("ANVL_Hornet_F7A.json"),
        Hornet_F7C("ANVL_Hornet_F7C.json"),
        Hornet_F7CM("ANVL_Hornet_F7CM.json"),
        Hornet_F7CR("ANVL_Hornet_F7CR.json"),
        Hornet_F7CS("ANVL_Hornet_F7CS.json"),
        Hornet_F7C_Wildfire("ANVL_Hornet_F7C_Wildfire.json"),
        F8_Lightning("ANVL_Lightning_F8.json"),

        //ARGO
        MPUV("ARGO_MPUV.json"),

        //CNOU
        Mustang_Alpha("CNOU_Mustang_Alpha.json"),
        Mustang_Beta("CNOU_Mustang_Beta.json"),
        Mustang_Delta("CNOU_Mustang_Delta.json"),
        Mustang_Gamma("CNOU_Mustang_Gamma.json"),
        Mustang_Omega("CNOU_Mustang_Omega.json"),

        //DRAK
        Buccaneer("DRAK_Buccaneer.json"),
        Caterpillar("DRAK_Caterpillar.json"),
        Cutlass_Black("DRAK_Cutlass_Black.json"),
        Cutlass_Blue("DRAK_Cutlass_Blue.json"),
        Cutlass_Red("DRAK_Cutlass_Red.json"),
        Dragonfly("DRAK_Dragonfly.json"),
        Herald("DRAK_Herald.json"),

        //GRIN
        Cydnus("GRIN_Cydnus.json"),
        PTV("GRIN_PTV.json"),

        //KRIG
        P52_Merlin("KRIG_P52_Merlin.json"),

        //MISC
        Freelancer("MISC_Freelancer.json"),
        Prospector("MISC_Prospector.json"),
        Reliant("MISC_Reliant.json"),
        Starfarer("MISC_Starfarer.json"),

        //MITE
        SimPod("MITE_SimPod.json"),

        //Orig
        Orig_600i("ORIG_300i.json"),
        Orig_315p("ORIG_315p.json"),
        Orig_325a("ORIG_325a.json"),
        Orig_350r("ORIG_350r.json"),
        Orig_85X("ORIG_85X.json"),
        Orig_M50("ORIG_m50.json"),

        //RSI
        Aurora_CL("RSI_Aurora_CL.json"),
        Aurora_ES("RSI_Aurora_ES.json"),
        Aurora_LN("RSI_Aurora_LN.json"),
        Aurora_LX("RSI_Aurora_LX.json"),
        Aurora_MR("RSI_Aurora_MR.json"),
        Bengal("RSI_Bengal.json"),
        Constellation_Andromeda("RSI_Constellation_Andromeda.json"),
        Constellation_Aquila("RSI_Constellation_Aquila.json"),
        Constellation_Pheonix("RSI_Constellation_Phoenix.json"),
        Constellation_Taurus("RSI_Constellation_Taurus.json"),
        Ursa_Rover("RSI_Ursa_Rover.json");

        private final String name;
        Ship(String name){ this.name = name; }
        public String stringValue() { return name; }
    }

}
