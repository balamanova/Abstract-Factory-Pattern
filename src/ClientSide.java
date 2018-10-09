
public class ClientSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory bob =FactoryProducer.getFactory("university");
		University it = bob.getUniversity("IITU");
		it.go();
		
		AbstractFactory bob2 = FactoryProducer.getFactory("major");
		Major is = bob2.getMajor("IS");
		is.study();
		
		AbstractFactory ann =FactoryProducer.getFactory("university");
		University sdu = bob.getUniversity("SDU");
		sdu.go();
		
		AbstractFactory ann2 = FactoryProducer.getFactory("major");
		Major jur = bob2.getMajor("JUR");
		jur.study();
	}

}
