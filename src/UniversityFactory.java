
public class UniversityFactory extends AbstractFactory {

	@Override
	University getUniversity(String uni) {
		// TODO Auto-generated method stub
		if(uni.equalsIgnoreCase("IITU")){
			return new IITU();
		}
		else if(uni.equalsIgnoreCase("SDU")){
			return new SDU();
		}
		else if(uni.equalsIgnoreCase("kbtu")){
			return new KBTU();
		}
		else
		return null;
	}

	@Override
	Major getMajor(String major) {
		// TODO Auto-generated method stub
		return null;
	}



}
