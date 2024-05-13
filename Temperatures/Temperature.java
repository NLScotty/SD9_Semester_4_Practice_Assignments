public class Temperature {
    double[] temperatures = null;

    public Temperature(double[] temperatures) {
        this.temperatures = temperatures;
    }

    public double calcAverage(){
        double totalSum = 0;
        for(int i = 0; i < temperatures.length; i++){
            totalSum = totalSum + temperatures[i];
        }
        return totalSum / temperatures.length;
    }

    public int countGreaterThan(double number){
        int count = 0;
        for(int i = 0; i < temperatures.length; i++){
            if(temperatures[i]>number){
                count++;
            }
        }
        return count;
    }

    public int countGreaterThanAverage(){
        double average = this.calcAverage();
        int count = 0;
        for(int i = 0; i < temperatures.length; i++){
            if(temperatures[i]>average){
                count++;
            }
        }
        return count;
    }
}