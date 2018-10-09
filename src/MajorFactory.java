
public class MajorFactory extends AbstractFactory {

	@Override
	University getUniversity(String uni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Major getMajor(String major) {
		// TODO Auto-generated method stub
		 if(major.equalsIgnoreCase("JUR")){
			return new Journalism();
		}
		else if(major.equalsIgnoreCase("IS")){
			return new InformationSystem();
		}
		else
			return null;
	}


}
