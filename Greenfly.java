//Aaron Amankwaah
// Green fly problem

public class Greenfly{
    public static void main(String[] args) {

        int populationOf1Gen = 0, populationOf2Gen= populationOf1Gen, days = 19, weeks = days /7, extraDays= days%7;
        for (int w = 1; w <= days; w++){
            populationOf1Gen= (int) Math.pow(8, ((w - 1) / 7) + 1);
            // if (w==1){
            //     for (int i = 1; i <= 7; i++){
            //         // populationOf1Gen +=  i*greenflyPopulationG1(i);
            //         populationOf1Gen +=  i*8;
            //     }
            //     System.out.println( "The population of Generation 1 is: "+ populationOf1Gen );
            // }else
            // if (w==2){
            //     populationOf2Gen= greenflyPopulationG1(7);
            //     System.out.println( "The population of Generation 1 7 days is: "+ greenflyPopulationG1(7) );
                
            //     for (int i = 1; i <= 7; i++){
            //         // populationOf2Gen +=  i*8*greenflyPopulationG1(i);
            //         populationOf2Gen +=  (int) Math.pow(8, ((i - 1) / 7) + 1);
            //     }
                System.out.println( "The population of Generation 1 is: "+ populationOf2Gen );
            // }else
            // if (w=3){
            //     for (int i = 1; i <= days; i++){
            //         populationOf1Gen +=  greenflyPopulation(i);
            //     }
            // }else
            // if (w=4){
            //     for (int i = 1; i <= days; i++){
            //         populationOf1Gen +=  greenflyPopulation(i);
            //     }
            // }else
            // for (int i = 1; i <= days; i++){
            //         populationOf1Gen +=  greenflyPopulation(i);
            // }
            // }
        }
        System.out.println( "The population of Generation 1 is: "+ populationOf1Gen );
    }
    public static int greenflyPopulationG1(int days){
        if (days == 0)
            return (8);//
        else
            return greenflyPopulationG1(days-1);
    }
    public static int greenflyPopulationG2(int days){
        if (days == 0)
            return (8*8);//
        else
            return greenflyPopulationG2(days-1);
    }
}