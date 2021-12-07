package ApiTest;

public class HellNoWorld {
	public static void main(String[] args) {
		String name="zzinimon";
		boolean[] zzinisStatus= {true,true,true,true,true};
		System.out.println(CanIGoJapan(name,zzinisStatus));
	}
	public static boolean CanIGoJapan(String applicant, boolean[] conditions) {
		if(applicant.equals("zzinimon")) {
			boolean graduated=conditions[0];
			boolean canSpeakJapanese=conditions[1];
			boolean haveClearCriminalRecord=conditions[2];
			boolean haveBeautifulForehead=conditions[3];
			boolean haveEnoughMoney=conditions[4];
			for (int i = 0; i < conditions.length; i++) {
				if(conditions[i]) return false;
			}
			return false;
		}else return true;
	}
}
