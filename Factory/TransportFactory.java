class TransportFactory{
    public static Transport getTransport(String s){
        if (s.equals("Car")){
            return new Car();
        }else if (s.equals("Plane")){
            return new Plane();
        }
        return null;
    }
}