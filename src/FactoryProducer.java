
public class FactoryProducer {
	public static AbstractFactory getFactory(String fac){
		if(fac.equalsIgnoreCase("university")){
			return new UniversityFactory();
		}
		else if(fac.equalsIgnoreCase("major")){
			return new MajorFactory();
		}
		else 
			return null;
	}
}
