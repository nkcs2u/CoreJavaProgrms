public class AustralianTraffic implements CentralTrafficInterface, ContinentTraffic{

    @Override
    public void greenGo(){
        System.out.println("Australia Green");
    }

    @Override
    public void redStop(){
        System.out.println("Australia red stop");
    }

    @Override
    public void flashYellow(){
        System.out.println("Australia Yellow");
    }

    @Override
    public void trainSymbol(){
        System.out.println("Continental traffic - Train symbol");
    }

}
